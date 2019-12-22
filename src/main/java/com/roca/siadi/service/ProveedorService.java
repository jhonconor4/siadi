/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Proveedor;
import com.roca.siadi.entity.Tablamaestra;
import com.roca.siadi.entity.nuevo.Data;
import com.roca.siadi.entity.nuevo.Data2;

/**
 *
 * @author nerio
 */
public interface ProveedorService extends GenericService<Proveedor> {

    List<Proveedor> listarProveedor(Tablamaestra tm);

    List<Proveedor> listarProveedorjuridico(Proveedor p);

    List<Proveedor> listarProveedornatural(Proveedor p);

    int obtenerCodigoproveedor(Tablamaestra tm);

    Proveedor registrarProveedorjuridico(Data data);

    int eliminarProveedorjuridico(Proveedor p);

    Proveedor actualizarProveedorjuridico(Data2 data);

    Proveedor registrarProveedornatural(Proveedor p);

    int eliminarProveedornatural(Proveedor p);

    Proveedor actualizarProveedornatural(Proveedor p);

}
