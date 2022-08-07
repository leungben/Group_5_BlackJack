/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.CardPicking.*;
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
public class CardPickingTest {
    
    public CardPickingTest() {
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
     * Method is used to add card to player's hand
     * Test of addCard method, of class CardPicking.
     * To Test, we will create a "cards" representing the player's current hand
     * then we will add the first card from the deck "playCard" which we transferred via import
     * and confirm that it is the same card that we grabbing when we use .addCard()
     */
    @Test
    public void testAddCard() {
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        
        System.out.println("addCard");
        CardPicking instance = new CardPicking(cards);
        ArrayList<StandardCard> expResult = new ArrayList<StandardCard>();
        expResult.add(instance.playCard.get(0));
        ArrayList<StandardCard> result = instance.addCard();
        
        assertEquals(expResult, result);
    }
    
        /**
     * Method is used to add card to player's hand
     * Test of addCard method, of class CardPicking.
     * To Test, we will create a "cards" representing the player's current hand
     * then we will add the Second card from the deck "playCard" which we transferred via import
     * and confirm that it is must not be the same card that we grabbing when we use .addCard()
     */
    @Test
    public void testAddTheSecondCard() {
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        
        System.out.println("addCard");
        CardPicking instance = new CardPicking(cards);
        ArrayList<StandardCard> expResult = new ArrayList<StandardCard>();
        expResult.add(instance.playCard.get(1));
        ArrayList<StandardCard> result = instance.addCard();
        
        assertNotSame(expResult, result);
    }

    /**
     * Method is used to obtain the Player's Current Deck or Hand
     * Test of getDeck method, of class CardPicking.
     * Creates an object that will hold what the player currently has/ what the dealer has
     * Inserts One card Into deck/hand,
     * Array with that one card is equivalent to the card I placed in 
     */
    @Test
    public void testGetDeck() {
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("ACE")));
        
        System.out.println("getDeck");
        CardPicking instance = new CardPicking(cards);
        ArrayList<StandardCard> expResult = cards;
        ArrayList<StandardCard> result = instance.getDeck();
        assertEquals(expResult, result);
    }

    
}
