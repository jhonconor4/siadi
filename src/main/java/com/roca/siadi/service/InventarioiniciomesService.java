/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Inventarioiniciomes;
import com.roca.siadi.entity.Producto;

/**
 *
 * @author ROCA
 */
public interface InventarioiniciomesService extends GenericService<Inventarioiniciomes> {

    boolean existeRegistro(Producto p, int anio, int mes);

    List<Integer> listarAniosInventario();
}
