package com.nancycastroback.backendnancy.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="emails")
public class Emails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private Date fecha;
    private Integer revisado;
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
    public Integer isRevisado() {
        return revisado;
    }
    public void setRevisado(Integer revisado) {
        this.revisado = revisado;
    }
    public Emails() {
    }
    public Emails(Integer id, String email, Date fecha, Integer revisado) {
        this.id = id;
        this.email = email;
        this.fecha = fecha;
        this.revisado = revisado;
    }
    @Override
    public String toString() {
        return "Emails [id=" + id + ", email=" + email + ", fecha=" + fecha + ", check=" + revisado + "]";
    }
    
}
