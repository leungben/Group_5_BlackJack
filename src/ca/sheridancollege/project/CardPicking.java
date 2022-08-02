/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import static ca.sheridancollege.project.BlackJack.playCard;
import java.util.ArrayList;

/**
 * Fundamentals of Software Design and Development 1225_91756
 * ID 991329385
 * @author Benedict Leung
 */
public class CardPicking {
    //public GroupOfCards stackOfCards = new GroupOfCards(52);
    //public ArrayList<StandardCard> playCard = stackOfCards.getCards();
    private ArrayList<StandardCard> deck;
    
    public CardPicking(ArrayList<StandardCard> deck){
        this.deck=deck;
    }
    
    public ArrayList<StandardCard> addCard(){
        deck.add(playCard.get(0));
        playCard.remove(0);
        return deck;
    }
    
    public ArrayList<StandardCard> getDeck(){
        return deck;
    }
            
}
