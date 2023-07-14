package com.fabx.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Campeonato;

public class RepositoryCampeonato {

	@Inject
	private EntityManager manager;
	
	public void inserir(Campeonato campeonato) {
		manager.persist(campeonato);
	}
	
}
