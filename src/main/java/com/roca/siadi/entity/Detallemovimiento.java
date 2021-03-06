package com.roca.siadi.entity;
// Generated 08/10/2019 03:16:50 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * Detallemovimiento generated by hbm2java
 */
@Entity
@Table(name = "detallemovimiento")
public class Detallemovimiento implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idmovimiento")
    private Movimiento movimiento;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idproducto")
    private Producto producto;

    @Column(name = "cantidad", nullable = false, precision = 11, scale = 1)
    private double cantidad;

    @Column(name = "cantidadperfecto", nullable = false, precision = 11, scale = 1)
    private double cantidadperfecto;

    @Column(name = "cantidaddaniado", nullable = false, precision = 11, scale = 1)
    private double cantidaddaniado;

    @Column(name = "preciounitario", nullable = false, precision = 10, scale = 2)
    private double preciounitario;

    @Column(name = "subtotal", nullable = false)
    private double subtotal;

    public Detallemovimiento() {
    }

    public Detallemovimiento(int id, Movimiento movimiento, Producto producto, double cantidad, double cantidadperfecto, double cantidaddaniado, double preciounitario, double subtotal) {
        this.id = id;
        this.movimiento = movimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.cantidadperfecto = cantidadperfecto;
        this.cantidaddaniado = cantidaddaniado;
        this.preciounitario = preciounitario;
        this.subtotal = subtotal;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movimiento getMovimiento() {
        return this.movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidadperfecto() {
        return this.cantidadperfecto;
    }

    public void setCantidadperfecto(double cantidadperfecto) {
        this.cantidadperfecto = cantidadperfecto;
    }

    public double getCantidaddaniado() {
        return this.cantidaddaniado;
    }

    public void setCantidaddaniado(double cantidaddaniado) {
        this.cantidaddaniado = cantidaddaniado;
    }

    public double getPreciounitario() {
        return this.preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}
