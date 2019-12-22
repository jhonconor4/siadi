/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Contrato;
import com.roca.siadi.entity.Turno;

/**
 *
 * @author nerio
 */
public interface TurnoService extends GenericService<Turno> {

    List<Turno> listarTurno(Contrato c);
    
    boolean existeTurno(Turno t);
}
