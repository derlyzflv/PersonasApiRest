package com.example.personasApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personasApiRest.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
