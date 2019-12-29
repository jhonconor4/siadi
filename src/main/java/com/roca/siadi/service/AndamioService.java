/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Almacen;
import com.roca.siadi.entity.Andamio;

/**
 *
 * @author ROCA
 */
public interface AndamioService extends GenericService<Andamio> {

    List<Andamio> listarPorAlmacen(Almacen a);

    Andamio crearAndamio(Andamio a);

    int obtenerCodigoandamio(Almacen a);
}
