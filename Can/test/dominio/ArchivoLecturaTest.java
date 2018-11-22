/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tomás
 */
public class ArchivoLecturaTest {
    
    ArchivoLectura instancia;
    
    public ArchivoLecturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hayMasLineas method, of class ArchivoLectura.
     */
    @Test
    public void testHayMasLineas() {
        instancia = new ArchivoLectura("AGTest.txt", null);
        boolean expResult = false;
        boolean result = instancia.hayMasLineas();
        assertEquals(expResult, result);
    }

    /**
     * Test of hayMasLineas method, of class ArchivoLectura.
     */
    @Test
    public void testHayMasLineasError() {
        instancia = new ArchivoLectura("ALTest.txt", null);
        boolean expResult = false;
        boolean result = instancia.hayMasLineas();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of linea method, of class ArchivoLectura.
     */
    @Test
    public void testLinea() {
        instancia = new ArchivoLectura("AGTest.txt", null);
        String expResult = "";
        String result = instancia.linea();
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of linea method, of class ArchivoLectura.
     */
    @Test
    public void testLineaError() {
        instancia = new ArchivoLectura("ALTest.txt", null);
        String expResult = "";
        String result = instancia.linea();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of cerrar method, of class ArchivoLectura.
     */
    @Test
    public void testCerrar() {
        instancia = new ArchivoLectura("AGTest.txt", null);
        boolean expResult = false;
        boolean result = instancia.cerrar();
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of cerrar method, of class ArchivoLectura.
     */
    @Test
    public void testCerrarError() {
        instancia = new ArchivoLectura("ALTest.txt", null);
        boolean expResult = false;
        boolean result = instancia.cerrar();
        assertEquals(expResult, result);
    }
    
}
