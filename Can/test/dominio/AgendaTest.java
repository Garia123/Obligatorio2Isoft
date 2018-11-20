/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uuu
 */
public class AgendaTest {
    
    public AgendaTest() {
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
     * Test of getFecha method, of class Agenda.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Agenda instance = new Agenda();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Agenda.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Agenda instance = new Agenda();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Agenda.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Agenda instance = new Agenda();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Agenda.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Agenda instance = new Agenda();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvento method, of class Agenda.
     */
    @Test
    public void testGetEvento() {
        System.out.println("getEvento");
        Agenda instance = new Agenda();
        String expResult = "";
        String result = instance.getEvento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvento method, of class Agenda.
     */
    @Test
    public void testSetEvento() {
        System.out.println("setEvento");
        String evento = "";
        Agenda instance = new Agenda();
        instance.setEvento(evento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoEvento method, of class Agenda.
     */
    @Test
    public void testGetTipoEvento() {
        System.out.println("getTipoEvento");
        Agenda instance = new Agenda();
        String expResult = "";
        String result = instance.getTipoEvento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoEvento method, of class Agenda.
     */
    @Test
    public void testSetTipoEvento() {
        System.out.println("setTipoEvento");
        String tipoEvento = "";
        Agenda instance = new Agenda();
        instance.setTipoEvento(tipoEvento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFamilia method, of class Agenda.
     */
    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        Agenda instance = new Agenda();
        Familia expResult = null;
        Familia result = instance.getFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamilia method, of class Agenda.
     */
    @Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        Familia familiar = null;
        Agenda instance = new Agenda();
        instance.setFamilia(familiar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerro method, of class Agenda.
     */
    @Test
    public void testGetPerro() {
        System.out.println("getPerro");
        Agenda instance = new Agenda();
        Perro expResult = null;
        Perro result = instance.getPerro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerro method, of class Agenda.
     */
    @Test
    public void testSetPerro() {
        System.out.println("setPerro");
        Perro perro = null;
        Agenda instance = new Agenda();
        instance.setPerro(perro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Agenda.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Agenda instance = new Agenda();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Agenda.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object t = null;
        Agenda instance = new Agenda();
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
