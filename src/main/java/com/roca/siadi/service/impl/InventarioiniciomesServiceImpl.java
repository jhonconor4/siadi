/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.InventarioiniciomesDao;
import com.roca.siadi.entity.Inventarioiniciomes;
import com.roca.siadi.entity.Producto;
import com.roca.siadi.service.InventarioiniciomesService;

/**
 *
 * @author nerio
 */
@Service
public class InventarioiniciomesServiceImpl extends GenericServiceImpl<Inventarioiniciomes> implements InventarioiniciomesService {

    @Autowired
    InventarioiniciomesDao inventarioiniciomesDao;

    @Override
    public boolean existeRegistro(Producto p, int anio, int mes) {
        try {
            Inventarioiniciomes iim = (Inventarioiniciomes) inventarioiniciomesDao.consultUnique("from Inventarioiniciomes iim where iim.producto.id=" + p.getId() + " and iim.anio=" + anio + " and iim.mes=" + mes);

            return iim != null;
        } catch (Exception e) {
            return true;
        }
    }

    @Override
    public List<Integer> listarAniosInventario() {
        return inventarioiniciomesDao.consultList("select iim.anio from Inventarioiniciomes iim group by iim.anio");
    }

}
