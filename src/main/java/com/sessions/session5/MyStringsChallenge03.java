/*

03.  Read from system input a number [n], representing the number of
     space separated words to follow.
     The words read must be stored into a corresponding array.

     Next, read from system input a keyword (i.e., a lookup word, no spaces).

     The challenge is to implement a method {lettersMatchIgnoreCase(String[] array, String key)}
     that uses the previously entered data and returns an array containing all words that have
     at least one letter identical to the keyword.

     Two words have an identical letter if:
      (1) the letter is the same (i.e., not case sensitive)
     and
      (2) the letter is on the same position in both words.

     Examples:
      1. c[a]r ↔ r[a]bbit: -1- identical letter
      2. doctor ↔ risk: no identical letters
      3. des[i]gn ↔ eng[i]neer: -1- identical letter
      4. d[a]n[c]e ↔ v[a]c[c]ine: -2- identical letters

 */

package com.sessions.session5;

import java.util.Arrays;
import java.util.Scanner;

public class MyStringsChallenge03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*-----------------------
         |  Words number entry  |
         -----------------------*/
        int n;
        do {
            System.out.println("Please enter the number of words (n): ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter an integer for the number of words (n): ");
                // this will stop the loop and wait for next entry
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        // gets to new line
        sc.nextLine();

        /*----------------------------
         |  Words and keyword entry  |
         ----------------------------*/
        // Words entry
        String arArray[] = readConsoleStringArray(sc,n);

        // Keyword entry
        String key = readConsoleStringArray(sc);

        /*------------
         |  Results  |
         ------------*/
        System.out.println("Source array: " + Arrays.toString(arArray));

        // Complete result: returns all matches
        String arResult[] = lettersMatchIgnoreCase(arArray,key);
        System.out.println("Complete result array: " + Arrays.toString(arResult));

        // First match result: returns only first match
        arResult = lettersMatchIgnoreCase(arArray,key,false);
        System.out.println("First match result array: " + Arrays.toString(arResult));

        //  Input example:
        //  7
        //  border ant drop Fly racoon class Plane
        //  plot

    }

    public static String readConsoleStringArray(Scanner sc) {
        return readConsoleStringArray(sc, 1)[0];
    }

    public static String[] readConsoleStringArray(Scanner sc, int n) {

        System.out.println("Please enter [" + n + "] word(s) separated by spaces:");

        // Gets the array from console by splitting console content
        // using white spaces as delimiter.
        String arWords[] = sc.nextLine().split("\\W");

        // Stores console array length
        // not to call the function many times
        int iLen1 = arWords.length;

        // Iterates while array content is not as required.
        // This solution will not use the ArrayList class
        while (iLen1 != n) {

            // Console array is smaller than needed
            if (iLen1 < n) {
                System.out.printf("Please enter another [%d] word(s) separated by spaces:%n", n - iLen1);

                // Gets console input and splits it into [arTmp1] array.
                // Sets [limit] identifier of SPLIT method to get
                // only needed elements + 1
                String arTmp1[] = sc.nextLine().split("\\W",n - iLen1 + 1);

                // Gets new array's extra length
                int iLen2 = Math.min(n-iLen1, arTmp1.length);

                // Declares new array that will append the result
                String arTmp2[] = new String[iLen1 + iLen2];

                // Inserts content of incomplete array
                System.arraycopy(arWords,0,arTmp2,0, iLen1);

                // Appends [arTmp1]
                System.arraycopy(arTmp1,0,arTmp2,iLen1,iLen2);

                // Sets new final array
                arWords = arTmp2;

                // Updates array's length
                iLen1 += iLen2;
            }
            // Input is too long and has to be cut down to size
            else {
                // Declares the newly cut to size array
                String arTmp1[] = new String[n];

                // Inserts content from oversized array
                System.arraycopy(arWords,0,arTmp1,0, n);

                // Sets new final array
                arWords = arTmp1;

                // Updates array's length
                iLen1 = n;
            }
        }

        // Returned result
        return arWords;
    }

    public static String[] lettersMatchIgnoreCase(String[] array, String key) {
        return lettersMatchIgnoreCase(array, key, true);
    }

    public static String[] lettersMatchIgnoreCase(String[] array, String key, boolean bAll) {
        // Temporary result holding variable
        StringBuilder sbResult = new StringBuilder();

        // Transforms [key] into a lower case char array
        char arTarget[] = key.toLowerCase().toCharArray();

        // Stores [array] upper bound for further use
        int N = array.length - 1;


        for (int i = 0; i <= N; i++) {

            // Transforms array[i] into a lower case char array
            char arSource[] = array[i].toLowerCase().toCharArray();

            StringBuilder sbCounter = new StringBuilder();

            // Source -> Target character comparison
//            Exit_For:
            for (int j = 0; j < Math.min(arTarget.length,arSource.length); j++) {

                // If match is found, updates temporary result.
                // The final added separator (i.e., [,]), will be erased at a later stage.
                if (arSource[j] == arTarget[j]) {

                    sbCounter.append(arSource[j]).append(":").append(j).append(",");

                    // Exits for loop when first match is found based on [bAll] flag value.
                    if (!bAll) break; //Exit_For;
                }
            }

            // The final added separator (i.e., [;]), will be erased at a later stage.
            if (sbCounter.length() > 0) {
                sbResult.append(array[i]).append("(").
                        append(sbCounter.deleteCharAt(sbCounter.length() - 1)).
                        append(");");
            }

        }

        if (sbResult.length() > 0) {
            sbResult.deleteCharAt(sbResult.length() - 1);
        }

        // Returns the array based on temporary result
        return sbResult.toString().split(";");
    }
}