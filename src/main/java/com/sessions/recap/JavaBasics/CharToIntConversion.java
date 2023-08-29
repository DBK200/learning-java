package com.sessions.recap.JavaBasics;

import java.util.Scanner;

public class CharToIntConversion {

//    Char to Int Conversion: Write a program that prompts the user to enter a single character.
//    Convert the character to its corresponding int value using the Character.getNumericValue() method.
//    What happens if the character is not a numeric digit? How can you handle this scenario?

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String in = myObj.nextLine();
        char ch;
        int number=-1;
        if(in.length()==1) {
            ch = in.charAt(0);

            if(ch>='0'&&ch<='9')
            {
                number=Character.getNumericValue(ch);
            }
            else
                System.out.println("Is not a numeric digit");
        }
        else
            System.out.println("Is not just a character");

        System.out.println(number);

    }

}
