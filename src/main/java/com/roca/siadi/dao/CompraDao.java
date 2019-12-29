/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import com.roca.siadi.entity.Compra;
import com.roca.siadi.entity.Detallecompra;

/**
 *
 * @author ROCA
 */
public interface CompraDao extends GenericDao<Compra> {

    Compra registrarCompra(Compra c, List<Detallecompra> ldc);

    int eliminarCompra(Compra c, List<Detallecompra> ldc);
}
