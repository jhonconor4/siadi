/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.AndamioDao;
import com.roca.siadi.entity.Almacen;
import com.roca.siadi.entity.Andamio;
import com.roca.siadi.service.AndamioService;

/**
 *
 * @author nerio
 */
@Service
public class AndamioServiceImpl extends GenericServiceImpl<Andamio> implements AndamioService {

    @Autowired
    AndamioDao andamioDao;

    @Override
    public List<Andamio> listarPorAlmacen(Almacen a) {
        return andamioDao.consultList("from Andamio a where a.almacen.id=" + a.getId());
    }

    @Override
    public Andamio crearAndamio(Andamio a) {
        int dato;
        try {
            dato = Integer.parseInt(andamioDao.consultUnique("select count(a) from Andamio a where a.almacen.id=" + a.getAlmacen().getId()).toString());
        } catch (Exception e) {
            dato = 0;
        }
        a.setCodigo(a.getAlmacen().getCodigo() + "-0" + (dato + 1));

        return andamioDao.save(a);
    }

    @Override
    public int obtenerCodigoandamio(Almacen a) {
        int dato;
        try {
            dato = Integer.parseInt(andamioDao.consultUnique("select count(a) from Andamio a where a.almacen.id=" + a.getId()).toString());
        } catch (Exception e) {
            dato = 0;
        }
        return dato + 1;
    }
}
