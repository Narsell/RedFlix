/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.app.modelos;

import javax.annotation.Generated;
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
@Table(name="directores")
public class Director {
    
    @Id
    @GeneratedValue
    @Column(name="id_director")
    private Long dirId;
    @Column(name="nombre")      
    private String dirNombre;
    @Column(name="apellido")    
    private String dirApellido;
    @Column(name="nacionalidad")    
    private String dirNacion;

    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public String getDirNombre() {
        return dirNombre;
    }

    public void setDirNombre(String dirNombre) {
        this.dirNombre = dirNombre;
    }

    public String getDirApellido() {
        return dirApellido;
    }

    public void setDirApellido(String dirApellido) {
        this.dirApellido = dirApellido;
    }

    public String getDirNacion() {
        return dirNacion;
    }

    public void setDirNacion(String dirNacion) {
        this.dirNacion = dirNacion;
    }
    
    
}
