package com.romaqui.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

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
 * Merma generated by hbm2java
 */
@Entity
@Table(name = "merma")
public class Merma implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idinventario")
    private Inventario inventario;
    
    @Column(name = "cantidad", nullable = false, precision = 11, scale = 1)
    private double cantidad;
    
    @Column(name = "precio", nullable = false, precision = 8, scale = 2)
    private double precio;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    @Column(name = "glosa", nullable = false, length = 300)
    private String glosa;
    
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

    public Merma() {
    }

    public Merma(int id, Inventario inventario, double cantidad, double precio, boolean estado, String glosa, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.inventario = inventario;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
        this.glosa = glosa;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Merma(int id, Inventario inventario, double cantidad, double precio, boolean estado, String glosa, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.inventario = inventario;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
        this.glosa = glosa;
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

    public Inventario getInventario() {
        return this.inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getGlosa() {
        return this.glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
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
