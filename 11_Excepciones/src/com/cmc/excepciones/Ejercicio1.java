package com.cmc.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		try {
			String a = null;
			//String a = "abcd";
			a.substring(1, 3);
			System.out.println("luego del substring");
		} catch (Exception e) {
			/* Se entra cuando ocurre la excepción
			 * evita que el programa se caiga cuando 
			 * ocurren excepciones
			*/
			System.out.println("entra al catch");
		} finally {
			/* Se entra ocurra o no la excepción
			 * se utilizan pra cosas donde si o sí se 
			 * debe ejecutar el código, ejemplo:
			 * cerrar conexión a bases de datos
			*/
			System.out.println("Entra al finally");
		}
		System.out.println("fin");
	}
}
