package com.cmc.admin;

import com.cmc.entidades.Producto;

public class AdminProducto {

	// compara: recibe 2 parámtero de tipo Producto
	// comparar los precios de los Productos
	// retorna el Producto de mayor valor
	
	public Producto obtenerProductoMasCaro(Producto a, Producto b) {
		if(a.getPrecio() > b.getPrecio()){
			return a;
		} else if(b.getPrecio() > a.getPrecio()) {
			return b;
		} else {
			return null;
		}
	}
	
}
