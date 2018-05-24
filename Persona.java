package com.utn.vista;

public class Persona {

	private String nombre;
	private String apellidoPersona;
	private int dni;
	
	Persona (String nombre, String apellidoPersona, int dni){ //constructor :3
		this.nombre =nombre;
		this.apellidoPersona= apellidoPersona;
		this.dni=dni;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidoPersona=" + apellidoPersona + ", dni=" + dni + "]";
	}
	

}
