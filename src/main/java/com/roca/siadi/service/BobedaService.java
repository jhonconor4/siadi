/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.Date;
import java.util.List;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Bobeda;

/**
 *
 * @author ROCA
 */
public interface BobedaService extends GenericService<Bobeda> {

    Bobeda crearBobeda(Bobeda b);

    Bobeda obtenerBobeda(Agencia a);

    List<Bobeda> listarBobeda(Date fecha);
}
