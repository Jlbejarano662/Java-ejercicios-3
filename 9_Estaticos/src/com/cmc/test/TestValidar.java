package com.cmc.test;

import com.cmc.estaticos.Util;

public class TestValidar {

	public static void main(String[] args) {
		Util util = new Util();
		boolean res = util.validarRango(5);
		System.out.println(res);
		
		res = Util.validarPositivo(5);
		System.out.println(res);
		
		//Ejemplos de métodos estáticos 
		
		double d = Math.random();
		System.out.println(d);
		
		int valor = Integer.parseInt("32");
		System.out.println(valor);
		
	}
	
}
