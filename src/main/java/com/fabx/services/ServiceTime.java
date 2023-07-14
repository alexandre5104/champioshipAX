package com.fabx.services;

import java.util.List;

import javax.inject.Inject;

import com.fabx.model.Time;
import com.fabx.repository.RepositoryTime;
import com.fabx.util.Transactional;

public class ServiceTime {

	@Inject
	private RepositoryTime repositoryTime;
	
	@Transactional
	public void inserir(Time time) {
		repositoryTime.inserir(time);
	}
	
	public List<Time> getTimes(){
		return repositoryTime.getTimes();
	}
	
}
