package com.nancycastroback.nancycas.model;

public class Ofertas {
    private Integer id;
    private String nombre;
    private String precio;
    private String descuento;
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
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getDescuento() {
        return descuento;
    }
    public void setDescuento(String descuento) {
        this.descuento = descuento;
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
    public Ofertas(Integer id, String nombre, String precio, String descuento, String url, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.url = url;
        this.foto = foto;
    }
    public Ofertas() {
    }
    @Override
    public String toString() {
        return "Ofertas [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento + ", url="
                + url + ", foto=" + foto + "]";
    }

    
}
