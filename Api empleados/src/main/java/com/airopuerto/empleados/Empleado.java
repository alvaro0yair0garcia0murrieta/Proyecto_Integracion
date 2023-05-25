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
    public Empleado(int id, String nombre, String correo, String numeroTefonico, String depatamento, String puesto) {
        
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((correo == null) ? 0 : correo.hashCode());
        result = prime * result + ((numeroTefonico == null) ? 0 : numeroTefonico.hashCode());
        result = prime * result + ((depatamento == null) ? 0 : depatamento.hashCode());
        result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
       
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (correo == null) {
            if (other.correo != null)
                return false;
        } else if (!correo.equals(other.correo))
            return false;
        if (numeroTefonico == null) {
            if (other.numeroTefonico != null)
                return false;
        } else if (!numeroTefonico.equals(other.numeroTefonico))
            return false;
        if (depatamento == null) {
            if (other.depatamento != null)
                return false;
        } else if (!depatamento.equals(other.depatamento))
            return false;
        if (puesto == null) {
            if (other.puesto != null)
                return false;
        } else if (!puesto.equals(other.puesto))
            return false;
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
