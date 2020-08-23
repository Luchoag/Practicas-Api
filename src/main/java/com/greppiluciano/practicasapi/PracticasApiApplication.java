/*
 * @Luciano Greppi
 * Agosto 2020
 * 
 * Proyecto realizado con el fin de reforzar conocimientos sobre la creación de API REST. <br>
 * El tutorial usado para modelar el proyecto puede encontrarse en: https://youtu.be/jO-o3qQZDuU <br>
 * Adicionalmente, se han agregado métodos con funcionalidad propia que realizan consultas SQL personalizadas y son capturadas por el RESTController.<br>
 * Las consultas que pueden realizarse a través de la API son las cuatro básicas de todo CRUD (leer, insertar, actualizar y eliminar) mediante los métodos GET, POST, PUT y DELETE,
 * y se añadieron además dos métodos propios que leen cada columna de la tabla por separado.
 * Las tecnologías utilizadas en el proyecto son: Java Spring Boot, JPA y MySQL. El IDE utilizado fue Spring Tool Suite 3.9.6.
 * 
 */


package com.greppiluciano.practicasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticasApiApplication.class, args);
	}

}
