package com.cmc.excepciones;

import java.io.File;
/* Podemos encontrar dos tipos de excepciones:
 *  - Checked: se requieren cuando se est� escribiendo el c�digo (la novia t�xica).
 *  - Unchecked: nunca exige nada (es como el vacile).
 *  */
public class Ejercicio2 {

	public static void main(String[] args) {
		File file = new File("archivot.txt");
		file.createNewFile(); //Checked

	}

}
