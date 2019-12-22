/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import com.roca.siadi.entity.Contrato;
import com.roca.siadi.entity.Turno;

/**
 *
 * @author nerio
 */
public interface ContratoDao extends GenericDao<Contrato> {

    Contrato registrarContr(Contrato c, List<Turno> lt);

    Contrato actualizarContr(Contrato c);

    int eliminarContr(Contrato c);
}
