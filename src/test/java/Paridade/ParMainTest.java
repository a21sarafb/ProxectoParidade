/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Paridade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 * Probas unitarias da clase ParMain
 * @author saraf
 */
public class ParMainTest {
    
    /**
     * Constructor por defecto
     */
    public ParMainTest() {
    }

    /**
     * Test of main method, of class ParMain.
     */
    @Test
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ParMain.main(args);
    }

    /**
     * Test of comprobarParidade method, of class ParMain para o número 0.
     */
    @Test
    public void testComprobarParidadeCero() {
        System.out.println("comprobarParidade do 0");
        int numeroProba = 0;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of comprobarParidade method, of class ParMain para o número par positivo.
     */
    @Test
    public void testComprobarParidadeParPositivo() {
        System.out.println("comprobarParidade do 2");
        int numeroProba = 2;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of comprobarParidade method, of class ParMain para o número impar positivo.
     */
    @Test
    public void testComprobarParidadeImparPositivo() {
        System.out.println("comprobarParidade do 1");
        int numeroProba = 1;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of comprobarParidade method, of class ParMain para o número impar negativo.
     */
    @Test
    public void testComprobarParidadeImparNegativo() {
        System.out.println("comprobarParidade do -1");
        int numeroProba = -1;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of comprobarParidade method, of class ParMain para o número par negativo.
     */
    @Test
    public void testComprobarParidadeParNegativo() {
        System.out.println("comprobarParidade do -2");
        int numeroProba = -2;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of verificaPar method, of class ParMain para o cerp
     */
    @Test
    public void testVerificaParCero() {
        System.out.println("verificaPar do cero");
        int numeroProba = 0;
        //boolean resultadoEsperado = true;
        assertTrue (ParMain.verificaPar(numeroProba));
        
    }
    
    /**
     *  Test do método VerificaPar para un número par positivo
     */
    @Test
    public void testVerificaParNumPar() {
        System.out.println("verificaPar do 10");
        int numeroProba = 10;
        //boolean resultadoEsperado = true;
       assertTrue (ParMain.verificaPar(numeroProba));
    }
    
    /**
     *Test do método VerificaPar para un número impar positivo
     */
    @Test
    public void testVerificaParNumImpar() {
        System.out.println("verificaPar do 11");
        int numeroProba = 11;
        //boolean resultadoEsperado = false;
       assertFalse (ParMain.verificaPar(numeroProba));
    }
    
    
}
