/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.DetalleventaDao;
import com.roca.siadi.entity.Detalleventa;
import com.roca.siadi.entity.Venta;
import com.roca.siadi.service.DetalleventaService;

/**
 *
 * @author ROCA
 */
@Service
public class DetalleventaServiceImpl extends GenericServiceImpl<Detalleventa> implements DetalleventaService {

    @Autowired
    DetalleventaDao detalleventaDao;

    @Override
    public List<Detalleventa> listarPorVenta(Venta v) {
        return detalleventaDao.consultList("from Detalleventa dv where dv.venta.id=" + v.getId());
    }

}
