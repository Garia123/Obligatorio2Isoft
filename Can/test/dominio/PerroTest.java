/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.swing.JLabel;
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
public class PerroTest {
    
    Perro instancia;
    
    public PerroTest() {
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
     * Test of getImagen method, of class Perro.
     */
    @Test
    public void testGetImagen() {
        instancia = new Perro();
        instancia.setImagen(null);
        String expResult = null;
        String result = instancia.getImagen();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImagen method, of class Perro.
     */
    @Test
    public void testSetImagen() {
        instancia = new Perro();
        instancia.setImagen(null);
        String expResult = null;
        String result = instancia.getImagen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNombre method, of class Perro.
     */
    @Test
    public void testGetNombre() {
        instancia = new Perro();
        instancia.setNombre("Nombre ejemplo");
        String expResult = "Nombre ejemplo";
        String result = instancia.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Perro.
     */
    @Test
    public void testSetNombre() {
        instancia = new Perro();
        instancia.setNombre("Nombre ejemplo");
        String expResult = "Nombre ejemplo";
        String result = instancia.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAltura method, of class Perro.
     */
    @Test
    public void testGetAltura() {
        instancia = new Perro();
        instancia.setAltura(5);
        float expResult = 5;
        float result = instancia.getAltura();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setAltura method, of class Perro.
     */
    @Test
    public void testSetAltura() {
        instancia = new Perro();
        instancia.setAltura(5);
        float expResult = 5;
        float result = instancia.getAltura();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getPeso method, of class Perro.
     */
    @Test
    public void testGetPeso() {
        instancia = new Perro();
        instancia.setPeso(5);
        float expResult = 5;
        float result = instancia.getPeso();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPeso method, of class Perro.
     */
    @Test
    public void testSetPeso() {
        instancia = new Perro();
        instancia.setPeso(5);
        float expResult = 5;
        float result = instancia.getPeso();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getComentario method, of class Perro.
     */
    @Test
    public void testGetComentario() {
        instancia = new Perro();
        instancia.setComentario("Comentario ejemplo");
        String expResult = "Comentario ejemplo";
        String result = instancia.getComentario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComentario method, of class Perro.
     */
    @Test
    public void testSetComentario() {
        instancia = new Perro();
        instancia.setComentario("Comentario ejemplo");
        String expResult = "Comentario ejemplo";
        String result = instancia.getComentario();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Perro.
     */
    @Test
    public void testEqualsIgualNombre() {
        Object obj = new Perro("Nombre ejemplo", 0, 0, "", null);
        instancia = new Perro("Nombre ejemplo", 0, 0, "", null);
        boolean expResult = false;
        boolean result = instancia.equals(obj);
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Perro.
     */
    @Test
    public void testEqualsDistintoNombre() {
        Object obj = new Perro("Nombre ejemplo", 0, 0, "", null);
        instancia = new Perro("Ejemplo nombre", 0, 0, "", null);
        boolean expResult = false;
        boolean result = instancia.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Perro.
     */
    @Test
    public void testToString() {
        instancia = new Perro();
        instancia.setNombre("Nombre ejemplo");
        String expResult = "Nombre ejemplo";
        String result = instancia.toString();
        assertEquals(expResult, result);
    }
    
}
