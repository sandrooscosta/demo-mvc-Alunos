package com.wslourenco.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.wslourenco.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
