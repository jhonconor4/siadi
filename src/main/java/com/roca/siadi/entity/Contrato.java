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
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * Dependencia generated by hbm2java
 */
@Entity
@Table(name = "contrato")
public class Contrato implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idcolaborador")
    private Colaborador colaborador;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "iddependencia")
    private Dependencia dependencia;
    
    @Column(name = "codigo", nullable = false, length = 25)
    private String codigo;
    
    @Column(name = "idttipocargo", nullable = false)
    private int idttipocargo;
    
    @Column(name = "idttipoempleado", nullable = false)
    private int idttipoempleado;
    
    @Column(name = "fechainicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    
    @Column(name = "fechafin", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechafin;
    
    @Column(name = "sueldo", nullable = false, precision = 8)
    private double sueldo;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    @Column(name = "esjefearea", nullable = false)
    private boolean esjefearea;
    
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

    @Transient
    private Date fecha;

    public Contrato() {
    }

    public Contrato(int id) {
        this.id = id;
    }

    public Contrato(int id, Colaborador colaborador, Dependencia dependencia, String codigo, int idttipocargo, int idttipoempleado, Date fechainicio, Date fechafin, double sueldo, boolean estado, boolean esjefearea, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.colaborador = colaborador;
        this.dependencia = dependencia;
        this.codigo = codigo;
        this.idttipocargo = idttipocargo;
        this.idttipoempleado = idttipoempleado;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.sueldo = sueldo;
        this.estado = estado;
        this.esjefearea = esjefearea;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
        this.idusuariomod = idusuariomod;
        this.fechusuariomod = fechusuariomod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdttipocargo() {
        return idttipocargo;
    }

    public void setIdttipocargo(int idttipocargo) {
        this.idttipocargo = idttipocargo;
    }

    public int getIdttipoempleado() {
        return idttipoempleado;
    }

    public void setIdttipoempleado(int idttipoempleado) {
        this.idttipoempleado = idttipoempleado;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEsjefearea() {
        return esjefearea;
    }

    public void setEsjefearea(boolean esjefearea) {
        this.esjefearea = esjefearea;
    }

    public int getIdusuariocrea() {
        return idusuariocrea;
    }

    public void setIdusuariocrea(int idusuariocrea) {
        this.idusuariocrea = idusuariocrea;
    }

    public Date getFechusuariocrea() {
        return fechusuariocrea;
    }

    public void setFechusuariocrea(Date fechusuariocrea) {
        this.fechusuariocrea = fechusuariocrea;
    }

    public Integer getIdusuariomod() {
        return idusuariomod;
    }

    public void setIdusuariomod(Integer idusuariomod) {
        this.idusuariomod = idusuariomod;
    }

    public Date getFechusuariomod() {
        return fechusuariomod;
    }

    public void setFechusuariomod(Date fechusuariomod) {
        this.fechusuariomod = fechusuariomod;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
