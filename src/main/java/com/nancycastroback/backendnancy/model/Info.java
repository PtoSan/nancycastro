package com.nancycastroback.backendnancy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="infoPage")
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String footer;
    private String linkcontacto;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFooter() {
        return footer;
    }
    public void setFooter(String footer) {
        this.footer = footer;
    }
    public String getLinkcontacto() {
        return linkcontacto;
    }
    public void setLinkcontacto(String linkcontacto) {
        this.linkcontacto = linkcontacto;
    }
    public Info(Integer id, String footer, String linkcontacto) {
        this.id = id;
        this.footer = footer;
        this.linkcontacto = linkcontacto;
    }
    @Override
    public String toString() {
        return "Info [id=" + id + ", footer=" + footer + ", linkcontacto=" + linkcontacto + "]";
    }
    public Info() {
    }

    
}
