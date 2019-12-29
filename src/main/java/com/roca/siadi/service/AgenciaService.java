/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.roca.siadi.entity.Agencia;

/**
 *
 * @author ROCA
 */
public interface AgenciaService extends GenericService<Agencia> {

    boolean existeInitParams();

    Agencia registrarAgencia(Agencia e, MultipartFile f, HttpServletRequest request);

    Agencia actualizarAgencia(Agencia e, MultipartFile f, HttpServletRequest request);
}
