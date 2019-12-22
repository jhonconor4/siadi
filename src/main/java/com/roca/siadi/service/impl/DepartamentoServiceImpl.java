/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.DepartamentoDao;
import com.roca.siadi.entity.Departamento;
import com.roca.siadi.entity.Pais;
import com.roca.siadi.service.DepartamentoService;

/**
 *
 * @author nerio
 */
@Service
public class DepartamentoServiceImpl extends GenericServiceImpl<Departamento> implements DepartamentoService {

    @Autowired
    DepartamentoDao departamentoDao;

    @Override
    public List<Departamento> listarPorPais(Pais p) {
        return departamentoDao.consultList("from Departamento d where d.pais.id=" + p.getId());
    }

}
