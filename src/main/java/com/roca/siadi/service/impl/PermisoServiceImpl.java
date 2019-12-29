/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.PermisoDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Contrato;
import com.roca.siadi.entity.Permiso;
import com.roca.siadi.service.PermisoService;

/**
 *
 * @author ROCA
 */
@Service
public class PermisoServiceImpl extends GenericServiceImpl<Permiso> implements PermisoService {

    @Autowired
    PermisoDao permisoDao;

    @Override
    public List<Permiso> listarPermisos(Contrato c) {
        return permisoDao.consultList("from Permiso p where p.contrato.id=" + c.getId());
    }

    @Override
    public List<Permiso> listarPermisos(Agencia a) {
        return permisoDao.consultList("from Permiso p where p.contrato.dependencia.agencia.id=" + a.getId() + " and (p.autorizja=0 or p.autorizjp=0)");
    }

}
