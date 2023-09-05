package com.sessions.practice.numberguessing;
import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    static Random rand = new Random();

    //the user has to guess a number from 0 to 100
   static int maximum = 100;
    static int nr = Math.abs(rand.nextInt()) % (maximum + 1);

    //the user has 10 trials
    public static void guessNumberGame() {

        Scanner input = new Scanner(System.in);
        System.out.println("Cheat to check: " + nr);
        for(int i =1; i < 5; i++) {
            System.out.println("Type your trial number: ");
            int trial = input.nextInt();
            if(trial > nr)
                System.out.println("your trial number, " + trial + ", is too big");
            else if ( trial < nr)
                System.out.println("your trial  number, " + trial + ", is too small");
            else {
                System.out.println("you got the number");
                break;
            }
        }

        input.close();
        System.out.println("Game over");
    }

    public static void main(String[] args) {
        guessNumberGame();
    }
}
