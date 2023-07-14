package com.fabx.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Time;

public class RepositoryTime {

	@Inject
	private EntityManager manager;
	
	public void inserir(Time time) {
		manager.persist(time);
	}
	
	public List<Time> getTimes(){
		return manager.createQuery("SELECT t FROM Time t", Time.class).getResultList();
	}
	
}
