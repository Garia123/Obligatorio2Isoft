/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;
import javax.swing.JLabel;
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
    
    Agenda instancia;
    
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
        instancia = new Agenda();
        instancia.setFecha(new Date(120, 0, 1));
        String expResult = "01/01/2020";
        String result = instancia.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Agenda.
     */
    @Test
    public void testSetFecha() {
        instancia = new Agenda();
        instancia.setFecha(new Date(120, 0, 1));
        String expResult = "01/01/2020";
        String result = instancia.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescripcion method, of class Agenda.
     */
    @Test
    public void testGetDescripcion() {
        instancia = new Agenda();
        instancia.setDescripcion("Descripcion ejemplo");
        String expResult = "Descripcion ejemplo";
        String result = instancia.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Agenda.
     */
    @Test
    public void testSetDescripcion() {
        instancia = new Agenda();
        instancia.setDescripcion("Descripcion ejemplo");
        String expResult = "Descripcion ejemplo";
        String result = instancia.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEvento method, of class Agenda.
     */
    @Test
    public void testGetEvento() {
        instancia = new Agenda();
        instancia.setEvento("Evento ejemplo");
        String expResult = "Evento ejemplo";
        String result = instancia.getEvento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEvento method, of class Agenda.
     */
    @Test
    public void testSetEvento() {
        instancia = new Agenda();
        instancia.setEvento("Evento ejemplo");
        String expResult = "Evento ejemplo";
        String result = instancia.getEvento();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoEvento method, of class Agenda.
     */
    @Test
    public void testGetTipoEvento() {
        instancia = new Agenda();
        instancia.setTipoEvento("Tipo evento ejemplo");
        String expResult = "Tipo evento ejemplo";
        String result = instancia.getTipoEvento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoEvento method, of class Agenda.
     */
    @Test
    public void testSetTipoEvento() {
        instancia = new Agenda();
        instancia.setTipoEvento("Tipo evento ejemplo");
        String expResult = "Tipo evento ejemplo";
        String result = instancia.getTipoEvento();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFamilia method, of class Agenda.
     */
    @Test
    public void testGetFamiliaIgualAtributos() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Nombre ejemplo", "Email ejemplo");
        Familia result = instancia.getFamilia();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFamilia method, of class Agenda.
     */
    @Test
    public void testGetFamiliaIgualNombre() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Nombre ejemplo", "Ejemplo email");
        Familia result = instancia.getFamilia();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFamilia method, of class Agenda.
     */
    @Test
    public void testGetFamiliaIgualEmail() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Ejemplo nombre", "Email ejemplo");
        Familia result = instancia.getFamilia();
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of getFamilia method, of class Agenda.
     */
    @Test
    public void testGetFamiliaDistintosAtributos() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Ejemplo nombre", "Ejemplo email");
        Familia result = instancia.getFamilia();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setFamilia method, of class Agenda.
     */
    @Test
    public void testSetFamiliaIgualAtributos() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Nombre ejemplo", "Email ejemplo");
        Familia result = instancia.getFamilia();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setFamilia method, of class Agenda.
     */
    @Test
    public void testSetFamiliaIgualNombre() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Nombre ejemplo", "Ejemplo email");
        Familia result = instancia.getFamilia();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setFamilia method, of class Agenda.
     */
    @Test
    public void testSetFamiliaIgualEmail() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Ejemplo nombre", "Email ejemplo");
        Familia result = instancia.getFamilia();
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of setFamilia method, of class Agenda.
     */
    @Test
    public void testSetFamiliaDistintosAtributos() {
        instancia = new Agenda();
        instancia.setFamilia(new Familia("Nombre ejemplo", "Email ejemplo"));
        Familia expResult = new Familia("Ejemplo nombre", "Ejemplo email");
        Familia result = instancia.getFamilia();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getPerro method, of class Agenda.
     */
    @Test
    public void testGetPerroIgualNombre() {
        instancia = new Agenda();
        instancia.setPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        Perro expResult = new Perro("Nombre ejemplo", 0, 0, "", null);
        Perro result = instancia.getPerro();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getPerro method, of class Agenda.
     */
    @Test
    public void testGetPerroDistintoNombre() {
        instancia = new Agenda();
        instancia.setPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        Perro expResult = new Perro("Ejemplo nombre", 0, 0, "", null);
        Perro result = instancia.getPerro();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setPerro method, of class Agenda.
     */
    @Test
    public void testSetPerroIgualNombre() {
        instancia = new Agenda();
        instancia.setPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        Perro expResult = new Perro("Nombre ejemplo", 0, 0, "", null);
        Perro result = instancia.getPerro();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setPerro method, of class Agenda.
     */
    @Test
    public void testSetPerroDistintoNombre() {
        instancia = new Agenda();
        instancia.setPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        Perro expResult = new Perro("Ejemplo nombre", 0, 0, "", null);
        Perro result = instancia.getPerro();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Agenda.
     */
    @Test
    public void testToString() {
        instancia = new Agenda();
        instancia.setEvento("Evento ejemplo");
        instancia.setFecha(new Date(120, 0, 1));
        String expResult = "Evento ejemplo - 01/01/2020";
        String result = instancia.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Agenda.
     */
    @Test
    public void testCompareToPrimeroMayor() {
        Object t = new Agenda(null, null, "", "", "", new Date(120, 0, 1));
        Agenda instance = new Agenda(null, null, "", "", "", new Date(121, 0, 1));
        int expResult = 1;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of compareTo method, of class Agenda.
     */
    @Test
    public void testCompareToSegundoMayor() {
        Object t = new Agenda(null, null, "", "", "", new Date(121, 0, 1));
        Agenda instance = new Agenda(null, null, "", "", "", new Date(120, 0, 1));
        int expResult = -1;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of compareTo method, of class Agenda.
     */
    @Test
    public void testCompareToIguales() {
        Object t = new Agenda(null, null, "", "", "", new Date(120, 0, 1));
        Agenda instance = new Agenda(null, null, "", "", "", new Date(120, 0, 1));
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
    }
}
