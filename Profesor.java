package com.utn.vista;

public class Profesor extends Persona {

	private int padron;

	Profesor(String nombre, String apellidoPersona, int dni, int padron) {
		super(nombre, apellidoPersona, dni);
		this.padron = padron;

	}

	@Override
	public String toString() {
		return "Profesor [padron=" + padron + ", " + super.toString() + "]";
	}

	

}
