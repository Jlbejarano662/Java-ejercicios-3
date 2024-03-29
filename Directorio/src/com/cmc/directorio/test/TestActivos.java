package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi", "03222", 1);
		//t1.setTieneWhatsapp(true);
		Contacto c1 = new Contacto("Armando", "Reyes", t1, 0.50);
		
		System.out.println("------Valores inciales-------");
		System.out.println("Nombre: " + c1.getNombre());
		System.out.println("Apellido: " + c1.getApellido());
		System.out.println("Telefono:  N�mero: " + c1.getTelefono().getNumero() + " Operadora: "
				+ c1.getTelefono().getOperadora() + " C�digo: " + c1.getTelefono().getCodigo() + " Tiene WhatsApp: "
				+ c1.getTelefono().isTieneWhatsapp());
		System.out.println("Peso: " + c1.getPeso());
		System.out.println("Activo: " + c1.isActivo());
		
		AdminContactos admin = new AdminContactos();
		admin.acivarUsuario(c1);
		
		System.out.println("----M�todo activarUsuario----");
		System.out.println("Nombre: " + c1.getNombre());
		System.out.println("Apellido: " + c1.getApellido());
		System.out.println("Telefono:  N�mero: " + c1.getTelefono().getNumero() + " Operadora: "
				+ c1.getTelefono().getOperadora() + " C�digo: " + c1.getTelefono().getCodigo() + " Tiene WhatsApp: "
				+ c1.getTelefono().isTieneWhatsapp());
		System.out.println("Peso: " + c1.getPeso());
		System.out.println("Activo: " + c1.isActivo());
	}

}
