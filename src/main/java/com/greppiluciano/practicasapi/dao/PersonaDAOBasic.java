package com.greppiluciano.practicasapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greppiluciano.practicasapi.model.Persona;

public interface PersonaDAOBasic extends JpaRepository<Persona, Integer> {
	
    @Query("SELECT p.nombre FROM Persona p")
    List<Object> getNombre();

    @Query("SELECT p.apellido FROM Persona p")
    List<Object> getApellido();

    @Query("SELECT p.edad FROM Persona p")
    List<Object> getEdad();
    
}
