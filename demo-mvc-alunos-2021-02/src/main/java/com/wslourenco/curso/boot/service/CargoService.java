package com.wslourenco.curso.boot.service;

import java.util.List;

import com.wslourenco.curso.boot.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);

	void editar(Cargo cargo);

	void excluir(Long id);
	
	void buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

}
