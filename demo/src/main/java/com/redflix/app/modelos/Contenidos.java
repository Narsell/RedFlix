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
@Table(name="contenidos")
public class Contenidos {
    
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long contId;
    
    @Column(name="id_cont")
    private Long contRefId;
    
    @Column(name="tipo")
    private String contTipo;

    public Long getContId() {
        return contId;
    }

    public void setContId(Long contId) {
        this.contId = contId;
    }

    public Long getContRefId() {
        return contRefId;
    }

    public void setContRefId(Long contRefId) {
        this.contRefId = contRefId;
    }

    public String getContTipo() {
        return contTipo;
    }

    public void setContTipo(String contTipo) {
        this.contTipo = contTipo;
    }
    
    
}
