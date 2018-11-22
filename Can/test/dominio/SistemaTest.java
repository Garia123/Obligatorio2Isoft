/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
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
public class SistemaTest {
    
    Sistema instancia;
    
    public SistemaTest() {
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
     * Test of agregarAgenda method, of class Sistema.
     */
    @Test
    public void testAgregarAgenda() {
        instancia = new Sistema();
        instancia.agregarAgenda(new Agenda(null, null, "", "Evento ejemplo", "", new Date(120, 0, 1)));
        String expResult = "Evento ejemplo - 01/01/2020";
        String result = instancia.listaAgenda.get(0).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarPerro method, of class Sistema.
     */
    @Test
    public void testAgregarPerro() {
        instancia = new Sistema();
        instancia.agregarPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        String expResult = "Nombre ejemplo";
        String result = instancia.listaDePerros.get(0).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarFamiliar method, of class Sistema.
     */
    @Test
    public void testAgregarFamiliar() {
        instancia = new Sistema();
        instancia.agregarFamiliar(new Familia("Nombre ejemplo", ""));
        String expResult = "Nombre ejemplo";
        String result = instancia.listaFamilia.get(0).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of existePerro method, of class Sistema.
     */
    @Test
    public void testExistePerroIgualNombre() {
        instancia = new Sistema();
        instancia.agregarPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        boolean expResult = false;
        boolean result = instancia.existePerro("Nombre ejemplo", null);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of existePerro method, of class Sistema.
     */
    @Test
    public void testExistePerroDistintoNombre() {
        instancia = new Sistema();
        instancia.agregarPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        boolean expResult = false;
        boolean result = instancia.existePerro("Ejemplo nombre", null);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of existeFamiliar method, of class Sistema.
     */
    @Test
    public void testExisteFamiliarIgualNombre() {
        instancia = new Sistema();
        instancia.agregarFamiliar(new Familia("Nombre ejemplo", ""));
        boolean expResult = false;
        boolean result = instancia.existeFamiliar("Nombre ejemplo", null);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of existeFamiliar method, of class Sistema.
     */
    public void testExisteFamiliarDistintoNombre() {
        instancia = new Sistema();
        instancia.agregarFamiliar(new Familia("Nombre ejemplo", ""));
        boolean expResult = false;
        boolean result = instancia.existeFamiliar("Ejemplo nombre", null);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of controlRango method, of class Sistema.
     */
    @Test
    public void testControlRangoBordeInferiorNoValido() {
        instancia = new Sistema();
        boolean expResult = false;
        boolean result = instancia.controlRango(null, "0", "", "");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of controlRango method, of class Sistema.
     */
    @Test
    public void testControlRangoBordeSuperiorNoValido() {
        instancia = new Sistema();
        boolean expResult = false;
        boolean result = instancia.controlRango(null, "51", "", "");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of controlRango method, of class Sistema.
     */
    @Test
    public void testControlRangoBordeInferiorValido() {
        instancia = new Sistema();
        boolean expResult = false;
        boolean result = instancia.controlRango(null, "1", "", "");
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of controlRango method, of class Sistema.
     */
    @Test
    public void testControlRangoBordeSuperiorValido() {
        instancia = new Sistema();
        boolean expResult = false;
        boolean result = instancia.controlRango(null, "50", "", "");
        assertNotEquals(expResult, result);
    }

    /**
     * Test of darPerro method, of class Sistema.
     */
    @Test
    public void testDarPerroNoExistente() {
        instancia = new Sistema();
        Perro expResult = new Perro("Nombre ejemplo", 0, 0, "", null);
        Perro result = instancia.darPerro("Nombre ejemplo");
        assertNotSame(expResult, result);
    }
    
    /**
     * Test of darPerro method, of class Sistema.
     */
    @Test
    public void testDarPerroExistente() {
        instancia = new Sistema();
        instancia.agregarPerro(new Perro("Nombre ejemplo", 0, 0, "", null));
        Perro expResult = instancia.listaDePerros.get(0);
        Perro result = instancia.darPerro("Nombre ejemplo");
        assertEquals(expResult, result);
    }

    /**
     * Test of ordenarPorFecha method, of class Sistema.
     */
    @Test
    public void testOrdenarPorFecha() {
        instancia = new Sistema();
        instancia.agregarAgenda(new Agenda(null, null, "", "Evento ejemplo", "", new Date(121, 0, 1)));
        instancia.agregarAgenda(new Agenda(null, null, "", "Evento ejemplo", "", new Date(120, 0, 1)));
        ArrayList<Agenda> expResult = new ArrayList<>();
        expResult.add(new Agenda(null, null, "", "Evento ejemplo", "", new Date(120, 0, 1)));
        expResult.add(new Agenda(null, null, "", "Evento ejemplo", "", new Date(121, 0, 1)));
        ArrayList<Agenda> result = instancia.ordenarPorFecha();
        assertNotSame(expResult, result);
    }
    
}
