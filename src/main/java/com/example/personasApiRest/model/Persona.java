package com.example.personasApiRest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "apellido", nullable = false)
  private String apellido;
  
  @Column(name = "nombre", nullable = false)
  private String nombre;

  @Column(name = "sueldo")
  private Float sueldo;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Float getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}	
  
}
