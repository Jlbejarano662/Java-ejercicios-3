package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "098234234", 20);
		Telefono telf2 = new Telefono("claro", "345", 10);
		Telefono telf3 = new Telefono("claro", "02772", 50);
		AdminTelefono at = new AdminTelefono();
		int movi = at.contarMovi(telf1, telf2, telf3);
		System.out.println(movi);
	}

}
