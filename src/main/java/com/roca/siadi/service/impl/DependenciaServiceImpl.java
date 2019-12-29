/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.DependenciaDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Dependencia;
import com.roca.siadi.service.DependenciaService;

/**
 *
 * @author ROCA
 */
@Service
public class DependenciaServiceImpl extends GenericServiceImpl<Dependencia> implements DependenciaService {

    @Autowired
    DependenciaDao dependenciaDao;

    @Override
    public List<Dependencia> listarDependencia(Agencia a) {
        return dependenciaDao.consultList("from Dependencia d where d.agencia.id=" + a.getId());
    }

}
