/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.ControlDao;
import com.roca.siadi.entity.Control;
import com.roca.siadi.service.ControlService;

/**
 *
 * @author ROCA
 */
@Service
public class ControlServiceImpl extends GenericServiceImpl<Control> implements ControlService {

    @Autowired
    ControlDao controlDao;

}
