/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Usuario;
import com.roca.siadi.entity.nuevo.Data4;

/**
 *
 * @author ROCA
 */
public interface UsuarioService extends GenericService<Usuario> {

    Usuario buscarPorNombre(String usuario);

    Usuario autenticar(Usuario u, HttpSession s);

    Usuario autenticaradmin(Usuario u, HttpSession s);

    List<Usuario> listarUsuarios(Agencia a);

    List<Usuario> listarUsuarioscaja(Agencia a);

    Usuario registrarUsuarioT(Data4 d);

    Usuario actualizarUsuarioT(Data4 d);

    int eliminarUsuarioT(Usuario u);

    Usuario registrarUsuario(Data4 d);

    Usuario actualizarUsuario(Data4 d);

    int eliminarUsuario(Usuario u);

    boolean existeUsuario(String p);
}
