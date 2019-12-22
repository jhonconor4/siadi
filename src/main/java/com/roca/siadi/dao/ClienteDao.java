/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import com.roca.siadi.entity.Cliente;
import com.roca.siadi.entity.Representantlegal;

/**
 *
 * @author roca
 */
public interface ClienteDao extends GenericDao<Cliente> {

    Cliente registrarClientejuridico(Cliente c, List<Representantlegal> lrl);

    int eliminarClientejuridico(Cliente p);

    Cliente actualizarClientejuridico(Cliente p);

    Cliente registrarClientenatural(Cliente p);

    int eliminarClientenatural(Cliente p);

    Cliente actualizarClientenatural(Cliente p);
}
