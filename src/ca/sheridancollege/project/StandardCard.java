/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

/**
 * Fundamentals of Software Design and Development 1225_91756
 * ID 991329385
 * @author Benedict Leung
 */
public class StandardCard extends Card{

    
    public enum Suit {HEARTS,SPADES,CLUBS,DIAMONDS};
    public enum Value{ 
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(10),
        QUEEN(10),
        KING(10);
        private int values;
        private Value(int values){
            this.values=values;
        }
        public int getValues(){
            return this.values;
        }
    }
    
    private Suit suit;
    private Value value;
    
   
    public StandardCard(Suit suit, Value value){
        this.suit=suit;
        this.value=value;
    }
    
    public void setSuit(Suit suit){
        this.suit=suit;
    }
    
    public Suit getSuit(){
        return suit;
    }
            
    public void setValue(Value value){
        this.value=value;
    }
    
    public Value getValue(){
        return this.value;
    }
    
    @Override
    public String toString() {
        return "Suit:"+this.suit+" Value:"+this.value;
    }
    
    
}
