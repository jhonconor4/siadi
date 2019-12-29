/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.CajaDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Caja;
import com.roca.siadi.service.CajaService;

/**
 *
 * @author ROCA
 */
@Service
public class CajaServiceImpl extends GenericServiceImpl<Caja> implements CajaService {

    @Autowired
    CajaDao cajaDao;

    @Override
    public List<Caja> listarPorAgencia(Agencia a) {
        return cajaDao.consultList("from Caja c where c.agencia.id=" + a.getId());
    }

}
