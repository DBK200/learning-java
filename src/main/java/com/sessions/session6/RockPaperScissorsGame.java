package com.sessions.session6;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        playRockPaperScissors();
    }

    private static void playRockPaperScissors() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        if (!isValidChoice(userChoice)) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
            return;
        }

        int computerChoiceIndex = random.nextInt(options.length);
        String computerChoice = options[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Congratulations, you win!";
        }

        return "Computer wins. Better luck next time!";
    }
}
