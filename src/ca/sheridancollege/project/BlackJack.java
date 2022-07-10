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

    private GroupOfCards stackOfCards = new GroupOfCards(52);
    private ArrayList<StandardCard> playCard = stackOfCards.getCards();
    private ArrayList<StandardCard> userCard = new ArrayList<StandardCard>();
    private ArrayList<StandardCard> dealerCard = new ArrayList<StandardCard>();
    private Boolean exit = true;
    
    @Override
    public void play() {

        Scanner input = new Scanner(System.in);
        userCard.add(playCard.get(0));
        playCard.remove(0);
        userCard.add(playCard.get(0));
        playCard.remove(0);
        dealerCard.add(playCard.get(0));
        playCard.remove(0);
        dealerCard.add(playCard.get(0));
        playCard.remove(0);

        //System.out.println("You see dealer has one card faced up" + dealerCard.get(1).getSuit() + dealerCard.get(1).getValue());
        //System.out.println("Your cards are" + userCard.get(0).getSuit() + userCard.get(0).getValue() + " , " + userCard.get(1).getSuit() + userCard.get(1).getValue());
        while (exit) {
            System.out.println("You see Dealer has one card faced up: " + dealerCard.get(1).getSuit() + " " + dealerCard.get(1).getValue() + "");
            System.out.print("Your cards are");
            for (StandardCard x : userCard) {
                System.out.print(", " + x.getSuit() + " " + x.getValue());
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
            input.close();
        }
    }



    public void hit() {
        int hitPoints=0;
        Boolean hasAce=false;
        userCard.add(playCard.get(0));
        playCard.remove(0);
        
        for(StandardCard y:userCard){
            hitPoints+=y.getValue().getValues();
            if(y.getValue().getValues()==1){
                hasAce=true;
            }
        }
        System.out.println(hitPoints);
        if(hitPoints>21){
            declareLoser();
            exit=false;
        }
        else if(hitPoints==21){
            dealer();
            exit=false;
        }
        else if(hitPoints==11 && hasAce==true){
            dealer();
            exit=false;
        }
        else{
            exit=true;
        }
    }

    public void dealer() {
        int points=0;
        int pointsD=0;
        Boolean hasAce=false;
        for(StandardCard v:userCard){
            points+=v.getValue().getValues();
            if(v.getValue().getValues()==1){
                hasAce=true;
            }
        }
        if(points<=11 && hasAce==true){
            points+=10;
        }
        
        //Calculating Dealer points
        for(StandardCard d:dealerCard){
            pointsD+=d.getValue().getValues();
            if(d.getValue().getValues()==1){
                hasAce=true;
            }
        }
        if(pointsD<=11 && hasAce==true){
            pointsD+=10;
        }
        while(pointsD <=16){
            points+=playCard.get(0).getValue().getValues();
            dealerCard.add(playCard.get(0));
            playCard.remove(0);
        }
        if(pointsD>=21){
            declareWinner();
        }
        else if(points == pointsD){
            System.out.println("you have tied");
        }
        else if(points>pointsD){
            declareWinner();
        }
        else{
            declareLoser();
        }
        
    }
    

    @Override
    public void declareWinner() {
        System.out.println("you win");
        System.out.println("You Dealer's cards are");
        for (StandardCard x : dealerCard) {
            System.out.print(", " + x.getSuit() + " " + x.getValue());
        }
        System.out.print("Your cards are");
        for (StandardCard x : userCard) {
            System.out.print(", " + x.getSuit() + " " + x.getValue());
        }
    }
    
    public void declareLoser(){
        System.out.println("you lose");
        for (StandardCard x : dealerCard) {
            System.out.print(", " + x.getSuit() + " " + x.getValue());
        }
        System.out.print("Your cards are");
        for (StandardCard x : userCard) {
            System.out.print(", " + x.getSuit() + " " + x.getValue());
        }
    }
    
   

}
