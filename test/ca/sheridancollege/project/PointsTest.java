/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.StandardCard.Suit.DIAMONDS;
import static ca.sheridancollege.project.StandardCard.Suit.HEARTS;
import static ca.sheridancollege.project.StandardCard.Suit.SPADES;
import static ca.sheridancollege.project.StandardCard.Value.ACE;
import static ca.sheridancollege.project.StandardCard.Value.QUEEN;
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
public class PointsTest {
    
    public PointsTest() {
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
     * Test of getPoints method, of class Points.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(HEARTS,ACE));
        cards.add(new StandardCard(HEARTS,QUEEN));
        CardPicking cardPick = new CardPicking(cards);
        
        Points instance = new Points(cardPick);
        int expResult = 21;
        int result = instance.getPoints();
        assertEquals(expResult, result);
    }
        /**
     * Test of getPoints method, of class Points.
     */
    @Test
    public void testGetPoints2() {
        System.out.println("getPoints");
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(HEARTS,ACE));
        cards.add(new StandardCard(SPADES,ACE));
        CardPicking cardPick = new CardPicking(cards);
        
        Points instance = new Points(cardPick);
        int expResult = 12;
        int result = instance.getPoints();
        assertEquals(expResult, result);
    }
        @Test
    public void testGetPoints3() {
        System.out.println("getPoints");
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(HEARTS,QUEEN));
        cards.add(new StandardCard(SPADES,QUEEN));
        cards.add(new StandardCard(DIAMONDS,QUEEN));
        CardPicking cardPick = new CardPicking(cards);
        
        Points instance = new Points(cardPick);
        int expResult = 30;
        int result = instance.getPoints();
        assertEquals(expResult, result);
    }



    
}
