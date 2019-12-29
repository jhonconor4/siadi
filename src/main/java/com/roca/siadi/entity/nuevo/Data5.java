/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.entity.nuevo;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Producto;

/**
 *
 * @author ROCA
 */
public class Data5 {

    private Producto producto;
    private Agencia agencia;

    public Data5() {
    }

    public Data5(Producto producto, Agencia agencia) {
        this.producto = producto;
        this.agencia = agencia;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

}
