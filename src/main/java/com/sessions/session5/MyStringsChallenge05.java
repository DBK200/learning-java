/*

05.  The challenge is to implement a method that takes two arguments as follows:
      (a) a Sentence (i.e., words separated by spaces and/or punctuation marks)
     and
      (b) a Keyword (i.e., only letters from English alphabet)

     and returns:

      1. The number of words that contain at least 1 character from the Keyword.
      2. The number of words that start with any of the Keyword characters.

     Notes:
      1. The method must be case-insensitive (e.g., "A" is the same as "a").
      2. Write 2 methods, one for each request mentioned above.
      3. [Bonus]
           Try to solve the challenge without duplicating the input string
           or to store its containing words into an array.

*/

package com.sessions.session5;

public class MyStringsChallenge05 {
    public static void main(String[] args) {
        // Input sentence
        String sText = "A quack";

        // Input Keyword
        String sKey = "abc";

        // Result print out
        System.out.printf("Input text: %s%n"
                        + "Input keyword: %s%n"
                        + "oneCharMatch() output: %d%n"
                        + "firstCharMatch() output: %d%n",
                sText, sKey, oneCharMatch(sText, sKey), firstCharMatch(sText, sKey));
    }

    public static int[] getWordSpacesPosition(String sText) {
        // === INFO ===
        // The final array it will also hold the start and length of [sText]
        // because it will be used as an array of indexes in subsequent operations.

        // Validation
        if (sText.length() == 0) return new int[] {0};

        // Variable to hold position of spaces between words, separated by ";".
        // === INFO ===
        // It will always hold [sText] start position.
        StringBuilder sbSpacePos = new StringBuilder("0;");

        // Gets [sText] length to avoid repetitive calls
        // because it will be used several times
        int iTextLength = sText.length();

        for (int i = 0; i < iTextLength; i++) {
            char chChar = Character.toLowerCase(sText.charAt(i));
            if (Character.isSpaceChar(chChar)) sbSpacePos.append(i).append(";");
            else {
                // Enters the last element, [sText] length
                // === INFO ===
                // It will always hold [sText] end position index / length.
                if (i == iTextLength - 1) sbSpacePos.append(iTextLength);
            }
        }

        // Splits the result into a String array
        String arStrResult[] = sbSpacePos.toString().split(";");

        // Output result variable
        int arResult[] = new int[arStrResult.length];

        // Populates the output array
        for (int i = 0; i < arStrResult.length; i++) {
            arResult[i] = Integer.parseInt(arStrResult[i]);
        }

        // Method output
        return arResult;
    }

    public static int oneCharMatch(String sText, String sKey) {
        // Initial validation
        if (sText.length() == 0 || sKey.length() == 0) return -1;

        // Holds position of spaces between words, 0 and length of [sText].
        // Because of prior validation, it will never be a single element array.
        int arSpacePos[] = getWordSpacesPosition(sText);

        int iResult = 0;

        for (int i = 0; i < arSpacePos.length - 1; i++) {

            // Source word used for comparison
            String sWord = sText.substring(arSpacePos[i], arSpacePos[i + 1]);

            for (int j = 0; j < sWord.length(); j++) {
                // Source's current lookup character
                String sChar = String.valueOf(Character.toLowerCase(sWord.charAt(j)));
                if (sKey.toLowerCase().contains(sChar)) {
                    iResult++;
                    break;
                }
            }
        }

        // Method output
        return iResult;
    }

    public static int firstCharMatch(String sText, String sKey) {
        // Initial validation
        if (sText.length() == 0 || sKey.length() == 0) return -1;

        // Holds position of spaces between words, 0 and length of [sText].
        // Because of prior validation, it will never be a single element array.
        int arSpacePos[] = getWordSpacesPosition(sText);

        int iResult = 0;

        for (int i = 0; i < arSpacePos.length - 1; i++) {
            // Source word used for comparison
            String sChar = String.valueOf( sText.substring(arSpacePos[i], arSpacePos[i + 1]).toLowerCase().charAt(0) );
            if (sKey.toLowerCase().contains(sChar)) iResult++;
        }

        // Method output
        return iResult;
    }
}