package com.wslourenco.curso.boot.dao;

import java.util.List;

import com.wslourenco.curso.boot.domain.Departamento;

public interface DepartamentoDao {

	void save(Departamento Departamento);
	
	void update(Departamento Departamento);

	void delete(Long id);

	Departamento findById(Long id);
	
	List<Departamento> findAll();

}
