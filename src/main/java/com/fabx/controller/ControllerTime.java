package com.fabx.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.fabx.model.Time;
import com.fabx.services.ServiceTime;

@Named
@RequestScoped
public class ControllerTime {

	@Inject
	private ServiceTime serviceTime;
	
	private Time time = new Time();

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public void inserir() {
		serviceTime.inserir(time);
	} 

}
