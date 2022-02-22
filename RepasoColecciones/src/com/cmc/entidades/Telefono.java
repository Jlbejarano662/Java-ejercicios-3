package com.cmc.entidades;

public class Telefono {

    private String operadora;
    private String numero;

    public Telefono(String operadora, String numero) {
        this.operadora = operadora;
        this.numero = numero;
    }
    
    public String getNumero() {
        return numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "Telefono [numero=" + numero + ", operadora=" + operadora + "]";
    }
    
}