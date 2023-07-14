package com.fabx.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Campeonato;

public class RepositoryCampeonato {

	@Inject
	private EntityManager manager;
	
	public void inserir(Campeonato campeonato) {
		manager.persist(campeonato);
	}
	
	public List<Campeonato> getCampeonatos(){
		return manager.createQuery("SELECT c FROM Campeonato c", Campeonato.class).getResultList();
	}
	
}
