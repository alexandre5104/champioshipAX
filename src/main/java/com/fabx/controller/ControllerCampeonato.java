package com.fabx.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.fabx.model.Campeonato;
import com.fabx.services.ServiceCampeonato;

@Named
@RequestScoped
public class ControllerCampeonato {

	@Inject
	private ServiceCampeonato serviceCampeonato;
	
	private Campeonato campeonato = new Campeonato();

	public void inserir() {
		serviceCampeonato.inserir(campeonato);
	} 

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

}
