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

import com.roca.siadi.dao.TransferenciaDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Transferencia;
import com.roca.siadi.service.TransferenciaService;

/**
 *
 * @author nerio
 */
@Service
public class TransferenciaServiceImpl extends GenericServiceImpl<Transferencia> implements TransferenciaService {

    @Autowired
    TransferenciaDao transferenciaDao;

    SimpleDateFormat sdf;

    public TransferenciaServiceImpl() {
        sdf = new SimpleDateFormat("yyyy-MM-dd");
    }

    @Override
    public List<Transferencia> listarTransferencias(Agencia a) {
        if (a.getDatelimit() != null) {
            return transferenciaDao.consultList("from Transferencia t where t.bobeda.agencia.id=" + a.getId() + " and t.fecha>'" + sdf.format(a.getDatelimit()) + "'");
        } else {
            return transferenciaDao.consultList("from Transferencia t where t.bobeda.agencia.id=" + a.getId());
        }
    }

}
