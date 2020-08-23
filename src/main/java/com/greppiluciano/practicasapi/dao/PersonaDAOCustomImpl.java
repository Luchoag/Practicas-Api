package com.greppiluciano.practicasapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greppiluciano.practicasapi.model.Persona;

@Repository
@Transactional(readOnly = true)
public class PersonaDAOCustomImpl implements PersonaDAOCustom{

	private final PersonaDAOBasic personaDAOBasic;
	
    @PersistenceContext
    EntityManager entityManager;
	
	public PersonaDAOCustomImpl(PersonaDAOBasic personaDAOBasic) {
		this.personaDAOBasic = personaDAOBasic;
	}

}
