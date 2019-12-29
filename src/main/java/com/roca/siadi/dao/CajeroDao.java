/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Transferencia;

/**
 *
 * @author ROCA
 */
public interface CajeroDao extends GenericDao<Cajero> {

    Transferencia crearCajero(Transferencia t);

    Transferencia cerrarCajero(Transferencia tr);
}
