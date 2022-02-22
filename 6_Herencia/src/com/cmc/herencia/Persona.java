package com.cmc.herencia;

public class Persona {

	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		super(); // accede al método constructor del padre, aunque no se ponga
					// existe, porque es una llamada implicita
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	/*
	 * public String toString() { return "nombre:" + nombre + " apellidos: " +
	 * apellido; }
	 */

}
