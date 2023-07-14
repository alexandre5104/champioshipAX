package com.fabx.services;

import java.util.List;

import javax.inject.Inject;

import com.fabx.model.Campeonato;
import com.fabx.repository.RepositoryCampeonato;
import com.fabx.util.Transactional;

public class ServiceCampeonato {

	@Inject
	private RepositoryCampeonato repositoryCampeonato;
	
	@Transactional
	public void inserir(Campeonato campeonato) {
		repositoryCampeonato.inserir(campeonato);
	}
	
	public List<Campeonato> getCampeonatos(){
		return repositoryCampeonato.getCampeonatos();
	}
	
}
