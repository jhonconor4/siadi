/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.ComprobanteDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.service.ComprobanteService;

/**
 *
 * @author roca
 */
@Service
public class ComprobanteServiceImpl extends GenericServiceImpl<Comprobante> implements ComprobanteService {

    @Autowired
    ComprobanteDao comprobanteDao;

    @Override
    public List<Comprobante> listarPorAgencia(Agencia a) {
        String hql = "from Comprobante c where c.agencia.id=" + a.getId();
        if (a.getIdtipo() != 0) {
            hql += " and c.idttipocomprobante=" + a.getIdtipo();
        }

        if (a.isEstado() == true) {
            hql += " and c.estado=true";
        }

        return comprobanteDao.consultList(hql);
    }

}
