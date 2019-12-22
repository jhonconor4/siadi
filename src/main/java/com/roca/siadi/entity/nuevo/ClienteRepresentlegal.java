/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.entity.nuevo;

import java.util.List;

import com.roca.siadi.entity.Cliente;
import com.roca.siadi.entity.Representantlegal;

/**
 *
 * @author NERIO
 */
public class ClienteRepresentlegal {

    private Cliente cliente;
    private List<Representantlegal> lrl;

    public ClienteRepresentlegal() {
    }

    public ClienteRepresentlegal(Cliente cliente, List<Representantlegal> lrl) {
        this.cliente = cliente;
        this.lrl = lrl;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Representantlegal> getLrl() {
        return lrl;
    }

    public void setLrl(List<Representantlegal> lrl) {
        this.lrl = lrl;
    }

}
