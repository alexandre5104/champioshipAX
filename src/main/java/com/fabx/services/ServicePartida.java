package com.fabx.services;

import javax.inject.Inject;

import com.fabx.model.Partida;
import com.fabx.repository.RepositoryPartida;
import com.fabx.util.Transactional;

public class ServicePartida {

	@Inject
	private RepositoryPartida repositoryPartida;
	
	@Transactional
	public void inserir(Partida partida, Integer visitante_id, Integer mandante_id, Integer campeonato_id){
		repositoryPartida.inserir(partida, visitante_id, mandante_id, campeonato_id);
	}
}
