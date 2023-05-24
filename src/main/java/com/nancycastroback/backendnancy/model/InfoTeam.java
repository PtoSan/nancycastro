package com.nancycastroback.backendnancy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "infoTeam")
public class InfoTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String celular;
    private String email;
    private Integer revisado;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer isRevisado() {
        return revisado;
    }
    public void setRevisado(Integer revisado) {
        this.revisado = revisado;
    }
    public InfoTeam() {
    }
    public InfoTeam(Integer id, String nombre, String celular, String email, Integer revisado) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.email = email;
        this.revisado = revisado;
    }
    @Override
    public String toString() {
        return "InfoTeam [id=" + id + ", nombre=" + nombre + ", celular=" + celular + ", email=" + email + ", revisado="
                + revisado + "]";
    }

    
}
