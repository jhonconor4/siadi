/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.CuotaDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Cuota;
import com.roca.siadi.service.CuotaService;

/**
 *
 * @author NERIO
 */
@Service
public class CuotaServiceImpl extends GenericServiceImpl<Cuota> implements CuotaService {

    @Autowired
    CuotaDao cuotaDao;

    SimpleDateFormat sdf;

    public CuotaServiceImpl() {
        sdf = new SimpleDateFormat("yyyy-MM-dd");
    }

    @Override
    public List<Cuota> listarCuotas(Agencia a) {
        return cuotaDao.consultList("from Cuota c where c.credito.venta.agencia.id=" + a.getId() + " and c.fecha>='" + sdf.format(a.getDatelimit()) + "'");
    }
}
