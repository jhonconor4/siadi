/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import com.roca.siadi.entity.Inventario;
import com.roca.siadi.entity.Merma;

/**
 *
 * @author ROCA
 */
public interface MermaDao extends GenericDao<Merma> {

    Merma registrarMerma(Merma m, List<Inventario> li);

    int eliminarMerma(Merma m);
}
