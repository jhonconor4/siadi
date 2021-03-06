/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.ColaboradorDao;
import com.roca.siadi.dao.UsuarioDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Colaborador;
import com.roca.siadi.service.ColaboradorService;

/**
 *
 * @author ROCA
 */
@Service
public class ColaboradorServiceImpl extends GenericServiceImpl<Colaborador> implements ColaboradorService {

    @Autowired
    ColaboradorDao colaboradorDao;
    @Autowired
    UsuarioDao usuarioDao;

    @Override
    public List<Colaborador> listarColaborador(Agencia a) {
        return colaboradorDao.consultList("from Colaborador c where c.agencia.id=" + a.getId());
    }

    @Override
    public List<Colaborador> buscarColaborador(Colaborador c) {
        String ci = "";
        if (c.getTipobusqueda() == 1) {
            List<Integer> li = usuarioDao.consultList("select u.colaborador.id from Usuario u where u.colaborador.agencia.id=" + c.getAgencia().getId());

            for (Integer i : li) {
                ci += " and c.id!=" + i;
            }
        }

        if (c.getId() == 1) {
            return colaboradorDao.consultList("from Colaborador c where c.agencia.id=" + c.getAgencia().getId() + " and c.dni=" + c.getDni() + ci);
        } else {
            return colaboradorDao.consultList("from Colaborador c where c.agencia.id=" + c.getAgencia().getId() + " and (c.nombre like '%" + c.getNombre() + "%' or c.apellidopat like '%" + c.getApellidopat() + "%' or c.apellidomat like '%" + c.getApellidomat() + "%')" + ci);
        }
    }

}
