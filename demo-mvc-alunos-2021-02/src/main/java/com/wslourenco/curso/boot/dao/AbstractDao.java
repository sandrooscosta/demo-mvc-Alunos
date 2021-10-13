package com.wslourenco.curso.boot.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class AbstractDao<T, PK extends Serializable> {

	@SuppressWarnings("unchecked")
	private final Class<T> entityClass = 
		(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	protected EntityManager getEntityManager() {
		return entitymanager;
	}
	
	public void save(T entity) {
		entitymanager.persist(entity);
	}
	
	public void update(T entity) {
		entitymanager.merge(entity);
	}
	
	public void delete(PK id) {
		entitymanager.remove(entitymanager.getReference(entityClass, id));
	}
	
	public T findById(PK id) {
		return entitymanager.find(entityClass, id);
	}
	
	public List<T> findAll(){
		return entitymanager
				.createQuery("from " + entityClass.getSimpleName(), entityClass)
				.getResultList();
	}
	
	protected List<T> createQuery(String jpsql, Object... params){
		
		TypedQuery<T> query = entitymanager.createQuery(jpsql, entityClass);
		
		for(int i = 0; i < params.length; i++) {
			query.setParameter(i+1, params[i]);
		}
		return query.getResultList();
	}
}
