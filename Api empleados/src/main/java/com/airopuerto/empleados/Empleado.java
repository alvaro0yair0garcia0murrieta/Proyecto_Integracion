package com.airopuerto.empleados;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private  String correo;
    private  String numeroTefonico;
    private String depatamento;
    private String puesto;

    public Empleado(){}

    public Empleado(String nombre, String correo, String numeroTefonico, String depatamento, String puesto) {
        
        this.nombre = nombre;
        this.correo = correo;
        this.numeroTefonico = numeroTefonico;
        this.depatamento = depatamento;
        this.puesto = puesto;
    }
   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNumeroTefonico() {
        return numeroTefonico;
    }
    public void setNumeroTefonico(String numeroTefonico) {
        this.numeroTefonico = numeroTefonico;
    }
    public String getDepatamento() {
        return depatamento;
    }
    public void setDepatamento(String depatamento) {
        this.depatamento = depatamento;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Integer getId() {
        return id;
    }
    
}
