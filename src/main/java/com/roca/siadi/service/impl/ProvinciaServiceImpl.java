/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.ProvinciaDao;
import com.roca.siadi.entity.Departamento;
import com.roca.siadi.entity.Provincia;
import com.roca.siadi.service.ProvinciaService;

/**
 *
 * @author ROCA
 */
@Service
public class ProvinciaServiceImpl extends GenericServiceImpl<Provincia> implements ProvinciaService {

    @Autowired
    ProvinciaDao provinciaDao;

    @Override
    public List<Provincia> listarPorDepartamento(Departamento d) {
        return provinciaDao.consultList("from Provincia p where p.departamento.id=" + d.getId());
    }

}
