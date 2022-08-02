/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = new GroupOfCards(52);
        ArrayList<StandardCard> expResult=new ArrayList<StandardCard>();
        
        for(StandardCard.Suit s:StandardCard.Suit.values()){
            for(StandardCard.Value v:StandardCard.Value.values()){
                expResult.add(new StandardCard(s,v));
            }
        }
        ArrayList<StandardCard> result = instance.getCards();
        assertNotSame(expResult, result);

    }


    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(52);
        int expResult = 52;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
}
