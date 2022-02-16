package com.cmc.entidades;

public class Direccion {

	private String callePrincipal;
	private String calleSecuandaria;
	private String numero;
	
	
	public Direccion() {
		//super();
	}

	public Direccion(String callePrincipal, String calleSecuandaria, String numero) {
		//super();
		this.callePrincipal = callePrincipal;
		this.calleSecuandaria = calleSecuandaria;
		this.numero = numero;
	}

	public String getCallePrincipal() {
		return callePrincipal;
	}
	
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	
	public String getCalleSecuandaria() {
		return calleSecuandaria;
	}
	
	public void setCalleSecuandaria(String calleSecuandaria) {
		this.calleSecuandaria = calleSecuandaria;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
