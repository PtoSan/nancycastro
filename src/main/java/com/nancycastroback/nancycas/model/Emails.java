package com.nancycastroback.nancycas.model;

import java.util.Date;

public class Emails {
    private Integer id;
    private String email;
    private Date fecha;
    private boolean check;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public boolean isCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }
    public Emails() {
    }
    public Emails(Integer id, String email, Date fecha, boolean check) {
        this.id = id;
        this.email = email;
        this.fecha = fecha;
        this.check = check;
    }
    @Override
    public String toString() {
        return "Emails [id=" + id + ", email=" + email + ", fecha=" + fecha + ", check=" + check + "]";
    }
    
}
