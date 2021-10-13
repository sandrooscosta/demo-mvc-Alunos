package com.wslourenco.curso.boot.service;

import java.util.List;

import com.wslourenco.curso.boot.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);
	
	void buscarPorId(Long id);
	
	List<Departamento> buscarTodos();
	
}
