/*

01.  Read from system input a string of characters which can contain spaces.
     Print the number of occurrences of each character in the given string.

     Notes:
     1. printing order is arbitrary.
     2. each letter (together with its number of occurrences) will be printed ones.

 */


package com.sessions.session5;

import java.util.Scanner;

public class StringsChallenge01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter some text and press ENTER: ");
        String sText = sc.nextLine();
        countLetters(sText);
    }

    public static void countLetters(String sText) {
        do {
            char chLetter = sText.charAt(0);
            String sTemp = sText.replaceAll(String.valueOf(chLetter), "");
            int i = sText.length() - sTemp.length();
            System.out.printf("\t- '%c' is present in the text %d time" +
                    (i == 1 ? "" : "s") + "%n", chLetter, i);
            sText = sTemp;
        } while (sText.length() > 0);
    }


}
