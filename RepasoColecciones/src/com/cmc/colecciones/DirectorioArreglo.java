package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo extends Directorio {

	private Contacto[] contactos;
	private int elementosAgregados;

	public DirectorioArreglo() {
		this.contactos = new Contacto[10];
	}
	
	
    public Contacto[] getContactos() {
		return contactos;
	}

	@Override
    public void agregarContacto(Contacto contacto) {
        Contacto contactoEncontrado = buscarContacto(contacto.getCedula());
        if (contactoEncontrado == null) {
            contactos[elementosAgregados] = contacto;
            elementosAgregados = elementosAgregados + 1;
        }
    }

    @Override
    public Contacto buscarContacto(String cedula) {
        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.getCedula().equals(cedula)) {
                return contacto;
            }
        }
        return null;
    }

    @Override
    public Contacto eliminarContacto(String cedula) {
        int indice = 0;
    	for (Contacto contacto : contactos) {
    		if (contacto != null && contacto.getCedula().equals(cedula)) {
                for (int j = indice; j < contactos.length - 1; j++) {
                	contactos[j] = contactos[j+1];
                }
            	return contacto;
            }
    		indice += 1;
        }
        return null;
    }

	@Override
    public void imprimir() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
}
