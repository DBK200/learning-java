/*

04.  The challenge is to implement a method that switches letter casing
     (lower -> upper and upper -> lower) of a given string and
     prints out the result.

     All the other non letter characters in the string must remain unchanged.

*/

package com.sessions.session5;

public class MyStringsChallenge04 {
    public static void main(String[] args) {
        //String sText = "";
        String sText = "The number 1 deadliest animal on the PLANET Earth is the ©Human!®";
        System.out.printf("Input: %s%nOutput: %s%n", sText, changeCase(sText));
    }

    public static String changeCase(String sText) {
        // Initial validation
        if (sText.length() == 0) return "(Error) Empty input string.";

        StringBuilder sbText = new StringBuilder();

        for (int i = 0; i < sText.length(); i++) {
            char chLetter = sText.charAt(i);
            if (Character.isLetter(chLetter)) {
                if (Character.isLowerCase(chLetter)) sbText.append(Character.toUpperCase(chLetter));
                else if (Character.isUpperCase(chLetter)) sbText.append(Character.toLowerCase(chLetter));
            }
            else sbText.append(chLetter);
        }
        return sbText.toString();
    }
}
