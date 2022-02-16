package com.cmc.flujo;

public class Auto {
	private int cantidadGasolina;
	private int capacidadtanque;
	
	public Auto(int capacidadTanque) {
		if(capacidadTanque <= 0){
			System.out.println("nose aceptan valores negativos");
		} else {
			this.capacidadtanque = capacidadTanque;
		}
	}
	
	public void cargarGasolina(int cantidad) {
		if(cantidadGasolina + cantidad > capacidadtanque){
			System.out.println("Excede la capacidad");
		} else {
			cantidadGasolina = cantidadGasolina + cantidad;
		}
	}
	
	public int getCantidadGasolina(){
		return cantidadGasolina;
	}
	
}
