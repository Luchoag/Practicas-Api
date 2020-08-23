package com.greppiluciano.practicasapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greppiluciano.practicasapi.model.Persona;

public interface PersonaDAOBasic extends JpaRepository<Persona, Integer> {
	
    @Query("SELECT p.nombre, p.apellido FROM Persona p")
    List<Object> getNombreCompleto();

}
