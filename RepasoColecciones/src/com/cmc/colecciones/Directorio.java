package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class Directorio {

    public void agregarContacto(Contacto contacto) {
        System.out.println("M�todo agregarContacto no implementado " + contacto.toString());
        System.out.println("M�todo agregarContacto no implementado " + contacto);
    }

    public Contacto buscarContacto(String cedula) {
        System.out.println("M�todo buscarContacto no implementado");
        return null;
    }

    public Contacto eliminarContacto(String cedula) {
        System.out.println("M�todo eliminarContacto no implementado");
        return null;
    }

    public void imprimir() {
        System.out.println("Imprimiendo");
    }

}