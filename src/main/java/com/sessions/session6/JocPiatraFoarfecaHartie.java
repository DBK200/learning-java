package com.sessions.session6;

import java.util.HashMap;
import java.util.*;

public class JocPiatraFoarfecaHartie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> numberToString = new HashMap<>();
        numberToString.put(0, "Piatra");
        numberToString.put(1, "Foarfeca");
        numberToString.put(2, "Hartie");

        System.out.println(numberToString);

        Random random = new Random();
        int randomNum = random.nextInt(3);
        int input = scanner.nextInt();

        System.out.println("Calculatorul a ales: " + randomNum);

        if (input == 0 && randomNum == 0) {
            System.out.println("Ai ales piatra si calculatorul la fel.\nRemiza.");
        } else if (input == 1 && randomNum == 1) {
            System.out.println("Ai ales foarfeca si calculatorul la fel.\nRemiza.");
        } else if (input == 2 && randomNum == 2) {
            System.out.println("Ai ales hartie si calculatorul la fel.\nRemiza.");
        } else if (input == 1 && randomNum == 0) {
            System.out.println("Ai ales foarfeca si calculatorul piatra.\nYou lose.");
        } else if (input == 1 && randomNum == 2) {
            System.out.println("Ai ales foarfeca si calculatorul hartie.\nYou win.");
        } else if (input == 2 && randomNum == 0) {
            System.out.println("Ai ales hartie si calculatorul piatra.\nYou win.");
        } else if (input == 2 && randomNum == 1) {
            System.out.println("Ai ales hartie si calculatorul foarfeca.\nYou lose.");
        } else if (input == 0 && randomNum == 1) {
            System.out.println("Ai ales piatra si calculatorul foarfeca.\nYou win.");
        } else if (input == 0 && randomNum == 2) {
            System.out.println("Ai ales piatra si calculatorul hartie.\nYou lose.");
        } else {
            System.out.println("Invalid input");
        }
    }
}






