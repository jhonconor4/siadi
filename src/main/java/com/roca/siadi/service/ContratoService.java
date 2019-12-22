/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Colaborador;
import com.roca.siadi.entity.Contrato;
import com.roca.siadi.entity.Turno;

/**
 *
 * @author nerio
 */
public interface ContratoService extends GenericService<Contrato> {

    Contrato registrarContr(Contrato c, List<Turno> listaturno);

    Contrato actualizarContr(Contrato c);

    Contrato obtenerUltimo(Colaborador c);

    int eliminarContr(Contrato c);

    List<Contrato> listarContrato(Agencia a);
}
