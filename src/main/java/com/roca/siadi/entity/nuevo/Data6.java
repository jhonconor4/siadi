/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.entity.nuevo;

import java.util.List;

import com.roca.siadi.entity.Compra;
import com.roca.siadi.entity.Inventario;

/**
 *
 * @author NERIO
 */
public class Data6 {

    private Compra compra;
    private List<Inventario> li;

    public Data6() {
    }

    public Data6(Compra compra, List<Inventario> li) {
        this.compra = compra;
        this.li = li;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public List<Inventario> getLi() {
        return li;
    }

    public void setLi(List<Inventario> li) {
        this.li = li;
    }

}
