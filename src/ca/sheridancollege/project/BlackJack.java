/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Fundamentals of Software Design and Development 1225_91756 ID 991329385
 *
 * @author Benedict Leung
 */
public class BlackJack extends Game {

    BlackJack(String name) {
        super(name);
    }
    
    //private GroupOfCards stackOfCards = new GroupOfCards(52);
    //private ArrayList<StandardCard> playCard = stackOfCards.getCards();
    private ArrayList<StandardCard> userCards = new ArrayList<StandardCard>();
    CardPicking userCard = new CardPicking(userCards);
    private ArrayList<StandardCard> dealerCards = new ArrayList<StandardCard>();
    CardPicking dealerCard = new CardPicking(dealerCards);
    private Boolean exit = true;
    
    @Override
    public void play() {

        Scanner input = new Scanner(System.in);
        userCard.addCard();
        userCard.addCard();
        dealerCard.addCard();
        dealerCard.addCard();
        //userCard.add(playCard.get(0));
        //playCard.remove(0);
        //userCard.add(playCard.get(0));
        //playCard.remove(0);
        //dealerCard.add(playCard.get(0));
        //playCard.remove(0);
        //dealerCard.add(playCard.get(0));
        //playCard.remove(0);
        
        if(userCard.getDeck().get(0).getValue().getValues()+userCard.getDeck().get(0).getValue().getValues()==11){
            dealer();
            exit=false;
        }
        
        
        //System.out.println("You see dealer has one card faced up" + dealerCard.get(1).getSuit() + dealerCard.get(1).getValue());
        //System.out.println("Your cards are" + userCard.get(0).getSuit() + userCard.get(0).getValue() + " , " + userCard.get(1).getSuit() + userCard.get(1).getValue());
        while (exit) {
            System.out.println("You see Dealer has one card faced up: " + dealerCard.getDeck().get(1).getSuit() + " " + dealerCard.getDeck().get(1).getValue() + "");
            System.out.print("Your cards are");
            for (StandardCard x : userCard.getDeck()) {
                System.out.print(", " + x);
            }
            System.out.println("\nPress 1 for hit, 2 for stay");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    hit();
                    break;
                case 2:
                    dealer();
                    exit = false;
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }



    public void hit() {
        userCard.addCard();
        Points userPoint = new Points(userCard);
        /*int hitPoints=0;
        Boolean hasAce=false;
  
        //userCard.add(playCard.get(0));
        //playCard.remove(0);
        
        for(StandardCard y:userCard.getDeck()){
            hitPoints+=y.getValue().getValues();
            if(y.getValue().getValues()==1){
                hasAce=true;
            }
        }
        System.out.println(hitPoints);*/
        System.out.println(userPoint.getPoints());
        
        if(userPoint.getPoints()>21){
            declareWinner();
            exit=false;
        }
        else if(userPoint.getPoints()==21){
            dealer();
            exit=false;
        }
        /*else if(userPoint.getPoints()==11 && userPoint.getAce()==true){
            dealer();
            exit=false;
        }*/
        else{
            exit=true;
        }
    }

    public void dealer() {
        Points userPoint = new Points(userCard);
        Points dealerPoint = new Points(dealerCard);//complete encapsulation via creating a seperate class called points, makes more cohesive and loosly coupled
        
        /*
        int points=0;
        int pointsD=0;
        Boolean hasAce=false;
        for(StandardCard v:userCard.getDeck()){
            points+=v.getValue().getValues();
            if(v.getValue().getValues()==1){
                hasAce=true;
            }
        }
        if(points<=11 && hasAce==true){
            points+=10;
        }
        //System.out.println("User has "+points);
        //Calculating Dealer points
        for(StandardCard d:dealerCard.getDeck()){
            pointsD+=d.getValue().getValues();
            if(d.getValue().getValues()==1){
                hasAce=true;
            }
        }
        if(pointsD<=11 && hasAce==true && pointsD>=7){//if between 7-11 and card is Ace wil become 17-21(which is acceptable for dealer)
            pointsD+=10;
        }
        //System.out.println("dealer has "+ pointsD);
        //System.out.println(playCard.get(0).getValue().getValues());*/
        //System.out.println("user has "+userPoint.getPoints()+"dealer has "+dealerPoint.getPoints());
        while(dealerPoint.getPoints() <=16){//below 16 is unaccetable for dealer assumping user hasnt busted yet
            dealerCard.addCard();
            //System.out.println("user has "+userPoint.getPoints()+"dealer has "+dealerPoint.getPoints());
            /*
            if((playCard.get(0).getValue().getValues()==1 || hasAce==true && pointsD <=11)){//if gets an Ace/originall had an Ace and 
                hasAce=true;//ex 2 + 2 + Ace =15/5
                if(pointsD>=7){
                    pointsD+=10;
                    break;
                }
            }
            pointsD+=playCard.get(0).getValue().getValues();
            //System.out.println(playCard.get(0).getValue().getValues());
            dealerCard.add(playCard.get(0));
            playCard.remove(0);
            //System.out.println("dealer has "+pointsD);
            */
        }
        declareWinner();
        //System.out.println("dealer has "+pointsD);
        /*
        if(dealerPoint.getPoints()>21){
            declareWinner();
        }
        else if(userPoint.getPoints() == dealerPoint.getPoints()){
            System.out.println("you have tied");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            //declareWinner();
        }
        else{
            //declareLoser();
        }*/
        
    }
    
    
    @Override
    public void declareWinner() {
        Points userPoint = new Points(userCard);
        Points dealerPoint = new Points(dealerCard);
        if(userPoint.getPoints()>21){
            System.out.println("You Busted");
        }
        else if(dealerPoint.getPoints()>21){
            System.out.println("Dealer has Busted you have won");
        }
        else if(userPoint.getPoints()==dealerPoint.getPoints()){
            System.out.println("You have tied, no win or lose ... kinda lost");
        }
        else if(userPoint.getPoints()<dealerPoint.getPoints()){
            System.out.println("You Lost");
        }
        else if(userPoint.getPoints()>dealerPoint.getPoints()){
            System.out.println("you win");
        }
        else{
            System.out.println("something has gone wrong...");
        }
        System.out.print("Dealer cards are");
        for (StandardCard v : dealerCard.getDeck()) {
            System.out.print(", " + v);
        }
        System.out.println();
        System.out.print("Your cards are");
        for (StandardCard x : userCard.getDeck()) {
            System.out.print(", " + x);
        }
        System.out.println("\n===============================================================================");
    }
    
  
}
