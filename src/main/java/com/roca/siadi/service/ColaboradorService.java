/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Colaborador;

/**
 *
 * @author ROCA
 */
public interface ColaboradorService extends GenericService<Colaborador> {

    List<Colaborador> listarColaborador(Agencia a);

    List<Colaborador> buscarColaborador(Colaborador c);
}
