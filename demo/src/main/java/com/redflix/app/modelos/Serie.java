/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.app.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "series")
public class Serie {
    
    @Id
    @GeneratedValue
    @Column(name="id_serie")
    Long serId;
    
    @Column(name="titulo")
    String serTitulo;
    
    @Column(name="n_temp")
    String serTemp;
    
    @Column(name="n_ep")
    String serEp;

    public Long getSerId() {
        return serId;
    }

    public void setSerId(Long serId) {
        this.serId = serId;
    }

    public String getSerTitulo() {
        return serTitulo;
    }

    public void setSerTitulo(String serTitulo) {
        this.serTitulo = serTitulo;
    }

    public String getSerTemp() {
        return serTemp;
    }

    public void setSerTemp(String serTemp) {
        this.serTemp = serTemp;
    }

    public String getSerEp() {
        return serEp;
    }

    public void setSerEp(String serEp) {
        this.serEp = serEp;
    }
    
}
