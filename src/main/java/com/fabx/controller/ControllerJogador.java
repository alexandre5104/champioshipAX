package com.fabx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.fabx.model.Jogador;
import com.fabx.model.Time;
import com.fabx.services.ServiceJogador;
import com.fabx.services.ServiceTime;

@Named
@RequestScoped
public class ControllerJogador {

	@Inject
	private ServiceJogador serviceJogador;
	
	@Inject
	private ServiceTime serviceTime;
	
	private Jogador jogador = new Jogador();
	
	private Integer time_id;
	
	private List<Time> times = new ArrayList<Time>();
	
	@PostConstruct
	public void init() {
		times = serviceTime.getTimes();
	}
	
	public void inserir() {
		serviceJogador.inserir(jogador, time_id);
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public Integer getTime_id() {
		return time_id;
	}

	public void setTime_id(Integer time_id) {
		this.time_id = time_id;
	}

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}
	
}
