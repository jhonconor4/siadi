/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.DistritoDao;
import com.roca.siadi.entity.Distrito;
import com.roca.siadi.entity.Provincia;
import com.roca.siadi.service.DistritoService;

/**
 *
 * @author nerio
 */
@Service
public class DistritoServiceImpl extends GenericServiceImpl<Distrito> implements DistritoService {

    @Autowired
    DistritoDao distritoDao;

    @Override
    public List<Distrito> listarPorProvincia(Provincia p) {
        return distritoDao.consultList("from Distrito d where d.provincia.id=" + p.getId());
    }

}
