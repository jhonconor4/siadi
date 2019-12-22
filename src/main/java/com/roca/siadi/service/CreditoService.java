/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.roca.siadi.entity.Cliente;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Credito;
import com.roca.siadi.entity.Cuota;
import com.roca.siadi.entity.Transaccion;

/**
 *
 * @author NERIO
 */
public interface CreditoService extends GenericService<Credito> {

    List<Credito> listarCreditos(Cliente c);

    Cuota pagarCuota(Credito c, Cuota cu, Transaccion tr, Comprobante comp, HttpSession s);
}
