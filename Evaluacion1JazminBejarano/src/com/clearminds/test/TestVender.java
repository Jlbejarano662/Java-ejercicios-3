package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.componentes.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B", 4);
		
		maquina.cargarProducto(new Producto("BDCR", "Gatorade", 2.54),"D",5);

		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A", 6);
		maquina.mostrarProductos();
		
		maquina.vender("A");
		maquina.vender("B");
		
		maquina.mostrarProductos();

	}

}