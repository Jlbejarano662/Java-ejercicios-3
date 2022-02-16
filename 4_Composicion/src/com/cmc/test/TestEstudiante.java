package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {

		Estudiante est = new Estudiante ("12345", "Mario");
		//est.imprimir();
		Direccion d1 = new Direccion();
		d1.setCallePrincipal("Av. Siempre Viva");
		d1.setNumero("E24");
		d1.setCalleSecuandaria("la que cruza");
		est.setDireccion(d1);
		//est.imprimir();
		
		Estudiante est2 = new Estudiante("1233", "Pepe");
		est2.setDireccion(new Direccion("Shirys", "ABC", "24"));
		est2.imprimir();

	}

}
