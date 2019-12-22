/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roca.siadi.dao.DetalleventaDao;
import com.roca.siadi.dao.InventarioDao;
import com.roca.siadi.dao.VentaDao;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Cajero;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Credito;
import com.roca.siadi.entity.Detalleventa;
import com.roca.siadi.entity.Inventario;
import com.roca.siadi.entity.Tablamaestra;
import com.roca.siadi.entity.Transaccion;
import com.roca.siadi.entity.Venta;
import com.roca.siadi.service.ComprobanteService;
import com.roca.siadi.service.TablamaestraService;
import com.roca.siadi.service.VentaService;

/**
 *
 * @author nerio
 */
@Service
public class VentaServiceImpl extends GenericServiceImpl<Venta> implements VentaService {

    @Autowired
    VentaDao ventaDao;
    @Autowired
    DetalleventaDao detalleventaDao;
    @Autowired
    InventarioDao inventarioDao;
    @Autowired
    TablamaestraService tablamaestraService;
    @Autowired
    ComprobanteService comprobanteService;

    SimpleDateFormat sdf;
    DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
    DecimalFormat df;

    public VentaServiceImpl() {
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        simbolo.setDecimalSeparator('.');
        df = new DecimalFormat("####.#", simbolo);
    }

    @Override
    public int obtenerCodigoventa(Agencia a) {
        int dato;
        try {
            dato = Integer.parseInt(ventaDao.consultUnique("select count(v) from Venta v where v.agencia.id=" + a.getId()).toString());
        } catch (Exception e) {
            dato = 0;
        }
        return dato + 1;
    }

    @Override
    public Venta registrarVenta(Venta v, List<Detalleventa> ldv, Comprobante comp, HttpSession s) {
        List<Inventario> li = new ArrayList<>();

        for (Detalleventa dv : ldv) {
            Inventario i = inventarioDao.read(dv.getInventario().getId());
            if (dv.getCantidad() > i.getCantidad()) {
                v.setId(-1);
                v.setNombrecliente(i.getProducto().getNombre());
                return v;
            } else {
                i.setCantidad(i.getCantidad() - dv.getCantidad());
                li.add(i);
            }
        }
        Cajero c = (Cajero) s.getAttribute("cajero");
        c.setSaldocierre(Double.parseDouble(df.format(c.getSaldocierre() + v.getMontototal())));

        Transaccion tr = new Transaccion(tablamaestraService.obtenerTipoIdItem(new Tablamaestra(9, 1)).getId(), v.getIdttipocomprobante(), v.getMontototal(), new Date(), v.getIdusuariocrea(), v.getFechusuariocrea());
        tr.setNrocomprobante(v.getNrocomprobante());
        tr.setSrecomprobante(v.getSeriecomprobante());
        tr.setCajero(c);

        comp = comprobanteService.get(comp.getId());
        comp.setSerie(comp.getSerie() + 1);

        return ventaDao.registrarVenta(v, ldv, li, tr, c, comp, s);
    }

    @Override
    public Venta registrarVentac(Venta v, List<Detalleventa> ldv, HttpSession s) {
        List<Inventario> li = new ArrayList<>();

        for (Detalleventa dv : ldv) {
            Inventario i = inventarioDao.read(dv.getInventario().getId());
            if (dv.getCantidad() > i.getCantidad()) {
                v.setId(-1);
                v.setNombrecliente(i.getProducto().getNombre());
                return v;
            } else {
                i.setCantidad(i.getCantidad() - dv.getCantidad());
                li.add(i);
            }
        }
        Cajero c = (Cajero) s.getAttribute("cajero");

        Credito cr = new Credito(v.getCliente(), null, c.getId(), v.getMontototal(), v.getMontototal(), new Date(), false, v.getIdusuariocrea(), v.getFechusuariocrea());

        return ventaDao.registrarVentac(v, ldv, li, cr);
    }

    @Override
    public int eliminarVenta(Venta v) {
        List<Detalleventa> ldv = detalleventaDao.consultList("from Detalleventa dv where dv.venta.id=" + v.getId());
        return ventaDao.eliminarVenta(v, ldv);
    }

    @Override
    public List<Venta> listarVentas(Agencia a) {
        return ventaDao.consultList("from Venta v where v.agencia.id=" + a.getId() + " and v.fechusuariocrea>='" + sdf.format(a.getDatelimit()) + "'");
    }

    @Override
    public List<Venta> listarVentaFechas(Venta v) {
        return ventaDao.consultList("from Venta v where v.fechusuariocrea>='" + sdf.format(v.getFechusuariocrea()) + "' and v.fechusuariocrea<='" + sdf.format(v.getFechusuariomod()) + "' and v.estadoventa.id=1");
    }

    @Override
    public List<Venta> listarVentaCodigo(Venta v) {
        return ventaDao.consultList("from Venta v where v.codigo like '%" + v.getCodigo() + "%' and v.estadoventa.id=1");
    }
}
