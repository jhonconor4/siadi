/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Dependencia;

/**
 *
 * @author ROCA
 */
public interface DependenciaService extends GenericService<Dependencia> {

    List<Dependencia> listarDependencia(Agencia a);
}
