package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {
	
	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "09941234123", 10);
		System.out.println("Operadora: " + telf.getOperadora());
		System.out.println("N�mero: " + telf.getNumero());
		System.out.println("C�digo: " + telf.getCodigo());
		System.out.println("Tiene WhatsApp: " + telf.isTieneWhatsapp());
	}
}
