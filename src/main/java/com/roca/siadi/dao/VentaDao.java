/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Credito;
import com.roca.siadi.entity.Detalleventa;
import com.roca.siadi.entity.Inventario;
import com.roca.siadi.entity.Transaccion;
import com.roca.siadi.entity.Venta;

/**
 *
 * @author ROCA
 */
public interface VentaDao extends GenericDao<Venta> {

    Venta registrarVenta(Venta v, List<Detalleventa> ldv, List<Inventario> li, Transaccion tr, Cajero c, Comprobante comp, HttpSession s);
    
    Venta registrarVentac(Venta v, List<Detalleventa> ldv, List<Inventario> li, Credito cr);

    int eliminarVenta(Venta v, List<Detalleventa> ldv);
}
