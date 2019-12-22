/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao.impl;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.roca.siadi.dao.ProductoDao;
import com.roca.siadi.entity.Inventarioiniciomes;
import com.roca.siadi.entity.Producto;

/**
 *
 * @author nerio
 */
@Repository
public class ProductoDaoImpl extends GenericDaoImpl<Producto> implements ProductoDao {

    @Override
    public Producto registrarProducto(Producto x, HttpSession s) {
        Session sesion = sesionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        try {
            sesion.save(x);
            tx.commit();
        } catch (Exception e) {
            x = null;
            tx.rollback();
        } finally {
            sesion.close();
        }

        return x;
    }

    @Override
    public int eliminarProducto(Producto p) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();
        Transaction tx = sesion.beginTransaction();

        int r = 0;

        try {
            Query query;

            query = sesion.createQuery("delete from " + Inventarioiniciomes.class.getName() + " x where x.producto.id=" + p.getId());
            query.executeUpdate();

            query = sesion.createQuery("delete from " + Producto.class.getName() + " x where x.id=" + p.getId());
            query.executeUpdate();

            tx.commit();
            r++;
        } catch (Exception e) {
            tx.rollback();
        } finally {
            sesion.close();
        }
        return r;
    }
}
