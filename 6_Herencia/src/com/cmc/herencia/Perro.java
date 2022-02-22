package com.cmc.herencia;

public class Perro extends Animal{
	
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	//public void dormir() {
		//System.out.println("Animal durmiendo");
	//}
	
	public void dormir() {
		super.dormir(); //hace referencia al método dormir de la clase padre
		System.out.println("PERRO durmiendo");
	}
}
