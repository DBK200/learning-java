package com.sessions.session20.homework.exercise2;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* Write a program that attempts to access an element of an array at an index entered by the user. Handle the
         case where the index is out of bounds. */

        int[] list = new int[]{3, 6, 7, 4, 1, 9};
        int index;

        System.out.print("Lista de numere: ");
        Arrays.stream(list).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("Introdu un index: ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                index = Integer.parseInt(scanner.next());
                System.out.println("Elementul din lista la indexul introdus este: " + list[index-1]);
                break;
            } catch (NumberFormatException exception) {
                System.out.print("Indexul introdus nu este un numar intreg. Reintrodu indexul: ");
            } catch (IndexOutOfBoundsException exception) {
                System.out.print("Numarul introdus este in afara listei. Reintrodu indexul: ");
            }
        }
    }
}
