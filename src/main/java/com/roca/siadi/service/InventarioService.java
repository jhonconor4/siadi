/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Compra;
import com.roca.siadi.entity.Inventario;
import com.roca.siadi.entity.Producto;

/**
 *
 * @author ROCA
 */
public interface InventarioService extends GenericService<Inventario> {

    int registrarIngreso(Compra c, List<Inventario> li);

    List<Inventario> listarPorProducto(Producto p, Agencia a);
    
    List<Inventario> listarPorProducto2(Producto p, Agencia a);

    List<Inventario> listarTodosPorProducto(Producto p, Agencia a);

    List<Inventario> listarPorAgencia(Agencia a);

    Inventario registrarInventario(Inventario i);

    Inventario actualizarInventario(Inventario i);

    int eliminarInventario(Inventario i);
}
