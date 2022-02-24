package com.cmc.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {

	public void metodo1() {
		File file = new File("archivot.txt");
		try {
			file.createNewFile(); //Checked
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	
	public void metodo2() throws IOException {
		File file = new File("archivot.txt");
		file.createNewFile(); //Checked
	}
	
	public void metodo3() {
		metodo2(); //no se ha resuelto la excepción
	}
}
