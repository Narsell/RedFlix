/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.app.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "peliculas")
public class Pelicula {
    
    @Id
    @GeneratedValue
    @Column(name = "id_pelicula")
    private Long pelId;
    
    @Column(name="titulo")
    private String pelTitulo;
    
    @Column(name="resumen")
    private String pelResumen;
    
    @Column(name="año")
    private int pelAño;
        
    @Column(name="id_dir")
    Long dirId;

    public Long getPelId() {
        return pelId;
    }

    public void setPelId(Long pelId) {
        this.pelId = pelId;
    }

    public String getPelTitulo() {
        return pelTitulo;
    }

    public void setPelTitulo(String pelTitulo) {
        this.pelTitulo = pelTitulo;
    }

    public String getPelResumen() {
        return pelResumen;
    }

    public void setPelResumen(String pelResumen) {
        this.pelResumen = pelResumen;
    }

    public int getPelAño() {
        return pelAño;
    }

    public void setPelAño(int pelAño) {
        this.pelAño = pelAño;
    }

    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }
    
    
}
