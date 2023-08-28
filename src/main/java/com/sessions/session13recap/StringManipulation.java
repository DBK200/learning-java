package com.sessions.session13recap;

import java.util.Scanner;

public class StringManipulation {
    static Scanner scanner = new Scanner(System.in);
    // 1. String Length: Write a program that prompts the user
    // to enter a string and prints out the length of the string.
//    private static int getStringLength(String str){
//        return str.length();
//    }

    // 2. String Concatenation: Write a program that prompts
    // the user to enter two strings and concatenates them
    // using the + operator. Print out the concatenated string.
//    private static String concatStrings(String str1, String str2){
//        String sum = str1 + str2;
//        return sum;
//    }


    // 3. Substring Extraction: Write a program that prompts
    // the user to enter a string and extracts a substring
    // from the string using the substring() method.
    // Print out the extracted substring.
//    private static String substractString(String str1, int index1, int index2){
//        String result = str1.substring(index1, index2);
//        return result;
//    }

    // 4. String Comparison: Write a program that prompts
    // the user to enter two strings and compares them using
    // the equals() method. Print out a message indicating
    // whether the strings are equal or not.
//    private static String compareStrings(String str1, String str2){
//
//
//        if(str1.equals(str2)){
//            return "The Strings are equal";
//        } else {
//            return "The Strings are NOT equal";
//        }

        // e nevoie de astea sau trebuie comparatie precisa?
//        String str11 = str1.toLowerCase();
//        String str22 = str2.toLowerCase();
//        if(str11.equals(str22)){
//            return "The Strings are equal";
//        } else {
//            return "The Strings are NOT equal";
//        }
   // }

    // 5. Character Replacement: Write a program that prompts
    // the user to enter a string and replaces all occurrences
    // of a specific character in the string with another
    // character using the replace() method.
    // Print out the modified string.
//    private static String replaceCharacter(String str, char chToBeReplaced, char chToReplace){
//        String newStr = str.replace(chToBeReplaced, chToReplace);
//        return newStr;
//    }

    // 6. String Formatting: Write a program that prompts
    // the user to enter a name and an age, and formats
    // them into a sentence using the String.format()
    // method. Print out the formatted sentence.

    public static void main(String[] args) {

        // 1. String Length: Write a program that prompts the user
        // to enter a string and prints out the length of the string.
//        System.out.println("Introduce a String value: ");
//        String str1 = scanner.next() + scanner.nextLine();
//        System.out.println("The length of the introduced String is: " + getStringLength(str1));

        // 2. String Concatenation: Write a program that prompts
        // the user to enter two strings and concatenates them
        // using the + operator. Print out the concatenated string.
//        System.out.println("Introduce String 1: ");
//        String s1 = scanner.next();
//        System.out.println("Introduce String 2: ");
//        String s2 = scanner.next();      // Cum e de fapt corect aici, cu nextLine() sau fara?
//        System.out.println("The concatenation of the 2 Strings is: " + concatStrings(s1, s2));

        // 3. Substring Extraction: Write a program that prompts
        // the user to enter a string and extracts a substring
        // from the string using the substring() method.
        // Print out the extracted substring.
//        System.out.println(substractString("Andreea", 0, 3));  // extracts from index1 until index2
//                                                                                 // but index2 IS NOT INCLUDED
//        System.out.println(substractString("GabrielleCocoChanel", 0, 9 ));

        // 4. String Comparison: Write a program that prompts
        // the user to enter two strings and compares them using
        // the equals() method. Print out a message indicating
        // whether the strings are equal or not.
      //  System.out.println(compareStrings("Andreea", "andreea"));

        // 5. Character Replacement: Write a program that prompts
        // the user to enter a string and replaces all occurrences
        // of a specific character in the string with another
        // character using the replace() method.
        // Print out the modified string.
//        System.out.println("Type a String: ");
//        String s = scanner.next();
//
//        System.out.println("Type char to be replaced: ");
//        String s2 = scanner.next();
//        char c1 = s2.charAt(0);
//
//        System.out.println("Type char to replace the old character: ");
//        String s3 = scanner.next();
//        char c2 = s3.charAt(0);
//
//        System.out.println(replaceCharacter(s, c1, c2));
//        System.out.println(replaceCharacter("Andreea", 'e', 'b'));
//        String S = "Andreea".replace('n', 'w');
//        System.out.println(S);

        // 6. String Formatting: Write a program that prompts
        // the user to enter a name and an age, and formats
        // them into a sentence using the String.format()
        // method. Print out the formatted sentence.
    }
}
