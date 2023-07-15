package com.fabx.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Jogador;
import com.fabx.model.Time;

public class RepositoryJogador {

	@Inject
	private EntityManager manager;
	
	public void inserir(Jogador jogador, Integer time_id) {
		Time time = manager.find(Time.class, time_id);
		jogador.setTime(time);
		manager.persist(jogador);
	}
	
}
