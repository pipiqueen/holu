package com.utn.vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Datos {

	public static void main(String[] args) {

		String numeroPersona = JOptionPane.showInputDialog("ingrese el numero de personas que desea ingresar > w O ");
		int personaInteger = Integer.parseInt(numeroPersona);

		ArrayList<Persona> personitas = new ArrayList<Persona>();

		for (int i = 0; i < personaInteger; i++) {
			String condicion = JOptionPane.showInputDialog("ingrese que tipo de persona quiere ingresar (alumno, profesor o persona)");
			String primernombre = JOptionPane.showInputDialog("cual es el nombre de la persona :D");
			String segundonombre = JOptionPane.showInputDialog("cual es su apellido???? uguuuu");
			int numerito = Integer.parseInt(JOptionPane.showInputDialog("Y el numero de dni :3"));

			if (condicion.equals("alumno")) {

				int legajo = Integer.parseInt(JOptionPane.showInputDialog("y tu tarjeta, digo, numero de legajo!"));
				
				personitas.add(new Alumno(primernombre, segundonombre, numerito, legajo));
			} else if (condicion.equals("profesor")) {

				int padron = Integer.parseInt(JOptionPane.showInputDialog("y vuestro numero de padron"));
				
				personitas.add(new Profesor(primernombre, segundonombre, numerito, padron));
			
			} else if (condicion.equals("persona")) {

				personitas.add(new Persona(primernombre, segundonombre, numerito));
			}

		}
		
		for (int i = 0; i < personaInteger; i++) {
			
			JOptionPane.showMessageDialog(null, personitas.get(i).toString(), null, JOptionPane.WARNING_MESSAGE);
		}
	}
}
