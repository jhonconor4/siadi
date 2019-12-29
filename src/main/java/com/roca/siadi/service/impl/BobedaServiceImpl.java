/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.BobedaDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Bobeda;
import com.roca.siadi.service.BobedaService;

/**
 *
 * @author ROCA
 */
@Service
public class BobedaServiceImpl extends GenericServiceImpl<Bobeda> implements BobedaService {
    
    @Autowired
    BobedaDao bobedaDao;
    
    SimpleDateFormat sdf;
    
    public BobedaServiceImpl() {
        sdf = new SimpleDateFormat("yyyy-MM-dd");
    }
    
    @Override
    public Bobeda crearBobeda(Bobeda b) {
        int c;
        try {
            c = Integer.parseInt(bobedaDao.consultUnique("select count(b) from Bobeda b where b.estado=true and b.agencia.id=" + b.getAgencia().getId()).toString());
        } catch (Exception e) {
            c = 0;
        }
        
        if (c > 0) {
            return null;
        } else {
            return bobedaDao.save(b);
        }
    }
    
    @Override
    public Bobeda obtenerBobeda(Agencia a) {
        return (Bobeda) bobedaDao.consultUnique("from Bobeda b where b.id = (select max(id) from Bobeda bo where bo.estado=true and bo.agencia.id=" + a.getId() + ")");
    }
    
    @Override
    public List<Bobeda> listarBobeda(Date fecha) {
        if (fecha != null) {
            return bobedaDao.consultList("from Bobeda b where b.fechusuariocrea>'" + sdf.format(fecha) + "'");
        } else {
            return bobedaDao.findAll();
        }
    }
    
}
