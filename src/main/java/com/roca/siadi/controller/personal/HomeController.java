/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.controller.personal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.roca.siadi.util.SessionUtil;

/**
 *
 * @author ROCA
 */
@Controller("phomeController")
@RequestMapping("personal/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpSession session, ModelMap m) {
        return SessionUtil.sesion("personal/index", session, "03", "00", "00", m);
    }
}
