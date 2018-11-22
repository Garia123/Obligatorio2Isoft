/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.swing.JFrame;
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
public class ArchivoGrabacionTest {
    
    ArchivoGrabacion instancia;
    
    public ArchivoGrabacionTest() {
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
     * Test of grabarLinea method, of class ArchivoGrabacion.
     */
    @Test
    public void testGrabarLinea() {
        instancia = new ArchivoGrabacion("AGTest.txt", null);
        boolean expResult = false;
        boolean result = instancia.grabarLinea("Texto ejemplo", null);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of cerrar method, of class ArchivoGrabacion.
     */
    @Test
    public void testCerrar() {
        instancia = new ArchivoGrabacion("AGTest.txt", null);
        boolean expResult = false;
        boolean result = instancia.cerrar();
        assertNotEquals(expResult, result);
    }
    
}
