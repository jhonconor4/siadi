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
 * Representantelegal generated by hbm2java
 */
@Entity
@Table(name = "representantlegal")
public class Representantlegal implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idproveedorjuridico")
    private Clientejuridico proveedorjuridico;
    
    @Column(name = "dni", nullable = false, precision = 8, scale = 0)
    private int dni;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "apellidopat", nullable = false, length = 50)
    private String apellidopat;
    
    @Column(name = "apellidomat", nullable = false, length = 50)
    private String apellidomat;
    
    @Column(name = "cargo", nullable = false, length = 100)
    private String cargo;
    
    @Column(name = "celular", nullable = true, precision = 11, scale = 0)
    private Long celular;
    
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    
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

    public Representantlegal() {
    }

    public Representantlegal(int id, Clientejuridico proveedorjuridico, int dni, String nombre, String apellidopat, String apellidomat, String cargo, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.proveedorjuridico = proveedorjuridico;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.cargo = cargo;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Representantlegal(int id, Clientejuridico proveedorjuridico, int dni, String nombre, String apellidopat, String apellidomat, String cargo, Long celular, String email, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod) {
        this.id = id;
        this.proveedorjuridico = proveedorjuridico;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.cargo = cargo;
        this.celular = celular;
        this.email = email;
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

    public Clientejuridico getClientejuridico() {
        return this.proveedorjuridico;
    }

    public void setClientejuridico(Clientejuridico proveedorjuridico) {
        this.proveedorjuridico = proveedorjuridico;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopat() {
        return this.apellidopat;
    }

    public void setApellidopat(String apellidopat) {
        this.apellidopat = apellidopat;
    }

    public String getApellidomat() {
        return this.apellidomat;
    }

    public void setApellidomat(String apellidomat) {
        this.apellidomat = apellidomat;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Long getCelular() {
        return this.celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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
