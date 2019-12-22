/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Distrito;
import com.roca.siadi.entity.Provincia;

/**
 *
 * @author nerio
 */
public interface DistritoService extends GenericService<Distrito> {

    List<Distrito> listarPorProvincia(Provincia p);
}
