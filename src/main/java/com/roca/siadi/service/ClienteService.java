/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import com.roca.siadi.entity.Cliente;
import com.roca.siadi.entity.Tablamaestra;
import com.roca.siadi.entity.nuevo.ClienteRepresentlegal;

/**
 *
 * @author ROCA
 */
public interface ClienteService extends GenericService<Cliente> {

    List<Cliente> listarCliente(Tablamaestra tm);

    List<Cliente> listarClientejuridico(Cliente p);

    List<Cliente> listarClientenatural(Cliente p);

    int obtenerCodigocliente(Tablamaestra tm);

    Cliente registrarClientejuridico(ClienteRepresentlegal crl);

    int eliminarClientejuridico(Cliente p);

    Cliente actualizarClientejuridico(Cliente c);

    Cliente registrarClientenatural(Cliente p);

    int eliminarClientenatural(Cliente p);

    Cliente actualizarClientenatural(Cliente p);
}
