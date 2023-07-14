package com.fabx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.fabx.model.Campeonato;
import com.fabx.model.Partida;
import com.fabx.model.Time;
import com.fabx.services.ServiceCampeonato;
import com.fabx.services.ServicePartida;
import com.fabx.services.ServiceTime;

@Named
@RequestScoped
public class ControllerPartida {

	
	@Inject
	private ServiceCampeonato ServiceCampeonato;
	
	@Inject
	private ServiceTime serviceTime;
	
	@Inject
	private ServicePartida servicePartida;
	
	private Integer visitante_id;
	
	private Integer campeonato_id;
	
	private Integer mandante_id;
	
	private Partida partida = new Partida();

	private List<Time> times = new ArrayList<Time>();
	
	private List<Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	@PostConstruct
	public void init() {
		times = serviceTime.getTimes();
		campeonatos = ServiceCampeonato.getCampeonatos();
	}
	
	public void inserir() {
		servicePartida.inserir(partida, visitante_id, mandante_id, campeonato_id);
	}

	public Integer getVisitante_id() {
		return visitante_id;
	}

	public void setVisitante_id(Integer visitante_id) {
		this.visitante_id = visitante_id;
	}

	public Integer getCampeonato_id() {
		return campeonato_id;
	}

	public void setCampeonato_id(Integer campeonato_id) {
		this.campeonato_id = campeonato_id;
	}

	public Integer getMandante_id() {
		return mandante_id;
	}

	public void setMandante_id(Integer mandante_id) {
		this.mandante_id = mandante_id;
	}

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	
}
