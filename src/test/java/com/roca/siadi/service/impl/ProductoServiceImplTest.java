/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roca.siadi.service.impl;

import com.roca.siadi.configuration.AppConfig;
import com.roca.siadi.configuration.HibernateConfiguration;
import com.roca.siadi.entity.Categoria;
import com.roca.siadi.entity.Marca;
import com.roca.siadi.entity.Producto;
import com.roca.siadi.service.ProductoService;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Roca
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, HibernateConfiguration.class})
@WebAppConfiguration
public class ProductoServiceImplTest extends TestCase {
    
	@Autowired
	ProductoService pService;
		
    public ProductoServiceImplTest() {
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of obtenerCodigoproducto method, of class ProductoServiceImpl.
     */
//    public void testObtenerCodigoproducto() {
//        System.out.println("obtenerCodigoproducto");
//        Categoria c = null;
//        ProductoServiceImpl instance = new ProductoServiceImpl();
//        int expResult = 0;
//        int result = instance.obtenerCodigoproducto(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of registrarProducto method, of class ProductoServiceImpl.
     */
    @Test
    public void testRegistrarProducto() {
        System.out.println("registrarProducto");
        
        //ENTRADAS
        Categoria cat = new Categoria();
        cat.setId(2);
        Marca mar = new Marca();
        mar.setId(1);
        Producto p = new Producto();
        p.setCantidadmin(10);
        p.setCategoria(cat);
        p.setCodigo("HER-006");
        p.setDescripcion("DESCRIPCION");
        p.setEstado(true);
        p.setFechusuariocrea(new Date());
        p.setId(0);
        p.setIdttipo(54);
        p.setIdtunidadmedida(43);
        p.setIdusuariocrea(1);
        p.setMarca(mar);
        p.setNombre("PRODUCTO YYYY");
        
        MultipartFile f = null;
        HttpServletRequest request = null;
//        
//        ProductoServiceImpl instance = new ProductoServiceImpl();
        
        //RESULTADO
        Producto expResult = p;//RESULTADO DESPUES DE ejeCUtar el meTODO
        expResult.setId(19);
        
        Producto result = pService.registrarProducto(p, f, request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProducto method, of class ProductoServiceImpl.
     */
//    public void testBuscarProducto() {
//        System.out.println("buscarProducto");
//        Producto p = null;
//        ProductoServiceImpl instance = new ProductoServiceImpl();
//        List<Producto> expResult = null;
//        List<Producto> result = instance.buscarProducto(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of actualizarProducto method, of class ProductoServiceImpl.
     */
//    public void testActualizarProducto() {
//        System.out.println("actualizarProducto");
//        Producto p = null;
//        MultipartFile f = null;
//        HttpServletRequest request = null;
//        ProductoServiceImpl instance = new ProductoServiceImpl();
//        Producto expResult = null;
//        Producto result = instance.actualizarProducto(p, f, request);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of eliminarProducto method, of class ProductoServiceImpl.
     */
//    public void testEliminarProducto() {
//        System.out.println("eliminarProducto");
//        Producto p = null;
//        ProductoServiceImpl instance = new ProductoServiceImpl();
//        int expResult = 0;
//        int result = instance.eliminarProducto(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of listarMovimientos method, of class ProductoServiceImpl.
     */
//    public void testListarMovimientos() {
//        System.out.println("listarMovimientos");
//        Producto p = null;
//        ProductoServiceImpl instance = new ProductoServiceImpl();
//        List<String> expResult = null;
//        List<String> result = instance.listarMovimientos(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of listarMovimientosvalorizados method, of class ProductoServiceImpl.
     */
//    public void testListarMovimientosvalorizados() {
//        System.out.println("listarMovimientosvalorizados");
//        Producto p = null;
//        ProductoServiceImpl instance = new ProductoServiceImpl();
//        List<String> expResult = null;
//        List<String> result = instance.listarMovimientosvalorizados(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of buscarProductoAutocomplete method, of class ProductoServiceImpl.
     */
//    public void testBuscarProductoAutocomplete() {
//        System.out.println("buscarProductoAutocomplete");
//        Producto p = null;
//        ProductoServiceImpl instance = new ProductoServiceImpl();
//        List<Producto> expResult = null;
//        List<Producto> result = instance.buscarProductoAutocomplete(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
