package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {

		Producto producto = new Producto("Arroz", 1200);
		System.out.println("--------Valores inciales--------");
		System.out.println(producto.getNombre());
		System.out.println(producto.getPrecio());
		System.out.println("--------Valores modificados--------");
		System.out.println("método setPrecio:");
		producto.setPrecio(-200);
		System.out.println(producto.getPrecio());
		System.out.println("método calcularPrecioPromo: ");
		System.out.println(producto.calcularPrecioPromo(20));
	}

}
