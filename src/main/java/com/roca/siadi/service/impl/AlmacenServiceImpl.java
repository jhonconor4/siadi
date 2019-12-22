/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.AlmacenDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Almacen;
import com.roca.siadi.service.AlmacenService;

/**
 *
 * @author roca
 */
@Service
public class AlmacenServiceImpl extends GenericServiceImpl<Almacen> implements AlmacenService {

    @Autowired
    AlmacenDao almacenDao;

    @Override
    public int obtenerCodigoalmacen(Agencia a) {
        int dato;
        try {
            dato = Integer.parseInt(almacenDao.consultUnique("select count(a) from Almacen a where a.agencia.id=" + a.getId()).toString());
        } catch (Exception e) {
            dato = 0;
        }
        return dato + 1;
    }

    @Override
    public List<Almacen> listarAlmacenes(Agencia a) {
        return almacenDao.consultList("from Almacen a where a.agencia.id=" + a.getId());
    }

}
