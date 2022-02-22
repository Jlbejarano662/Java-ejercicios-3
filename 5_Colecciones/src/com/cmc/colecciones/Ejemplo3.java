package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo3 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		
		lista.add("xxx");
		listaPersona.add(new Persona ("A", 12));
		
		//La frima del método cambia de acuerdo al tipo de dato que recibe
		
		String a = lista.get(0);
		Persona p = listaPersona.get(0);
	}

	
}
