/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.FuncionDao;
import com.roca.siadi.dao.ModuloDao;
import com.roca.siadi.dao.RolDao;
import com.roca.siadi.entity.Funcion;
import com.roca.siadi.entity.Modulo;
import com.roca.siadi.entity.Rol;
import com.roca.siadi.service.ModuloService;

/**
 *
 * @author nerio
 */
@Service
public class ModuloServiceImpl extends GenericServiceImpl<Modulo> implements ModuloService {

    @Autowired
    ModuloDao moduloDao;
    @Autowired
    RolDao rolDao;
    @Autowired
    FuncionDao funcionDao;

    @Override
    public List<Modulo> listModulos() {
        List<Modulo> lm = moduloDao.findAll();
        for (Modulo m : lm) {
            List<Rol> lr = rolDao.consultList("from Rol r where r.modulo.id=" + m.getId());
            for (Rol r : lr) {
                r.setModulo(null);
                List<Funcion> lf = funcionDao.consultList("from Funcion f where f.rol.id=" + r.getId());
                for (Funcion f : lf) {
                    f.setRol(null);
                    f.setEstado(false);
                    r.setFunciones(lf);
                }
            }
            m.setRoles(lr);
        }
        return lm;
    }

}
