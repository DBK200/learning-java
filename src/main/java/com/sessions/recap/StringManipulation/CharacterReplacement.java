package com.sessions.recap.StringManipulation;

import java.util.Scanner;

public class CharacterReplacement {

//    Character Replacement: Write a program that prompts the user to enter a string and
//    replaces all occurrences of a specific character in the string with another character
//    using the replace() method. Print out the modified string.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        System.out.println(string.replace('e','a'));
    }
}
