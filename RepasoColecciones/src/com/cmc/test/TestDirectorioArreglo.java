package com.cmc.test;


import com.cmc.colecciones.DirectorioArreglo;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestDirectorioArreglo {

	public static void main(String[] args) {
		DirectorioArreglo directorioArreglo = new DirectorioArreglo();
		
		System.out.println("__________________AGREGANDO CONTACTOS_____________________");
		directorioArreglo.agregarContacto(new Contacto("123", "probando", "wiii"));
		directorioArreglo.agregarContacto(new Contacto("456", "probando2", "wiii"));
		//directorioArreglo.agregarContacto(new Contacto("456", "probando2", "wiii"));
		directorioArreglo.imprimir();
		
		System.out.println("__________________AGREGANDO TELEFONOS_____________________");
		Contacto c = directorioArreglo.buscarContacto("123");
		c.agregarTelefono(new Telefono("claro", "123456789"));
		c.agregarTelefono(new Telefono("movi", "123456789"));
		directorioArreglo.imprimir();
		
		System.out.println("__________________ELIMINANDO CONTACTO_________________");
		directorioArreglo.eliminarContacto("456");
		directorioArreglo.eliminarContacto("4568");
		directorioArreglo.imprimir();

	}

}
