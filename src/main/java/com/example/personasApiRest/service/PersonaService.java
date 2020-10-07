package com.example.personasApiRest.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.personasApiRest.model.Persona;

public interface PersonaService {

	public Iterable<Persona> findAll();
	
	public Page<Persona> findAll(Pageable pageable);
	
	public Optional<Persona> findByID(Long id);
	
	public Persona save(Persona persona);
	
	public void deleteById(Long id);
}
