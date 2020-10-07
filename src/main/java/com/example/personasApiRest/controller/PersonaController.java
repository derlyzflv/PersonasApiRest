package com.example.personasApiRest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.personasApiRest.model.Persona;
import com.example.personasApiRest.service.PersonaService;

@Controller
@RequestMapping("/api/users")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	// Create a new person
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Persona persona){
		return  ResponseEntity.status(HttpStatus.CREATED).body(personaService.save(persona));
		
	}
	
	// Read an person
	@GetMapping("/{id}")
	public ResponseEntity<?> read (@PathVariable(value = "id") Long userId){
		Optional<Persona> oPersona = personaService.findByID(userId);
		
		if (!oPersona.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oPersona);
	}
}
