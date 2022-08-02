/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.StandardCard.Suit.*;
import static ca.sheridancollege.project.StandardCard.Value.*;
import java.util.ArrayList;
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
public class StandardCardTest {
    
    public StandardCardTest() {
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
     * Test of getSuit method, of class StandardCard.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        StandardCard instance = new StandardCard(SPADES,ACE);
        String expResult = "SPADES";
        String result = instance.getSuit().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,ACE);
        String expResult = "ACE";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueTWO() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,TWO);
        String expResult = "TWO";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueTHREE() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,THREE);
        String expResult = "THREE";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueFOUR() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,FOUR);
        String expResult = "FOUR";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueFIVE() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,FIVE);
        String expResult = "FIVE";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueSIX() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,SIX);
        String expResult = "SIX";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueSEVEN() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,SEVEN);
        String expResult = "SEVEN";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueEIGHT() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,EIGHT);
        String expResult = "EIGHT";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }    /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueNINE() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,NINE);
        String expResult = "NINE";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }    /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueTEN() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,TEN);
        String expResult = "TEN";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueJACK() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,JACK);
        String expResult = "JACK";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void testGetValueQUEEN() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,QUEEN);
        String expResult = "QUEEN";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }

        /**
     * Test of getValue method, of class StandardCard.
     */
    @Test
    public void KING() {
        System.out.println("getValue");
        StandardCard instance = new StandardCard(SPADES,KING);
        String expResult = "KING";
        String result = instance.getValue().toString();
        assertEquals(expResult, result);
    }
    /**
     * Test of toString method, of class StandardCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        StandardCard instance = new StandardCard(HEARTS,QUEEN);
        String expResult = "Suit:HEARTS Value:QUEEN";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
