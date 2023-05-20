package com.nancycastroback.nancycas.model;

public class Usuario {
    private Integer id;
    private String nombre;
    private String usuario;
    private String email;
    private String contraseña;
    private boolean rango;

    public Usuario(Integer id, String nombre, String usuario, String email, String contraseña, boolean rango) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.rango = rango;
    }

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
    

}
