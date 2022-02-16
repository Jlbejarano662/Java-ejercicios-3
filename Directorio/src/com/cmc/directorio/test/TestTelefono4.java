package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "098234234", 20);
		Telefono telf2 = new Telefono("movi", "345", 10);
		Telefono telf3 = new Telefono("claro", "02772", 50);
		Telefono telf4 = new Telefono("claro", "0865", 40);
		AdminTelefono at = new AdminTelefono();
		int claro = at.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println(claro);
	}

}
