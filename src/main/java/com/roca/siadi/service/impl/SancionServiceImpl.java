/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.SancionDao;
import com.roca.siadi.entity.Sancion;
import com.roca.siadi.service.SancionService;

/**
 *
 * @author nerio
 */
@Service
public class SancionServiceImpl extends GenericServiceImpl<Sancion> implements SancionService {

    @Autowired
    SancionDao sancionDao;

}
