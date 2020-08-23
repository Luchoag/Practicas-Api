package com.greppiluciano.practicasapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greppiluciano.practicasapi.dao.PersonaDAO;
import com.greppiluciano.practicasapi.model.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {

	@Autowired
	private PersonaDAO personaDAO;
	
	//MÉTODOS HTTP - SOLICITUD AL SERVIDOR
	/*
	 * Estado 200 (se realizó correctamente)
	 * Estado 505 (falla en la lógica de programación)
	 * Estado 404 (ruta mal especificada)
	 */
	
	//POST
	@PostMapping("/guardar") 	//localhost:8080/personas/guardar
	public void guardar(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
	//GET
	@GetMapping("/listar")		//localhost:8080/personas/listar
	public List<Persona> listar() {
		return personaDAO.findAll();
	}
	
	//DELETE
	@DeleteMapping("/eliminar/{id}")	//localhost:8080/personas/eliminar
	public void eliminar(@PathVariable("id") Integer id) {
		personaDAO.deleteById(id);
	}
	
	//PUT
	@PutMapping("/actualizar")
	public void actualizar (@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
	
	@ResponseBody
	@RequestMapping("/nombre")
	public List<Object> apellidos () {
	    List<Object> listaNombreCompleto = personaDAO.getNombreCompleto();
	    return listaNombreCompleto;
	}
	
	
}
