/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.JustificacionDao;
import com.roca.siadi.entity.Justificacion;
import com.roca.siadi.service.JustificacionService;

/**
 *
 * @author nerio
 */
@Service
public class JustificacionServiceImpl extends GenericServiceImpl<Justificacion> implements JustificacionService {

    @Autowired
    JustificacionDao justificacionDao;

}
