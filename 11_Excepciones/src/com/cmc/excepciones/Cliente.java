package com.cmc.excepciones;

public class Cliente {

	/* Busca en la bse de datos el cliente con la cédula
	 * que recibe como parámetro. Si existe el cliente 
	 * retorna sus datosen el Objeto cliente, caso
	 * contrario retorna null.
	 * Si hay algún promblema con la conexion lanza Exception.
	 * */
	
	/* Exception es la mamá de todas las excepciones. las hijas 
	 * Unchecked más conocidas son:
	 *   - RuntimeException (Unchecked) y sus hijas NullPointerException, 
	 *   	ArrayIndexOutBoundsException, ClassCastException ...
	 * */
	public Cliente buscar(String cedula) throws Exception {
		
	}
}
