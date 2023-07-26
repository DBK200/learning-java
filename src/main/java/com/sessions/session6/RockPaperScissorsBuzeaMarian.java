package com.sessions.session6;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsBuzeaMarian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        String userChoice = scanner.nextLine();
        Random random = new Random();
        int randomNumber = random.nextInt(3);


        String computer = "";
        if(randomNumber == 0){
            System.out.println(computer = "Paper");
        } else if (randomNumber == 1) {
            System.out.println(computer = "Rock");
        } else if (randomNumber == 2) {
            System.out.println(computer = "Scissors");
        }
        System.out.println("Computer choose " + computer + "!");

    }
}


