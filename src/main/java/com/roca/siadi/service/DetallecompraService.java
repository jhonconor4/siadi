/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Compra;
import com.roca.siadi.entity.Detallecompra;

/**
 *
 * @author nerio
 */
public interface DetallecompraService extends GenericService<Detallecompra> {

    List<Detallecompra> listarPorCompra(Compra c);
}
