/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import com.roca.siadi.entity.Compra;
import com.roca.siadi.entity.Inventario;

/**
 *
 * @author nerio
 */
public interface InventarioDao extends GenericDao<Inventario> {

    int registrarIngreso(Compra c, List<Inventario> li);
}
