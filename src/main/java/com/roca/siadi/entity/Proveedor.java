package com.roca.siadi.entity;
// Generated 08/10/2019 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * Proveedor generated by hbm2java
 */
@Entity
@Table(name = "proveedor")
public class Proveedor implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idproveedorjuridico")
    private Proveedorjuridico proveedorjuridico;
    
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idproveedornatural")
    private Proveedornatural proveedornatural;
    
    @Column(name = "idttipoproveedor", nullable = false)
    private int idttipoproveedor;
    
    @Column(name = "codigo", nullable = false, length = 25)
    private String codigo;
    
    @Column(name = "observacion", nullable = true, length = 300)
    private String observacion;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    @Column(name = "idusuariocrea", nullable = false)
    private int idusuariocrea;
    
    @Column(name = "fechusuariocrea", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechusuariocrea;
    
    @Column(name = "idusuariomod", nullable = true)
    private Integer idusuariomod;
    
    @Column(name = "fechusuariomod", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechusuariomod;

    public Proveedor() {
    }

    public Proveedor(int id, int idttipoproveedor, String codigo, boolean estado, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.idttipoproveedor = idttipoproveedor;
        this.codigo = codigo;
        this.estado = estado;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Proveedor(int id, Proveedorjuridico proveedorjuridico, Proveedornatural proveedornatural, int idttipoproveedor, String codigo, String observacion, boolean estado, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.proveedorjuridico = proveedorjuridico;
        this.proveedornatural = proveedornatural;
        this.idttipoproveedor = idttipoproveedor;
        this.codigo = codigo;
        this.observacion = observacion;
        this.estado = estado;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
        this.idusuariomod = idusuariomod;
        this.fechusuariomod = fechusuariomod;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proveedorjuridico getProveedorjuridico() {
        return this.proveedorjuridico;
    }

    public void setProveedorjuridico(Proveedorjuridico proveedorjuridico) {
        this.proveedorjuridico = proveedorjuridico;
    }

    public Proveedornatural getProveedornatural() {
        return this.proveedornatural;
    }

    public void setProveedornatural(Proveedornatural proveedornatural) {
        this.proveedornatural = proveedornatural;
    }

    public int getIdttipoproveedor() {
        return this.idttipoproveedor;
    }

    public void setIdttipoproveedor(int idttipoproveedor) {
        this.idttipoproveedor = idttipoproveedor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdusuariocrea() {
        return this.idusuariocrea;
    }

    public void setIdusuariocrea(int idusuariocrea) {
        this.idusuariocrea = idusuariocrea;
    }

    public Date getFechusuariocrea() {
        return this.fechusuariocrea;
    }

    public void setFechusuariocrea(Date fechusuariocrea) {
        this.fechusuariocrea = fechusuariocrea;
    }

    public Integer getIdusuariomod() {
        return this.idusuariomod;
    }

    public void setIdusuariomod(Integer idusuariomod) {
        this.idusuariomod = idusuariomod;
    }

    public Date getFechusuariomod() {
        return this.fechusuariomod;
    }

    public void setFechusuariomod(Date fechusuariomod) {
        this.fechusuariomod = fechusuariomod;
    }

}
