package com.nancycastroback.backendnancy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "productosTemporada")
public class ProducTempo {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private double precio;
    private String url;
    private String foto;

    @ManyToOne
    private Usuario usuario;

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
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public ProducTempo() {
    }
    public ProducTempo(Integer id, String nombre, double precio, String url, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.url = url;
        this.foto = foto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public ProducTempo(Integer id, String nombre, double precio, String url, String foto, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.url = url;
        this.foto = foto;
        this.usuario = usuario;
    }
    
}
