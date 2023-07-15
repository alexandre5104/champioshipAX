package com.fabx.services;

import javax.inject.Inject;

import com.fabx.model.Jogador;
import com.fabx.repository.RepositoryJogador;

public class ServiceJogador {

	@Inject
	private RepositoryJogador repositoryJogador;
	
	public void inserir(Jogador jogador, Integer time_id) {
		repositoryJogador.inserir(jogador, time_id);
	}
}
