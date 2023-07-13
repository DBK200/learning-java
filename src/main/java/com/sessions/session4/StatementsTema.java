package com.sessions.session4;

import java.util.Scanner;

public class StatementsTema {
    public static void main(String[] args) {
        int number = 7;
        if (number > 0) {
            System.out.println("Number is greater than 0");
        } else if (number == 7) {
            System.out.println("Number is equal to 7");
        }
        String computer;
        Scanner computer1 = new Scanner(System.in);
        System.out.println("Enter a text line: ");
        computer = computer1.nextLine();

        switch (computer) {
            case "run":
                System.out.println("Computer is running");
                break;
            case "stop":
                System.out.println("Computer is stopped");
                break;
            default:
                System.out.println("Computer is nor working");
                int array[][] = {{1, 2, 3},
                        {2, 1, 4},
                        {4, 2, 1}};
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (j == 1) {
                            System.out.println("j = " + j);
                        }
                    }
                }
                int sum = 0;
                int array1[] = {1, 2, 3, 4, 5, 6};
                for (int i : array1) {
                    sum += i;
                    System.out.println("The sum is " + sum);
                }

                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println("Odd numbers are " + i);
                    }
                }
                int num = 0;
                do {
                    System.out.println(num);
                    num++;
                } while (num < 2);
        }
    }
}

