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
     * Method to randomize the deck of Cards
     * Test of getCards method, of class GroupOfCards.
     * Starts of the game with this method, will create a deck with 52 cards
     * and ensures that cards are not in order
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
     * Method to get size of deck
     * Test of getSize method, of class GroupOfCards.
     * Deck is set to 52, but can be changed based when creating object
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
