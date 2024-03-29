package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi", "03222", 1);
		Contacto c1 = new Contacto("Armando", "Reyes", t1, 2.5);

		Telefono t2 = new Telefono("claro", "03223", 2);
		Contacto c2 = new Contacto("Erika", "Rojas", t2, 0.90);

		AdminContactos admin = new AdminContactos();
		
		Contacto masPesado = admin.buscarMasPesado(c1, c2);
		System.out.println("----CONTACTO M�S PESADO----");
		System.out.println("Nombre: " + masPesado.getNombre());
		System.out.println("Apellido: " + masPesado.getApellido());
		System.out.println("Telefono:  N�mero: " + masPesado.getTelefono().getNumero() + " Operadora: "
				+ masPesado.getTelefono().getOperadora());
		System.out.println("Peso: " + masPesado.getPeso());
		
		boolean operadoras = admin.compararOperadoras(c1, c2);
		System.out.println("----COMPARAR OPERADORAS----");
		System.out.println(operadoras);
	}

}
