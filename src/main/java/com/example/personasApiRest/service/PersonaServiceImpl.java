package com.example.personasApiRest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.personasApiRest.model.Persona;
import com.example.personasApiRest.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> findAll() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Persona> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return personaRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> findByID(Long id) {
		// TODO Auto-generated method stub
		return personaRepository.findById(id);
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personaRepository.deleteById(id);
	}

}
