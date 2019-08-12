package com.romaqui.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Agencia generated by hbm2java
 */
@Entity
@Table(name = "agencia")
public class Agencia implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "iddistrito", nullable = true)
    private int iddistrito;
    
    @Column(name = "razonsocial", nullable = false, length = 200)
    private String razonsocial;
    
    @Column(name = "nombrecomercial", nullable = false, length = 200)
    private String nombrecomercial;
    
    @Column(name = "ruc", nullable = false, precision = 11, scale = 2)
    private long ruc;
    
    @Column(name = "telefono", nullable = false, precision = 11, scale = 2)
    private long telefono;
    
    @Column(name = "urllogo", nullable = false, length = 300)
    private String urllogo;
    
    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;
    
    @Transient
    private int limit;
    
    @Transient
    private Date datelimit;
    
    @Transient
    private int idtipo;
    
    @Transient
    private boolean estado;

    public Agencia() {
    }

    public Agencia(int id, int iddistrito, String razonsocial, String nombrecomercial, long ruc, long telefono, String urllogo, String direccion) {
        this.id = id;
        this.iddistrito = iddistrito;
        this.razonsocial = razonsocial;
        this.nombrecomercial = nombrecomercial;
        this.ruc = ruc;
        this.telefono = telefono;
        this.urllogo = urllogo;
        this.direccion = direccion;
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

    public String getRazonsocial() {
        return this.razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public long getRuc() {
        return this.ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getUrllogo() {
        return this.urllogo;
    }

    public void setUrllogo(String urllogo) {
        this.urllogo = urllogo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Date getDatelimit() {
        return datelimit;
    }

    public void setDatelimit(Date datelimit) {
        this.datelimit = datelimit;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
