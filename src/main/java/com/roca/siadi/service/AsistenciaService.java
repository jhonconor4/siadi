/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.Date;
import java.util.List;

import com.roca.siadi.entity.Asistencia;
import com.roca.siadi.entity.Contrato;
import com.roca.siadi.entity.nuevo.AsistenciaControl;

/**
 *
 * @author nerio
 */
public interface AsistenciaService extends GenericService<Asistencia> {

    List<String> controlSemanal(Contrato c);

    List<AsistenciaControl> controlAsistenciaMensual(Contrato c, Date fecha);
}
