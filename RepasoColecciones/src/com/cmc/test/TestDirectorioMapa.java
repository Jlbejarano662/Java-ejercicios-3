package com.cmc.test;

import com.cmc.colecciones.DirectorioMapa;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestDirectorioMapa {

	public static void main(String[] args) {
		DirectorioMapa directorioMapa= new DirectorioMapa();
		
		System.out.println("__________________AGREGANDO CONTACTOS_____________________");
		directorioMapa.agregarContacto(new Contacto("123", "probando", "wiii"));
		directorioMapa.agregarContacto(new Contacto("456", "probando2", "wiii"));
		directorioMapa.agregarContacto(new Contacto("123", "probando2", "wiii"));
		directorioMapa.imprimir();
		
		System.out.println("__________________AGREGANDO TELEFONOS_____________________");
		Contacto c = directorioMapa.buscarContacto("123");
		c.agregarTelefono(new Telefono("claro", "123456789"));
		c.agregarTelefono(new Telefono("movi", "123456789"));
		directorioMapa.imprimir();
		
		System.out.println("__________________ELIMINANDO CONTACTO_________________");
		directorioMapa.eliminarContacto("456");
		directorioMapa.eliminarContacto("4568");
		directorioMapa.eliminarContacto("68");
		directorioMapa.imprimir();
		
		System.out.println("__________________AGREGANDO CONTACTOS_____________________");
		directorioMapa.agregarContacto(new Contacto("9888", "probando3", "wiii"));
		directorioMapa.imprimir();
	}

}
