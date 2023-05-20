package com.nancycastroback.nancycas.model;

public class ProducTempo {
    private Integer id;
    private String nombre;
    private double precio;
    private String url;
    private String foto;
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
    
}
