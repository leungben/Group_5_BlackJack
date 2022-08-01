/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fundamentals of Software Design and Development 1225_91756 ID 991329385
 *
 * @author Benedict Leung
 */
public class Main {

    public static void main(String[] args) throws Exception {
        boolean exit = true;
        Scanner input1 = new Scanner(System.in);
        do {
            try {
                System.out.println("Please enter 1 to play BlackJack or 2 to exit");
                int choice = input1.nextInt();
                switch (choice) {
                    case 1:
                        BlackJack player = new BlackJack("BlackJack");
                        player.play();
                        break;
                    case 2:
                        exit = false;
                        break;
                    default:
                        System.out.println("Please Enter 1 or 2");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                input1.next();
            }
        } while (exit);
        input1.close();

    }
}
