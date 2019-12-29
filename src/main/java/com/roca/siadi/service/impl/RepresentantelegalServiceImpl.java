/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.RepresentantelegalDao;
import com.roca.siadi.entity.Proveedorjuridico;
import com.roca.siadi.entity.Representantelegal;
import com.roca.siadi.service.RepresentantelegalService;

/**
 *
 * @author ROCA
 */
@Service
public class RepresentantelegalServiceImpl extends GenericServiceImpl<Representantelegal> implements RepresentantelegalService {

    @Autowired
    RepresentantelegalDao representantelegalDao;

    @Override
    public List<Representantelegal> listarPorProveedorjuridico(Proveedorjuridico pj) {
        return representantelegalDao.consultList("from Representantelegal rl where rl.proveedorjuridico.id=" + pj.getId());
    }

}
