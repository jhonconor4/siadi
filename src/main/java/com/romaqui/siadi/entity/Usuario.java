package com.romaqui.siadi.entity;
// Generated 08/10/2016 03:16:50 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.List;
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
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idcolaborador")
    private Colaborador colaborador;
    
    @Column(name = "usuario", nullable = false, length = 50)
    private String usuario;
    
    @Column(name = "contrasena", nullable = false, length = 50)
    private String contrasena;
    
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
    
    @Transient
    private List moduloaccesos;

    public Usuario() {
    }

    public Usuario(int id, Colaborador colaborador, String usuario, String contrasena, boolean estado) {
        this.id = id;
        this.colaborador = colaborador;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public Usuario(int id, Colaborador colaborador, String usuario, String contrasena, boolean estado, int idusuariocrea, Date fechusuariocrea) {
        this.id = id;
        this.colaborador = colaborador;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estado = estado;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
    }

    public Usuario(int id, Colaborador colaborador, String usuario, String contrasena, boolean estado, int idusuariocrea, Date fechusuariocrea, Integer idusuariomod, Date fechusuariomod, List moduloaccesos) {
        this.id = id;
        this.colaborador = colaborador;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estado = estado;
        this.idusuariocrea = idusuariocrea;
        this.fechusuariocrea = fechusuariocrea;
        this.idusuariomod = idusuariomod;
        this.fechusuariomod = fechusuariomod;
        this.moduloaccesos = moduloaccesos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Colaborador getColaborador() {
        return this.colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public List getModuloaccesos() {
        return this.moduloaccesos;
    }

    public void setModuloaccesos(List moduloaccesos) {
        this.moduloaccesos = moduloaccesos;
    }

}
