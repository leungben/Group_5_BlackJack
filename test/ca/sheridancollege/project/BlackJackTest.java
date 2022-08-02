/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bened
 */
public class BlackJackTest {
    
    public BlackJackTest() {
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
     * Test of play method, of class BlackJack.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        BlackJack instance = null;
        instance.play();
    }

    /**
     * Test of hit method, of class BlackJack.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        BlackJack instance = null;
        instance.hit();
    }

    /**
     * Test of dealer method, of class BlackJack.
     */
    @Test
    public void testDealer() {
        System.out.println("dealer");
        BlackJack instance = null;
        instance.dealer();
    }

    /**
     * Test of declareWinner method, of class BlackJack.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        BlackJack instance = null;
        instance.declareWinner();
    }
    
}
