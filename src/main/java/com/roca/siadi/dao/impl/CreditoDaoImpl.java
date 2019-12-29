/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao.impl;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.roca.siadi.dao.CreditoDao;
import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Credito;
import com.roca.siadi.entity.Cuota;
import com.roca.siadi.entity.Transaccion;

/**
 *
 * @author ROCA
 */
@Repository
public class CreditoDaoImpl extends GenericDaoImpl<Credito> implements CreditoDao {

    @Override
    public Cuota pagarCuota(Credito cr, Cuota cu, Transaccion tr, Cajero c, Comprobante comp, HttpSession s) {
        Session sesion = sesionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        try {
            sesion.save(cu);

            sesion.save(tr);
            sesion.update(cr);
            sesion.update(comp);
            sesion.update(c);
            
            s.setAttribute("cajero", c);
            tx.commit();
        } catch (Exception e) {
            cu = null;
            tx.rollback();
        } finally {
            sesion.close();
        }
        return cu;
    }

}
