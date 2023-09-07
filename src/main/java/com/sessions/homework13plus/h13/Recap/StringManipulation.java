package com.sessions.homework13plus.h13.Recap;

import java.util.Scanner;

public class StringManipulation {
    //Scenario :
    //String Length: Write a program that prompts the user to enter a string and prints out the length of the string.
    //
    //String Concatenation: Write a program that prompts the user to enter two strings and concatenates them
    // using the + operator. Print out the concatenated string.
    //
    //Substring Extraction: Write a program that prompts the user to enter a string and extracts a substring from the string
    // using the substring() method. Print out the extracted substring.
    //
    //String Comparison: Write a program that prompts the user to enter two strings and compares them using the equals() method.
    // Print out a message indicating whether the strings are equal or not.
    //
    //Character Replacement: Write a program that prompts the user to enter a string and replaces all occurrences of a specific
    // character in the string with another character using the replace() method. Print out the modified string.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string to find out the length: ");
        String stringLength = scanner.nextLine();
        System.out.println("Your string's length is equal to " + stringLength.length());
        System.out.println("Enter string1 and string2 to be concatenated");

        String concat1 = scanner.nextLine();
        String concat2 = scanner.nextLine();
        String concatenated = concat1 + concat2;
        System.out.println("The result is " + concatenated);

        System.out.println("Enter the string you want to extract from: ");
        String stringExtraction = scanner.nextLine();
        System.out.println("Enter the start index and the end index of the substring you want to extract.");
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        String stringExtractionResult = stringExtraction.substring(startIndex, endIndex);
        System.out.println("The result is : " + stringExtractionResult);

        System.out.println("Enter a string for which you want to replace a certain character");
        String stringReplace = scanner.nextLine();
        System.out.println("Enter the char you want to replace");
        String replaced = scanner.nextLine();
        System.out.println("Enter the char you want to hold its place");
        String placeHolder = scanner.nextLine();
        String stringReplaceResult = stringReplace.replace(replaced.charAt(0), placeHolder.charAt(0));
        System.out.println("The result is :  " + stringReplaceResult);


    }
}
