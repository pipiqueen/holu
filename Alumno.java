package com.utn.vista;

public class Alumno extends Persona {
	int legajo;

	Alumno(String nombre, String apellidoPersona, int dni, int legajo) {
		super(nombre, apellidoPersona, dni);
		this.legajo = legajo;

	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + "," + super.toString() + "]";
	}

}
