package com.nancycastroback.nancycas.model;

public class InfoTeam {
    private Integer id;
    private String nombre;
    private String celular;
    private String email;
    private boolean check;
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
    public boolean isCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }
    public InfoTeam() {
    }
    public InfoTeam(Integer id, String nombre, String celular, String email, boolean check) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.email = email;
        this.check = check;
    }
    @Override
    public String toString() {
        return "InfoTeam [id=" + id + ", nombre=" + nombre + ", celular=" + celular + ", email=" + email + ", check="
                + check + "]";
    }

    
}
