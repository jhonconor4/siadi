/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.roca.siadi.entity.Agencia;
import com.roca.siadi.entity.Almacen;
import com.roca.siadi.entity.Comprobante;
import com.roca.siadi.entity.Departamento;
import com.roca.siadi.entity.Pais;
import com.roca.siadi.entity.Proveedorjuridico;
import com.roca.siadi.entity.Provincia;
import com.roca.siadi.entity.Tablamaestra;
import com.roca.siadi.service.AgenciaService;
import com.roca.siadi.service.AlmacenService;
import com.roca.siadi.service.AndamioService;
import com.roca.siadi.service.BobedaService;
import com.roca.siadi.service.CajaService;
import com.roca.siadi.service.CajeroService;
import com.roca.siadi.service.CategoriaService;
import com.roca.siadi.service.ClienteService;
import com.roca.siadi.service.ColaboradorService;
import com.roca.siadi.service.CompraService;
import com.roca.siadi.service.ComprobanteService;
import com.roca.siadi.service.ContratoService;
import com.roca.siadi.service.CuotaService;
import com.roca.siadi.service.DepartamentoService;
import com.roca.siadi.service.DependenciaService;
import com.roca.siadi.service.DistritoService;
import com.roca.siadi.service.FuncionService;
import com.roca.siadi.service.InventarioService;
import com.roca.siadi.service.InventarioiniciomesService;
import com.roca.siadi.service.MarcaService;
import com.roca.siadi.service.ModuloService;
import com.roca.siadi.service.PaisService;
import com.roca.siadi.service.ProductoService;
import com.roca.siadi.service.ProveedorService;
import com.roca.siadi.service.ProvinciaService;
import com.roca.siadi.service.RepresentantelegalService;
import com.roca.siadi.service.RolService;
import com.roca.siadi.service.TablamaestraService;
import com.roca.siadi.service.TransferenciaService;
import com.roca.siadi.service.UsuarioService;
import com.roca.siadi.service.VentaService;
import java.util.ArrayList;

@Controller
@RequestMapping("common")
public class CommonController {

    @Autowired
    MarcaService marcaService;
    @Autowired
    CategoriaService categoriaService;
    @Autowired
    ProveedorService proveedorService;
    @Autowired
    ProductoService productoService;
    @Autowired
    CompraService compraService;
    @Autowired
    VentaService ventaService;
    @Autowired
    PaisService paisService;
    @Autowired
    DepartamentoService departamentoService;
    @Autowired
    ProvinciaService provinciaService;
    @Autowired
    DistritoService distritoService;
    @Autowired
    AlmacenService almacenService;
    @Autowired
    AndamioService andamioService;
    @Autowired
    RepresentantelegalService representantelegalService;
    @Autowired
    InventarioiniciomesService inventarioiniciomesService;
    @Autowired
    AgenciaService agenciaService;
    @Autowired
    ModuloService moduloService;
    @Autowired
    RolService rolService;
    @Autowired
    FuncionService funcionService;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    TablamaestraService tablamaestraService;
    @Autowired
    InventarioService inventarioService;
    @Autowired
    ComprobanteService comprobanteService;
    @Autowired
    CajaService cajaService;
    @Autowired
    CajeroService cajeroService;
    @Autowired
    BobedaService bobedaService;
    @Autowired
    TransferenciaService transferenciaService;
    @Autowired
    ClienteService clienteService;
    @Autowired
    CuotaService cuotaService;
    @Autowired
    DependenciaService dependenciaService;
    @Autowired
    ColaboradorService colaboradorService;
    @Autowired
    ContratoService contratoService;

    Gson gson;
    Gson gsonD;
    Gson gsonD2;

    public CommonController() {
        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        gsonD = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:dd").create();
        gsonD2 = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
    }

    @RequestMapping(value = "/listarmarca", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarMarca() {
        return gson.toJson(marcaService.list());
    }

    @RequestMapping(value = "/listarcategoria", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarCategoria() {
        return gson.toJson(categoriaService.list());
    }

    @RequestMapping(value = "/listarproveedor", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarProveedor(@RequestBody Tablamaestra tm) {
        return gson.toJson(proveedorService.listarProveedor(tm));
    }

    @RequestMapping(value = "/listarproducto", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarProducto() {
        return gson.toJson(productoService.list());
    }

    @RequestMapping(value = "/listarcompra", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarCompra(@RequestBody Agencia a) {
        return gson.toJson(compraService.listarPorAgencia(a));
    }

    @RequestMapping(value = "/listarpais", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarPais() {
        return gson.toJson(paisService.list());
    }

    @RequestMapping(value = "/listardepartamento", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarDepartamento(@RequestBody Pais p) {
        return gson.toJson(departamentoService.listarPorPais(p));
    }

    @RequestMapping(value = "/listarprovincia", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarProvincia(@RequestBody Departamento d) {
        return gson.toJson(provinciaService.listarPorDepartamento(d));
    }

    @RequestMapping(value = "/listardistrito", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarDistrito(@RequestBody Provincia p) {
        return gson.toJson(distritoService.listarPorProvincia(p));
    }

    @RequestMapping(value = "/listaralmacen", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarAlmacen(@RequestBody Agencia ag) {
        return gson.toJson(almacenService.listarAlmacenes(ag));
    }

    @RequestMapping(value = "/listarandamio", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarAndamio(@RequestBody Almacen a) {
        return gson.toJson(andamioService.listarPorAlmacen(a));
    }

    @RequestMapping(value = "/listarventa", method = RequestMethod.POST)
    @ResponseBody
    public String listarVenta(@RequestBody Agencia a) {
        return gson.toJson(ventaService.listarVentas(a));
    }

    @RequestMapping(value = "/listarcuota", method = RequestMethod.POST)
    @ResponseBody
    public String listarCuota(@RequestBody Agencia a) {
        return gson.toJson(cuotaService.listarCuotas(a));
    }

    @RequestMapping(value = "/listarrepresentantelegal", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarRepresentantelegal(@RequestBody Proveedorjuridico pj) {
        return gson.toJson(representantelegalService.listarPorProveedorjuridico(pj));
    }

    @RequestMapping(value = "/listaraniosinventario", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarAniosinventario() {
        List<Integer> li = inventarioiniciomesService.listarAniosInventario();
        List<String> lr = new ArrayList<>();
        String str = "";
        for (int i = 0; i < li.size(); i++) {
            str = "{\"id\":" + (i + 1) + ",\"anio\":" + li.get(i) + "}";
            lr.add(str);
        }
        return gson.toJson(lr);
    }

    @RequestMapping(value = "/listaragencia", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarAgencia() {
        return gson.toJson(agenciaService.list());
    }

    @RequestMapping(value = "/listarmodulo", method = RequestMethod.POST)
    @ResponseBody
    public String listarModulo() {
        return gson.toJson(moduloService.listModulos());
    }

    @RequestMapping(value = "/listarusuario", method = RequestMethod.POST)
    @ResponseBody
    public String listarUsuario(@RequestBody Agencia a) {
        return gson.toJson(usuarioService.listarUsuarios(a));
    }

    @RequestMapping(value = "/listarusuariot", method = RequestMethod.POST)
    @ResponseBody
    public String listarUsuarioTodos() {
        return gson.toJson(usuarioService.list());
    }

    @RequestMapping(value = "/listartipo", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarTipo(@RequestBody Tablamaestra t) {
        return gson.toJson(tablamaestraService.listarTipo(t));
    }

//    @RequestMapping(value = "/listarunidadmedida", produces = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8", method = RequestMethod.POST)
//    @ResponseBody
//    public String listarUnidadmedida(@RequestBody Tablamaestra u) {
//        return gson.toJson(tablamaestraService.listarUnidadmedida(u));
//    }
    @RequestMapping(value = "/listarinventario", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarInventario(@RequestBody Agencia a) {
        return gson.toJson(inventarioService.listarPorAgencia(a));
    }

    @RequestMapping(value = "/listarcomprobante", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarComprobante(@RequestBody Agencia a) {
        return gson.toJson(comprobanteService.listarPorAgencia(a));
    }

    @RequestMapping(value = "/obtcomprobante", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String obtComprobante(@RequestBody Comprobante c) {
        return gson.toJson(comprobanteService.get(c.getId()));
    }

    @RequestMapping(value = "/listarcaja", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarCaja(@RequestBody Agencia a) {
        return gson.toJson(cajaService.listarPorAgencia(a));
    }

    @RequestMapping(value = "/listarcajero", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarCajero(@RequestBody Agencia a) {
        return gson.toJson(cajeroService.listarPorAgencia(a));
    }

    @RequestMapping(value = "/listarusuariocaja", method = RequestMethod.POST)
    @ResponseBody
    public String listarUsuariocaja(@RequestBody Agencia a) {
        return gson.toJson(usuarioService.listarUsuarioscaja(a));
    }

    @RequestMapping(value = "/listarbobeda", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarBobeda(@RequestBody Date fecha) {
        return gson.toJson(bobedaService.listarBobeda(fecha));
    }

    @RequestMapping(value = "/listartransferencia", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarTransferencia(@RequestBody Agencia a) {
        return gsonD.toJson(transferenciaService.listarTransferencias(a));
    }

    @RequestMapping(value = "/listarcliente", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarCliente(@RequestBody Tablamaestra tm) {
        return gson.toJson(clienteService.listarCliente(tm));
    }

    @RequestMapping(value = "/listardependencia", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarDependencia(@RequestBody Agencia a) {
        return gson.toJson(dependenciaService.listarDependencia(a));
    }

    @RequestMapping(value = "/listarcolaborador", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarColaborador(@RequestBody Agencia a) {
        return gson.toJson(colaboradorService.listarColaborador(a));
    }

    @RequestMapping(value = "/listarcontrato", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String listarContrato(@RequestBody Agencia a) {
        return gson.toJson(contratoService.listarContrato(a));
    }
}
