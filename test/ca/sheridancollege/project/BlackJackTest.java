/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

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
     * Method of hitting, gives a card prior to hitting
     * Test of hit method, of class BlackJack.
     * Determines based on Ace and Queen whether he busts or not and the game finishes
     * Here with Ace and Queen result should be false because he already has 21 there is no need to continue
     * Only way to run test is to copy and paste the actual code here since creating an actual object for it 
     * would not work as a test since it would be the same as starting the game
     */
    @Test
    public void testHit21() {
        System.out.println("hit");
        Boolean result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("ACE")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        CardPicking uCard = new CardPicking(cards);
        Points point = new Points(uCard);
        //start of copy and pasted Hit code changed userPoint to point
        if(point.getPoints()>21){
            result= false;
        }
        else if(point.getPoints()==21){
            result= false;
        }
        else{
            result=true;
        }
        //end of copy and pasted hit code
        Boolean expResult = false;
        assertEquals(expResult, result);
    }
       /**
     * Method of hitting, gives a card prior to hitting
     * Test of hit method, of class BlackJack.
     * Determines based on Ace and Queen whether he busts or not and the game finishes
     * Here with Ace and ACE result should be True because player has 12 at most 
     * Only way to run test is to copy and paste the actual code here since creating an actual object for it 
     * would not work as a test since it would be the same as starting the game
     */
    @Test
    public void testHitOk() {
        System.out.println("hit");
        Boolean result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("ACE")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("ACE")));
        CardPicking uCard = new CardPicking(cards);
        Points point = new Points(uCard);
        //start of copy and pasted Hit code changed userPoint to point
        if(point.getPoints()>21){
            result= false;
        }
        else if(point.getPoints()==21){
            result= false;
        }
        else{
            result=true;
        }
        //end of copy and pasted hit code
        Boolean expResult = true;
        assertEquals(expResult, result);
    }
    
    /**
     * Method of hitting, gives a card prior to hitting
     * Test of hit method, of class BlackJack.
     * Determines based on Ace and Queen whether he busts or not and the game finishes
     * Here with TWO and King and King result should be false because player has busted with a 22
     * Only way to run test is to copy and paste the actual code here since creating an actual object for it 
     * would not work as a test since it would be the same as starting the game
     */
    @Test
    public void testHitBust() {
        System.out.println("hit");
        Boolean result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("TWO")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("KING")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("KING")));
        CardPicking uCard = new CardPicking(cards);
        Points point = new Points(uCard);
        //start of copy and pasted Hit code changed userPoint to point
        if(point.getPoints()>21){
            result= false;
        }
        else if(point.getPoints()==21){
            result= false;
        }
        else{
            result=true;
        }
        //end of copy and pasted hit code
        Boolean expResult = false;
        assertEquals(expResult, result);
    }

    /**
     * Test of dealer method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * Ensures that if Ace and Queen which is 21 shoudl not pass through while loop and get another card
     * addCard is tested in CardPickingTest thus need not retest here mainly test if code is functional
     */
    @Test
    public void testDealerAbove16() {
        System.out.println("dealer");
        int result =0;
        int expResult =0;
        ArrayList<StandardCard> dCards = new ArrayList<StandardCard>();
        dCards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("ACE")));
        dCards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        CardPicking dCard = new CardPicking(dCards);
        Points dealerPoint = new Points(dCard);

        while(dealerPoint.getPoints() <=16){
            result++;
        }
        assertEquals(expResult, result);
 
    }
    
     /**
     * Test of dealer method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * Ensures that if Ace and Queen which is 21 shoudl not pass through while loop and get another card
     * addCard is tested in CardPicking need not retest here
     */
    @Test
    public void testDealerBelow16() {
        System.out.println("dealer");
        int result =0;
        int expResult =0;
        ArrayList<StandardCard> dCards = new ArrayList<StandardCard>();
        dCards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("ACE")));
        dCards.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("ACE")));
        CardPicking dCard = new CardPicking(dCards);
        Points dealerPoint = new Points(dCard);

        while(dealerPoint.getPoints() <=16){
            result++;
            break;
        }
        assertTrue(result>0);
 
    }
    
        
     /**
     * Test of dealer method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * Ensures that if Ace and Queen which is 21 shoudl not pass through while loop and get another card
     * addCard is tested in CardPicking need not retest here
     */
    @Test
    public void testDealerIs16() {
        System.out.println("dealer");
        int result =0;
        int expResult =0;
        ArrayList<StandardCard> dCards = new ArrayList<StandardCard>();
        dCards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("SIX")));
        dCards.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("KING")));
        CardPicking dCard = new CardPicking(dCards);
        Points dealerPoint = new Points(dCard);

        while(dealerPoint.getPoints() <=16){
            result++;
            break;
        }
        assertTrue(result>0);
 
    }
    
     /**
     * Test of declareWinner method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * 
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        String result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("ACE")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        ArrayList<StandardCard> cards2 = new ArrayList<StandardCard>();
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("KING")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("QUEEN")));
        CardPicking uCard = new CardPicking(cards);
        CardPicking dCard = new CardPicking(cards2);
        
        //start of copy and pasting of method to test if function works
        Points userPoint = new Points(uCard);
        Points dealerPoint = new Points(dCard);
        if(userPoint.getPoints()>21){
            result=("You Busted");
        }
        else if(dealerPoint.getPoints()>21){
            result=("Dealer has Busted you have won");
        }
        else if(userPoint.getPoints()==dealerPoint.getPoints()){
            result=("You have tied, no win or lose ... kinda lost");
        }
        else if(userPoint.getPoints()<dealerPoint.getPoints()){
            result=("You Lost");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            result=("you win");
        }
        else{
            result=("something has gone wrong...");
        }
        //end of copy and pasted testing
        String expResult="you win";
        
        assertEquals(expResult, result);
    }
    
         /**
     * Test of declareWinner method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * 
     */
    @Test
    public void testDeclareLoser() {
        System.out.println("declareWinner");
        String result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("KING")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        ArrayList<StandardCard> cards2 = new ArrayList<StandardCard>();
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("ACE")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("QUEEN")));
        CardPicking uCard = new CardPicking(cards);
        CardPicking dCard = new CardPicking(cards2);
        
        //start of copy and pasting of method to test if function works
        Points userPoint = new Points(uCard);
        Points dealerPoint = new Points(dCard);
        if(userPoint.getPoints()>21){
            result=("You Busted");
        }
        else if(dealerPoint.getPoints()>21){
            result=("Dealer has Busted you have won");
        }
        else if(userPoint.getPoints()==dealerPoint.getPoints()){
            result=("You have tied, no win or lose ... kinda lost");
        }
        else if(userPoint.getPoints()<dealerPoint.getPoints()){
            result=("You Lost");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            result=("you win");
        }
        else{
            result=("something has gone wrong...");
        }
        //end of copy and pasted testing
        String expResult="You Lost";
        
        assertEquals(expResult, result);
    }
    
             /**
     * Test of declareWinner method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * 
     */
    @Test
    public void testDeclareTIE() {
        System.out.println("declareWinner");
        String result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("KING")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        ArrayList<StandardCard> cards2 = new ArrayList<StandardCard>();
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("KING")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("QUEEN")));
        CardPicking uCard = new CardPicking(cards);
        CardPicking dCard = new CardPicking(cards2);
        
        //start of copy and pasting of method to test if function works
        Points userPoint = new Points(uCard);
        Points dealerPoint = new Points(dCard);
        if(userPoint.getPoints()>21){
            result=("You Busted");
        }
        else if(dealerPoint.getPoints()>21){
            result=("Dealer has Busted you have won");
        }
        else if(userPoint.getPoints()==dealerPoint.getPoints()){
            result=("You have tied, no win or lose ... kinda lost");
        }
        else if(userPoint.getPoints()<dealerPoint.getPoints()){
            result=("You Lost");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            result=("you win");
        }
        else{
            result=("something has gone wrong...");
        }
        //end of copy and pasted testing
        String expResult="You have tied, no win or lose ... kinda lost";
        
        assertEquals(expResult, result);
    }
    
                 /**
     * Test of declareWinner method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * 
     */
    @Test
    public void testDeclareBusted() {
        System.out.println("declareWinner");
        String result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("KING")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("JACK")));
        ArrayList<StandardCard> cards2 = new ArrayList<StandardCard>();
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("KING")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("QUEEN")));
        CardPicking uCard = new CardPicking(cards);
        CardPicking dCard = new CardPicking(cards2);
        
        //start of copy and pasting of method to test if function works
        Points userPoint = new Points(uCard);
        Points dealerPoint = new Points(dCard);
        if(userPoint.getPoints()>21){
            result=("You Busted");
        }
        else if(dealerPoint.getPoints()>21){
            result=("Dealer has Busted you have won");
        }
        else if(userPoint.getPoints()==dealerPoint.getPoints()){
            result=("You have tied, no win or lose ... kinda lost");
        }
        else if(userPoint.getPoints()<dealerPoint.getPoints()){
            result=("You Lost");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            result=("you win");
        }
        else{
            result=("something has gone wrong...");
        }
        //end of copy and pasted testing
        String expResult="You Busted";
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of declareWinner method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * 
     */
    @Test
    public void testDeclareDBusted() {
        System.out.println("declareWinner");
        String result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("KING")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        ArrayList<StandardCard> cards2 = new ArrayList<StandardCard>();
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("KING")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("QUEEN")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("JACK")));
        CardPicking uCard = new CardPicking(cards);
        CardPicking dCard = new CardPicking(cards2);
        
        //start of copy and pasting of method to test if function works
        Points userPoint = new Points(uCard);
        Points dealerPoint = new Points(dCard);
        if(userPoint.getPoints()>21){
            result=("You Busted");
        }
        else if(dealerPoint.getPoints()>21){
            result=("Dealer has Busted you have won");
        }
        else if(userPoint.getPoints()==dealerPoint.getPoints()){
            result=("You have tied, no win or lose ... kinda lost");
        }
        else if(userPoint.getPoints()<dealerPoint.getPoints()){
            result=("You Lost");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            result=("you win");
        }
        else{
            result=("something has gone wrong...");
        }
        //end of copy and pasted testing
        String expResult="Dealer has Busted you have won";
        
        assertEquals(expResult, result);
    }
                         /**
     * Test of declareWinner method, of class BlackJack.
     * Again only way to test is by copying code without starting entire instance
     * 
     */
    @Test
    public void testDeclareBothBusted() {
        System.out.println("declareWinner");
        String result;
        ArrayList<StandardCard> cards = new ArrayList<StandardCard>();
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("KING")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("QUEEN")));
        cards.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("JACK")));
        ArrayList<StandardCard> cards2 = new ArrayList<StandardCard>();
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("KING")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("SPADES"),StandardCard.Value.valueOf("QUEEN")));
        cards2.add(new StandardCard(StandardCard.Suit.valueOf("HEARTS"),StandardCard.Value.valueOf("JACK")));
        CardPicking uCard = new CardPicking(cards);
        CardPicking dCard = new CardPicking(cards2);
        
        //start of copy and pasting of method to test if function works
        Points userPoint = new Points(uCard);
        Points dealerPoint = new Points(dCard);
        if(userPoint.getPoints()>21){
            result=("You Busted");
        }
        else if(dealerPoint.getPoints()>21){
            result=("Dealer has Busted you have won");
        }
        else if(userPoint.getPoints()==dealerPoint.getPoints()){
            result=("You have tied, no win or lose ... kinda lost");
        }
        else if(userPoint.getPoints()<dealerPoint.getPoints()){
            result=("You Lost");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            result=("you win");
        }
        else{
            result=("something has gone wrong...");
        }
        //end of copy and pasted testing
        String expResult="You Busted";
        
        assertEquals(expResult, result);
    }
}
