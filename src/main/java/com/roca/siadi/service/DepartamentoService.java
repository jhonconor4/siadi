/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Departamento;
import com.roca.siadi.entity.Pais;

/**
 *
 * @author ROCA
 */
public interface DepartamentoService extends GenericService<Departamento> {

    List<Departamento> listarPorPais(Pais p);
}
