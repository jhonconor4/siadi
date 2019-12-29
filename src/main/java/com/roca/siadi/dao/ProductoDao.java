/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import javax.servlet.http.HttpSession;

import com.roca.siadi.entity.Producto;

/**
 *
 * @author ROCA
 */
public interface ProductoDao extends GenericDao<Producto> {

    Producto registrarProducto(Producto p);

    int eliminarProducto(Producto p);
}
