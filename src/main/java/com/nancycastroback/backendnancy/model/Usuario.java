package com.nancycastroback.backendnancy.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String usuario;
    private String email;
    private String contraseña;
    private boolean rango;

    @OneToMany(mappedBy = "usuario")
    private List<Ofertas> ofertas;

    @OneToMany(mappedBy = "usuario")
    private List<ProducTempo> productos;

    @OneToMany(mappedBy = "usuario")
    private List<Slider> slider;

    public Usuario() {
    }

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isRango() {
        return rango;
    }

    public void setRango(boolean rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", email=" + email
                + ", contraseña=" + contraseña + ", rango=" + rango + "]";
    }

    public List<Ofertas> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Ofertas> ofertas) {
        this.ofertas = ofertas;
    }

    public Usuario(Integer id, String nombre, String usuario, String email, String contraseña, boolean rango,
            List<Ofertas> ofertas) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.rango = rango;
        this.ofertas = ofertas;
    }

    public List<ProducTempo> getProductos() {
        return productos;
    }

    public void setProductos(List<ProducTempo> productos) {
        this.productos = productos;
    }

    public List<Slider> getSlider() {
        return slider;
    }

    public void setSlider(List<Slider> slider) {
        this.slider = slider;
    }

    public Usuario(Integer id, String nombre, String usuario, String email, String contraseña, boolean rango,
            List<Ofertas> ofertas, List<ProducTempo> productos, List<Slider> slider) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.rango = rango;
        this.ofertas = ofertas;
        this.productos = productos;
        this.slider = slider;
    }
    

}
