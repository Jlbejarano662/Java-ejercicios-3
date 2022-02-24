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
			/* Se entra cuando ocurre la excepci�n
			 * evita que el programa se caiga cuando 
			 * ocurren excepciones
			*/
			System.out.println("entra al catch");
		} finally {
			/* Se entra ocurra o no la excepci�n
			 * se utilizan pra cosas donde si o s� se 
			 * debe ejecutar el c�digo, ejemplo:
			 * cerrar conexi�n a bases de datos
			*/
			System.out.println("Entra al finally");
		}
		System.out.println("fin");
	}
}
