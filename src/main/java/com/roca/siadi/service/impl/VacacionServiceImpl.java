/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.VacacionDao;
import com.roca.siadi.entity.Vacacion;
import com.roca.siadi.service.VacacionService;

/**
 *
 * @author nerio
 */
@Service
public class VacacionServiceImpl extends GenericServiceImpl<Vacacion> implements VacacionService {

    @Autowired
    VacacionDao vacacionDao;

}
