/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.entity.nuevo;

import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Credito;
import com.roca.siadi.entity.Cuota;
import com.roca.siadi.entity.Transaccion;

/**
 *
 * @author ROCA
 */
public class CreditoCuotaTransac {

    private Credito credito;
    private Cuota cuota;
    private Transaccion transaccion;
    private Comprobante comprobante;

    public CreditoCuotaTransac() {
    }

    public CreditoCuotaTransac(Credito credito, Cuota cuota, Transaccion transaccion, Comprobante comprobante) {
        this.credito = credito;
        this.cuota = cuota;
        this.transaccion = transaccion;
        this.comprobante = comprobante;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

}
