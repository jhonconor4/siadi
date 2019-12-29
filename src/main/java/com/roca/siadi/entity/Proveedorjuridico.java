package com.roca.siadi.entity;
// Generated 08/10/2019 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Proveedorjuridico generated by hbm2java
 */
@Entity
@Table(name = "proveedorjuridico")
public class Proveedorjuridico implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "iddistrito", nullable = false)
    private int iddistrito;
    
    @Column(name = "ruc", nullable = false, precision = 11, scale = 0)
    private long ruc;
    
    @Column(name = "razonsocial", nullable = false, length = 250)
    private String razonsocial;
    
    @Column(name = "nombrecomercial", nullable = false, length = 250)
    private String nombrecomercial;
    
    @Column(name = "jironegocio", nullable = false, length = 250)
    private String jironegocio;
    
    @Column(name = "telefono", nullable = false, precision = 11, scale = 0)
    private long telefono;
    
    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;
    
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    
    @Column(name = "fechafundacion", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechafundacion;

    public Proveedorjuridico() {
    }

    public Proveedorjuridico(int id, int iddistrito, long ruc, String razonsocial, String nombrecomercial, String jironegocio, long telefono, String direccion) {
        this.id = id;
        this.iddistrito = iddistrito;
        this.ruc = ruc;
        this.razonsocial = razonsocial;
        this.nombrecomercial = nombrecomercial;
        this.jironegocio = jironegocio;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Proveedorjuridico(int id, int iddistrito, long ruc, String razonsocial, String nombrecomercial, String jironegocio, long telefono, String direccion, String email, Date fechafundacion) {
        this.id = id;
        this.iddistrito = iddistrito;
        this.ruc = ruc;
        this.razonsocial = razonsocial;
        this.nombrecomercial = nombrecomercial;
        this.jironegocio = jironegocio;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.fechafundacion = fechafundacion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIddistrito() {
        return this.iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public long getRuc() {
        return this.ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public String getRazonsocial() {
        return this.razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNombrecomercial() {
        return this.nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public String getJironegocio() {
        return this.jironegocio;
    }

    public void setJironegocio(String jironegocio) {
        this.jironegocio = jironegocio;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechafundacion() {
        return this.fechafundacion;
    }

    public void setFechafundacion(Date fechafundacion) {
        this.fechafundacion = fechafundacion;
    }
}
