/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.dao;

import java.util.List;

import com.roca.siadi.entity.Colaborador;
import com.roca.siadi.entity.Moduloacceso;
import com.roca.siadi.entity.Usuario;

/**
 *
 * @author ROCA
 */
public interface UsuarioDao extends GenericDao<Usuario> {

    Usuario registrarUsuarioT(Colaborador c, Usuario u, List<Moduloacceso> lm);

    Usuario actualizarUsuarioT(Colaborador c, Usuario u, List<Moduloacceso> lm, List<Moduloacceso> lma);

    int eliminarUsuarioT(Colaborador c, Usuario u, List<Moduloacceso> lm);

    Usuario registrarUsuario(Usuario u, List<Moduloacceso> lm);

    Usuario actualizarUsuario(Usuario u, List<Moduloacceso> lm, List<Moduloacceso> lma);

    int eliminarUsuario(Usuario u, List<Moduloacceso> lm);
}
