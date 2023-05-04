/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ccuenta;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Josué Noguera
 */
public class CCuentaIT {
    
    public CCuentaIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of setNombre method, of class CCuenta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.setNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CCuenta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CCuenta.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.getEstado();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.ingresar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class CCuenta.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cobroFactura method, of class CCuenta.
     */
    @Test
    public void testCobroFactura() {
        System.out.println("cobroFactura");
        String tipo = "";
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.cobroFactura(tipo, cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
