/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Tablamaestra;

/**
 *
 * @author ROCA
 */
public interface TablamaestraService extends GenericService<Tablamaestra> {

    List<Tablamaestra> listarTipo(Tablamaestra t);

    List<Tablamaestra> listarUnidadmedida(Tablamaestra u);

    Tablamaestra obtenerTipoIdItem(Tablamaestra t);
}
