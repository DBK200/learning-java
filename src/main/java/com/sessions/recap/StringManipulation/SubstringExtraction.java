package com.sessions.recap.StringManipulation;

import java.util.Scanner;

public class SubstringExtraction {

//    Substring Extraction: Write a program that prompts the user to enter a string
//    and extracts a substring from the string using the substring() method. Print out the extracted substring.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        System.out.println(string.substring(1,4));

    }
}
