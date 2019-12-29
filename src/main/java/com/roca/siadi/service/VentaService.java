/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Detalleventa;
import com.roca.siadi.entity.Venta;

/**
 *
 * @author ROCA
 */
public interface VentaService extends GenericService<Venta> {

    int obtenerCodigoventa(Agencia a);

    Venta registrarVenta(Venta v, List<Detalleventa> ldv, Comprobante comp, HttpSession s);

    Venta registrarVentac(Venta v, List<Detalleventa> ldv, HttpSession s);

    int eliminarVenta(Venta v);

    List<Venta> listarVentas(Agencia a);

    List<Venta> listarVentaFechas(Venta v);

    List<Venta> listarVentaCodigo(Venta v);
}
