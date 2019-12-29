/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.CreditoDao;
import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Cliente;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Credito;
import com.roca.siadi.entity.Cuota;
import com.roca.siadi.entity.Tablamaestra;
import com.roca.siadi.entity.Transaccion;
import com.roca.siadi.service.ComprobanteService;
import com.roca.siadi.service.CreditoService;
import com.roca.siadi.service.TablamaestraService;

/**
 *
 * @author ROCA
 */
@Service
public class CreditoServiceImpl extends GenericServiceImpl<Credito> implements CreditoService {

    @Autowired
    CreditoDao creditoDao;
    @Autowired
    TablamaestraService tablamaestraService;
    @Autowired
    ComprobanteService comprobanteService;

    DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
    DecimalFormat df;

    public CreditoServiceImpl() {
        simbolo.setDecimalSeparator('.');
        df = new DecimalFormat("####.#", simbolo);
    }

    @Override
    public List<Credito> listarCreditos(Cliente c) {
        return creditoDao.consultList("from Credito c where c.cliente.id=" + c.getId() + " and (c.pagado=false or c.montoa>0.0)");
    }

    @Override
    public Cuota pagarCuota(Credito cr, Cuota cu, Transaccion tr, Comprobante comp, HttpSession s) {
        Cajero c = (Cajero) s.getAttribute("cajero");
        c.setSaldocierre(Double.parseDouble(df.format(c.getSaldocierre() + cu.getMonto())));

        if (cr.getMontoa() > cu.getMonto()) {
            cr.setMontoa(Double.parseDouble(df.format(cr.getMontoa() - cu.getMonto())));
        } else {
            if (cr.getMontoa() == cu.getMonto()) {
                cr.setMontoa(Double.parseDouble(df.format(cr.getMontoa() - cu.getMonto())));
                cr.setPagado(true);
            } else {
                return null;
            }
        }
        
        cu.setCredito(cr);
        tr.setIdttipotransaccion(tablamaestraService.obtenerTipoIdItem(new Tablamaestra(9, 1)).getId());
        tr.setCajero(c);

        comp = comprobanteService.get(comp.getId());
        comp.setSerie(comp.getSerie() + 1);

        return creditoDao.pagarCuota(cr, cu, tr, c, comp, s);
    }

}
