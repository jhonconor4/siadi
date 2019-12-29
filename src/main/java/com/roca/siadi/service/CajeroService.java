/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Transferencia;

/**
 *
 * @author ROCA
 */
public interface CajeroService extends GenericService<Cajero> {

    List<Cajero> listarPorAgencia(Agencia a);

    Transferencia crearCajero(Transferencia t);

    Cajero obtenerCajero(HttpSession s);

    Transferencia cerrarCajero(Transferencia tr);
}
