package com.romaqui.siadi.entity;
// Generated 03/06/2017 08:58:38 PM by Hibernate Tools 4.3.1

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
 * Vacacion generated by hbm2java
 */
@Entity
@Table(name = "vacacion")
public class Vacacion implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idcontrato")
    private Contrato contrato;
    
    @Column(name = "idtipovacacion", nullable = false)
    private int idtipovacacion;
    
    @Column(name = "fechainicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    
    @Column(name = "fechafin", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechafin;
    
    @Column(name = "descripcion", nullable = true, length = 250)
    private String descripcion;
    
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

    public Vacacion() {
    }

    public Vacacion(int id, Contrato contrato, int idtipovacacion, Date fechainicio, Date fechafin, String descripcion, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.contrato = contrato;
        this.idtipovacacion = idtipovacacion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.descripcion = descripcion;
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

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public int getIdtipovacacion() {
        return idtipovacacion;
    }

    public void setIdtipovacacion(int idtipovacacion) {
        this.idtipovacacion = idtipovacacion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

}
