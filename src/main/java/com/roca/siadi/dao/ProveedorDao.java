/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import com.roca.siadi.entity.Proveedor;
import com.roca.siadi.entity.Proveedorjuridico;
import com.roca.siadi.entity.Proveedornatural;
import com.roca.siadi.entity.Representantelegal;

/**
 *
 * @author ROCA
 */
public interface ProveedorDao extends GenericDao<Proveedor> {

    Proveedor registrarProveedorjuridico(Proveedorjuridico pj, Proveedor p, List<Representantelegal> lrl);

    int eliminarProveedorjuridico(Proveedor p, List<Representantelegal> lrl, Proveedorjuridico pj);

    Proveedor actualizarProveedorjuridico(Proveedorjuridico pj, Proveedor p, List<Representantelegal> lrle, List<Representantelegal> lrln, List<Representantelegal> lrl);

    Proveedor registrarProveedornatural(Proveedornatural pn, Proveedor p);

    int eliminarProveedornatural(Proveedor p, Proveedornatural pn);

    Proveedor actualizarProveedornatural(Proveedornatural pn, Proveedor p);

}
