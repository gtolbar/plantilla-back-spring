package com.BackSpring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackSpring.model.Persona;
import com.BackSpring.repo.IGenericRepo;
import com.BackSpring.repo.IPersonaRepo;
import com.BackSpring.service.IPersonaService;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	protected IGenericRepo<Persona, Integer> getRepo() {
		return repo;
	}

}
