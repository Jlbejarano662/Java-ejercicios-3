package com.cmc.flujo.test;

import com.cmc.flujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador = new Validador();
		validador.validarEdad(18);
		
		//String msg = validador.validarEdadMsg(5);
		//System.out.println(msg);
		
		//boolean resultado = validador.esMayorDeEdad(18);
		//System.out.println(resultado);
	}

}
