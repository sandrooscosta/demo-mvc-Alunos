package com.wslourenco.curso.boot.service;

import java.util.List;

import com.wslourenco.curso.boot.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void excluir(Long id);
	
	void buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();

	
}
