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
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @Column(name="alias")
    private String usAlias;
    
    @Column(name="nombres")
    private String usNombre;
    
    @Column(name="apellidos")
    private String usApellido;
        
    @Column(name="email")
    private String usEmail = "email@email.com";
    
    @Column(name="celular")
    private String usCelular = "3125454182";
    
    @Column(name="pwd")
    private String usPwd = "pwd123";
    
    @Column(name="fecha_nac")
    private String usFechaNac = "2020-01-01 10:10:10.000";

    public String getUsAlias() {
        return usAlias;
    }

    public void setUsAlias(String usAlias) {
        this.usAlias = usAlias;
    }

    public String getUsNombre() {
        return usNombre;
    }

    public void setUsNombre(String usNombre) {
        this.usNombre = usNombre;
    }

    public String getUsApellido() {
        return usApellido;
    }

    public void setUsApellido(String usApellido) {
        this.usApellido = usApellido;
    }

    public String getUsEmail() {
        return usEmail;
    }

    public void setUsEmail(String usEmail) {
        this.usEmail = usEmail;
    }

    public String getUsCelular() {
        return usCelular;
    }

    public void setUsCelular(String usCelular) {
        this.usCelular = usCelular;
    }

    public String getUsPwd() {
        return usPwd;
    }

    public void setUsPwd(String usPwd) {
        this.usPwd = usPwd;
    }

    public String getUsFechaNac() {
        return usFechaNac;
    }

    public void setUsFechaNac(String usFechaNac) {
        this.usFechaNac = usFechaNac;
    }
    
    
    
}
