package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		System.out.println("***********************************");
		Item item = new Item();
		item.setProductosActuales(20);
		System.out.println("-----Valores inciales------");
		item.imprmir();
		System.out.println("-------M�todo vender------");
		item.vender(10);
		item.imprmir();
		System.out.println("-------M�todo devolver------");
		item.devolver(2);
		item.imprmir();
		System.out.println("***********************************");
		Item item2 = new Item();
		item2.setProductosActuales(50);
		System.out.println("-----Valores inciales------");
		item2.imprmir();
		System.out.println("-------M�todo vender------");
		item2.vender(19);
		item2.imprmir();
		System.out.println("-------M�todo devolver------");
		item2.devolver(6);
		item2.imprmir();
	}

}
