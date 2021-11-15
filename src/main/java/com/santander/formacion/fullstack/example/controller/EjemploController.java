package com.santander.formacion.fullstack.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EjemploController {

	@GetMapping("/hola")
	public ResponseEntity<String> saludo(@RequestParam("name") String name) {
		ResponseEntity<String> prueba = new ResponseEntity<String>("Hola " + name + "!", HttpStatus.OK);
		return prueba;
	}
}
