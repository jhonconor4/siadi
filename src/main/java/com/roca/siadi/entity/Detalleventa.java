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
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


/**
 * Detalleventa generated by hbm2java
 */
@Entity
@Table(name = "detalleventa")
public class Detalleventa implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idproducto")
    private Producto producto;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "idventa")
    private Venta venta;
    
    @Column(name = "cantidad", nullable = false, precision = 11, scale = 1)
    private double cantidad;
    
    @Column(name = "cantidadperfecto", nullable = false, precision = 11, scale = 1)
    private double cantidadperfecto;
    
    @Column(name = "cantidaddaniado", nullable = false, precision = 11, scale = 1)
    private double cantidaddaniado;
    
    @Column(name = "preciounitario", nullable = false, precision = 10, scale = 2)
    private double preciounitario;
    
    @Column(name = "subtotal", nullable = false, precision = 10, scale = 2)
    private double subtotal;

    @Transient
    private Inventario inventario;

    public Detalleventa() {
    }

    public Detalleventa(int id, Producto producto, Venta venta, double cantidad, double cantidadperfecto, double cantidaddaniado, double preciounitario, double subtotal) {
        this.id = id;
        this.producto = producto;
        this.venta = venta;
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

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return this.venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
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

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

}
