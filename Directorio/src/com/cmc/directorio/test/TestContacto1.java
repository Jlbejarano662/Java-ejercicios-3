package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "03222", 1);
		Contacto c = new Contacto("Armando", "Reyes", telef, 0.50);

		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println(
				"Telefono:  Número: " + c.getTelefono().getNumero() + " Operadora: " + c.getTelefono().getOperadora());
		System.out.println("Peso: " + c.getPeso());
	}

}
