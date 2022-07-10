/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Fundamentals of Software Design and Development 1225_91756
 * ID 991329385
 * @author Benedict Leung
 */
public class Main {
    public static void main(String[] args){
        boolean exit= true;
        Scanner input1 = new Scanner(System.in);
        System.out.println("What is your name:");
        String name=input1.nextLine();
        do{
            System.out.println("Please enter 1 to play or 2 to exit");
            int choice = input1.nextInt();
            input1.nextLine();
            switch(choice){
                case 1:
                    BlackJack player = new BlackJack(name);
                    player.play();
                    break;
                case 2:
                    exit=false;
                    break;
            }
        }while(exit);
        input1.close();
    }
}
