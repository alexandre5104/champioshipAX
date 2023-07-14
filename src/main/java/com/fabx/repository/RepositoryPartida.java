package com.fabx.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Campeonato;
import com.fabx.model.Partida;
import com.fabx.model.Time;

public class RepositoryPartida {

	@Inject
	private EntityManager manager;

	public void inserir(Partida partida, Integer visitante_id, Integer mandante_id, Integer campeonato_id){
		Time visitante = manager.find(Time.class, visitante_id);
		Time mandante = manager.find(Time.class, mandante_id);
		Campeonato campeonato = manager.find(Campeonato.class, campeonato_id);
		partida.setCampeonato(campeonato);
		partida.setMandante(mandante);
		partida.setVisitante(visitante);
		manager.persist(partida);
	}

}
