package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante("Ronal");
		estudiante.calificar(5);
		String resultado = estudiante.getResultado();
		System.out.println(resultado);
		
		Estudiante estudiante2 = new Estudiante("Armando");
		estudiante2.calificar(8);
		String resultado2 = estudiante2.getResultado();
		System.out.println(resultado2);
		
	}

}
