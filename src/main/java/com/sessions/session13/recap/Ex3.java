package com.sessions.session13.recap;

import com.sessions.session11.abstraction.defaultMethod.C;

import java.util.Map;
import java.util.Scanner;

public class Ex3 {

    //Write a program that prompts the user to enter a single character.
    //Convert the character to its corresponding int value using the Character.getNumericValue() method.
    //What happens if the character is not a numeric digit? How can you handle this scenario?

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() == 1){
            char charInput = input.charAt(0);
            System.out.println("You entered: " + charInput);
            int numericValue = Character.getNumericValue(charInput);
            System.out.println("The numeric value of your character is: " + numericValue);
        }else {
            System.out.println("invalid input");
        }
    }
    }
