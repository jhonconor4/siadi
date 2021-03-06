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
 * Transferencia generated by hbm2java
 */
@Entity
@Table(name = "transferencia")
public class Transferencia implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idbobeda")
    private Bobeda bobeda;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idcajero")
    private Cajero cajero;
    
    @Column(name = "idttipotransferencia", nullable = false)
    private int idttipotransferencia;
    
    @Column(name = "glosa", nullable = false, length = 150)
    private String glosa;
    
    @Column(name = "montototal", nullable = false, precision = 10, scale = 2)
    private double montototal;
    
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Column(name = "diezc", nullable = false)
    private int diezc;
    
    @Column(name = "veintec", nullable = false)
    private int veintec;
    
    @Column(name = "cincuentac", nullable = false)
    private int cincuentac;
    
    @Column(name = "uns", nullable = false)
    private int uns;
    
    @Column(name = "doss", nullable = false)
    private int doss;
    
    @Column(name = "cincos", nullable = false)
    private int cincos;
    
    @Column(name = "diezs", nullable = false)
    private int diezs;
    
    @Column(name = "veintes", nullable = false)
    private int veintes;
    
    @Column(name = "cincuentas", nullable = false)
    private int cincuentas;
    
    @Column(name = "ciens", nullable = false)
    private int ciens;
    
    @Column(name = "doscientoss", nullable = false)
    private int doscientoss;
    
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

    public Transferencia() {
    }

    public Transferencia(int id, Bobeda bobeda, Cajero cajero, int idttipotransferencia, String glosa, double montototal, Date fecha, int diezc, int veintec, int cincuentac, int uns, int doss, int cincos, int diezs, int veintes, int cincuentas, int ciens, int doscientoss, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.bobeda = bobeda;
        this.cajero = cajero;
        this.idttipotransferencia = idttipotransferencia;
        this.glosa = glosa;
        this.montototal = montototal;
        this.fecha = fecha;
        this.diezc = diezc;
        this.veintec = veintec;
        this.cincuentac = cincuentac;
        this.uns = uns;
        this.doss = doss;
        this.cincos = cincos;
        this.diezs = diezs;
        this.veintes = veintes;
        this.cincuentas = cincuentas;
        this.ciens = ciens;
        this.doscientoss = doscientoss;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Transferencia(int id, Bobeda bobeda, Cajero cajero, int idttipotransferencia, String glosa, double montototal, Date fecha, int diezc, int veintec, int cincuentac, int uns, int doss, int cincos, int diezs, int veintes, int cincuentas, int ciens, int doscientoss, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.bobeda = bobeda;
        this.cajero = cajero;
        this.idttipotransferencia = idttipotransferencia;
        this.glosa = glosa;
        this.montototal = montototal;
        this.fecha = fecha;
        this.diezc = diezc;
        this.veintec = veintec;
        this.cincuentac = cincuentac;
        this.uns = uns;
        this.doss = doss;
        this.cincos = cincos;
        this.diezs = diezs;
        this.veintes = veintes;
        this.cincuentas = cincuentas;
        this.ciens = ciens;
        this.doscientoss = doscientoss;
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

    public Bobeda getBobeda() {
        return this.bobeda;
    }

    public void setBobeda(Bobeda bobeda) {
        this.bobeda = bobeda;
    }

    public Cajero getCajero() {
        return this.cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public int getIdttipotransferencia() {
        return this.idttipotransferencia;
    }

    public void setIdttipotransferencia(int idttipotransferencia) {
        this.idttipotransferencia = idttipotransferencia;
    }

    public String getGlosa() {
        return this.glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    public double getMontototal() {
        return this.montototal;
    }

    public void setMontototal(double montototal) {
        this.montototal = montototal;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDiezc() {
        return this.diezc;
    }

    public void setDiezc(int diezc) {
        this.diezc = diezc;
    }

    public int getVeintec() {
        return this.veintec;
    }

    public void setVeintec(int veintec) {
        this.veintec = veintec;
    }

    public int getCincuentac() {
        return this.cincuentac;
    }

    public void setCincuentac(int cincuentac) {
        this.cincuentac = cincuentac;
    }

    public int getUns() {
        return this.uns;
    }

    public void setUns(int uns) {
        this.uns = uns;
    }

    public int getDoss() {
        return this.doss;
    }

    public void setDoss(int doss) {
        this.doss = doss;
    }

    public int getCincos() {
        return this.cincos;
    }

    public void setCincos(int cincos) {
        this.cincos = cincos;
    }

    public int getDiezs() {
        return this.diezs;
    }

    public void setDiezs(int diezs) {
        this.diezs = diezs;
    }

    public int getVeintes() {
        return this.veintes;
    }

    public void setVeintes(int veintes) {
        this.veintes = veintes;
    }

    public int getCincuentas() {
        return this.cincuentas;
    }

    public void setCincuentas(int cincuentas) {
        this.cincuentas = cincuentas;
    }

    public int getCiens() {
        return this.ciens;
    }

    public void setCiens(int ciens) {
        this.ciens = ciens;
    }

    public int getDoscientoss() {
        return this.doscientoss;
    }

    public void setDoscientoss(int doscientoss) {
        this.doscientoss = doscientoss;
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
