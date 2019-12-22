/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import javax.servlet.http.HttpSession;

import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Credito;
import com.roca.siadi.entity.Cuota;
import com.roca.siadi.entity.Transaccion;

/**
 *
 * @author NERIO
 */
public interface CreditoDao extends GenericDao<Credito> {

    Cuota pagarCuota(Credito cr, Cuota cu, Transaccion tr, Cajero c, Comprobante comp, HttpSession s);
}
