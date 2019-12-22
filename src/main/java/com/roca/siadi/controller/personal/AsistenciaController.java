/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.controller.personal;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.roca.siadi.entity.Contrato;
import com.roca.siadi.service.AsistenciaService;
import com.roca.siadi.service.ContratoService;
import com.roca.siadi.service.ControlService;
import com.roca.siadi.util.SessionUtil;


@Controller("pasistenciaController")
@RequestMapping("personal/asistencia")
public class AsistenciaController {

    @Autowired
    AsistenciaService asistenciaService;
    @Autowired
    ControlService controlService;
    @Autowired
    ContratoService contratoService;

    Gson gson, gsond;

    public AsistenciaController() {
        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        gsond = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm").create();
    }

    @RequestMapping(value = "/semanal", method = RequestMethod.GET)
    public String control(ModelMap m, HttpSession s) {
        return SessionUtil.sesion("personal/asistencia/semanal", s, "03", "03", "01", m);
    }
    
    @RequestMapping(value = "/semanal", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public List<String> semanal(@RequestBody Contrato c) {
        return asistenciaService.controlSemanal(c);
    }

    @RequestMapping(value = "/mensual", method = RequestMethod.GET)
    public String mensual(ModelMap m, HttpSession s) {
        return SessionUtil.sesion("personal/asistencia/mensual", s, "03", "03", "02", m);
    }
    
    @RequestMapping(value = "/mensual", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String mensual(@RequestBody Contrato c) {
        return gson.toJson(asistenciaService.controlAsistenciaMensual(c,c.getFecha()));
    }
}
