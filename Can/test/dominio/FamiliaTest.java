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
public class FamiliaTest {
    
    Familia instancia;
    
    public FamiliaTest() {
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
     * Test of getNombreFamiliar method, of class Familia.
     */
    @Test
    public void testGetNombreFamiliar() {
        instancia = new Familia();
        instancia.setNombreFamiliar("Nombre ejemplo");
        String expResult = "Nombre ejemplo";
        String result = instancia.getNombreFamiliar();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombreFamiliar method, of class Familia.
     */
    @Test
    public void testSetNombreFamiliar() {
        instancia = new Familia();
        instancia.setNombreFamiliar("Nombre ejemplo");
        String expResult = "Nombre ejemplo";
        String result = instancia.getNombreFamiliar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmailFamiliar method, of class Familia.
     */
    @Test
    public void testGetEmailFamiliar() {
        instancia = new Familia();
        instancia.setEmailFamiliar("ejemplo@email.ej");
        String expResult = "ejemplo@email.ej";
        String result = instancia.getEmailFamiliar();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmailFamiliar method, of class Familia.
     */
    @Test
    public void testSetEmailFamiliar() {
        instancia = new Familia();
        instancia.setEmailFamiliar("ejemplo@email.ej");
        String expResult = "ejemplo@email.ej";
        String result = instancia.getEmailFamiliar();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Familia.
     */
    @Test
    public void testEqualsIgualAtributos() {
        Object obj = new Familia("Nombre ejemplo", "Email ejemplo");
        instancia = new Familia("Nombre ejemplo", "Email ejemplo");
        boolean expResult = false;
        boolean result = instancia.equals(obj);
        assertEquals(instancia, obj);
    }
    
    /**
     * Test of equals method, of class Familia.
     */
    @Test
    public void testEqualsIgualNombre() {
        Object obj = new Familia("Nombre ejemplo", "Email ejemplo");
        instancia = new Familia("Nombre ejemplo", "Ejemplo email");
        boolean expResult = false;
        boolean result = instancia.equals(obj);
        assertEquals(instancia, obj);
    }
    
    /**
     * Test of equals method, of class Familia.
     */
    @Test
    public void testEqualsIgualEmail() {
        Object obj = new Familia("Nombre ejemplo", "Email ejemplo");
        instancia = new Familia("Ejemplo nombre", "Email ejemplo");
        boolean expResult = false;
        boolean result = instancia.equals(obj);
        assertNotEquals(instancia, obj);
    }
    
    /**
     * Test of equals method, of class Familia.
     */
    @Test
    public void testEqualsDistintosAtributos() {
        Object obj = new Familia("Nombre ejemplo", "Email ejemplo");
        instancia = new Familia("Ejemplo nombre", "Ejemplo email");
        boolean expResult = false;
        boolean result = instancia.equals(obj);
        assertNotEquals(instancia, obj);
    }

    /**
     * Test of toString method, of class Familia.
     */
    @Test
    public void testToString() {
        instancia = new Familia();
        instancia.setNombreFamiliar("Nombre ejemplo");
        String expResult = "Nombre ejemplo";
        String result = instancia.toString();
        assertEquals(expResult, result);
    }
    
}
