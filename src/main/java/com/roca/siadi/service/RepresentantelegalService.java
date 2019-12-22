/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Proveedorjuridico;
import com.roca.siadi.entity.Representantelegal;

/**
 *
 * @author nerio
 */
public interface RepresentantelegalService extends GenericService<Representantelegal> {

    List<Representantelegal> listarPorProveedorjuridico(Proveedorjuridico pj);

}
