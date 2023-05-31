package com.vuelos.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vuelo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer numero;

    private String Compania;
    private String pasagero;
    
    public Vuelo(){}
    
    public Vuelo(String compania, String pasagero) {
        Compania = compania;
        this.pasagero = pasagero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String compania) {
        Compania = compania;
    }

    public String getPasagero() {
        return pasagero;
    }

    public void setPasagero(String pasagero) {
        this.pasagero = pasagero;
    }

    @Override
    public String toString() {
        return "Vuelo [numero=" + numero + ", Compania=" + Compania + ", pasagero=" + pasagero + "]";
    }
    
}
