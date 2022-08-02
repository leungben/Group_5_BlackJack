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
public class Points {
    private CardPicking Deck;
    private boolean hasAce=false;
    private int points;
    
    public Points(CardPicking Deck){
        this.Deck=Deck;
    }
    
    public int getPoints(){
        points=0;
        for(StandardCard v:Deck.getDeck()){
            points+=v.getValue().getValues();
            if(v.getValue().getValues()==1){
                hasAce=true;
            }
        }
        if(points<=11 && hasAce==true){
            points+=10;
        }
        return points;
    }
    
}
