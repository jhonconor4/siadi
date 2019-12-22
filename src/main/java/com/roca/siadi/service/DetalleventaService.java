/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Detalleventa;
import com.roca.siadi.entity.Venta;

/**
 *
 * @author nerio
 */
public interface DetalleventaService extends GenericService<Detalleventa> {

    List<Detalleventa> listarPorVenta(Venta v);
}
