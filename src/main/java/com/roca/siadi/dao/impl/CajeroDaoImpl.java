/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.roca.siadi.dao.CajeroDao;
import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Transferencia;

/**
 *
 * @author ROCA
 */
@Repository
public class CajeroDaoImpl extends GenericDaoImpl<Cajero> implements CajeroDao {

    @Override
    public Transferencia crearCajero(Transferencia t) {
        Session sesion = sesionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        try {
            sesion.save(t.getCajero());
            sesion.update(t.getBobeda());

            if (t.getMontototal() > 0.0) {
                sesion.save(t);
            }
            tx.commit();
        } catch (Exception e) {
            t = null;
            tx.rollback();
        } finally {
            sesion.close();
        }

        return t;
    }

    @Override
    public Transferencia cerrarCajero(Transferencia tr) {
        Session sesion = sesionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        try {
            sesion.update(tr.getCajero());
            sesion.update(tr.getBobeda());

            sesion.save(tr);
            tx.commit();
        } catch (Exception e) {
            tr = null;
            tx.rollback();
        } finally {
            sesion.close();
        }

        return tr;
    }

}
