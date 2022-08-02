/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.BlackJack.playCard;
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
     * Test of addCard method, of class CardPicking.
     */
    @Test
    public void testAddCard() {
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        
        System.out.println("addCard");
        CardPicking instance = new CardPicking(cards);
        ArrayList<StandardCard> expResult = new ArrayList<StandardCard>();
        expResult.add(playCard.get(0));
        ArrayList<StandardCard> result = instance.addCard();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeck method, of class CardPicking.
     */
    @Test
    public void testGetDeck() {
        GroupOfCards stackOfCards = new GroupOfCards(52);
        ArrayList<StandardCard> playCard = stackOfCards.getCards();
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("ACE")));
        
        System.out.println("getDeck");
        CardPicking instance = new CardPicking(cards);
        ArrayList<StandardCard> expResult = cards;
        ArrayList<StandardCard> result = instance.getDeck();
        assertEquals(expResult, result);
    }
    
}
