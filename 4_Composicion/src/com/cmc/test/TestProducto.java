package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		AdminProducto admin = new AdminProducto();
		Producto prod1 = new Producto("Papas", 0.50);
		Producto prod2 = new Producto("Doritos", 0.55);
		Producto prodCaro = admin.obtenerProductoMasCaro(prod1, prod2);
		if(prodCaro == null) {
			System.out.println("mismo precio");
		} else {
			System.out.println("El producto m�s caro es: " + prodCaro.getNombre());	
		}
	}

}
