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

public class StringsChallenge03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
        ==========================
            Words number entry
        ==========================
*/
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

/*
        ================================
            Words and keyword entry
        ================================
*/
        // Words entry
        String arArray[] = readConsoleStringArray(sc,n);

        // Keyword entry
        String key = readConsoleStringArray(sc);

/*
        ===============
            Results
        ===============
*/
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

        // gets the array from console by splitting console content
        // using white spaces as delimiter.
        String sArray[] = sc.nextLine().split("\\W");

        // stores console array length
        // not to call the function many times
        int intLen1 = sArray.length;

        // iterates while array content is not as required
        while (intLen1 != n) {

            // console array is smaller than needed
            if (intLen1 < n) {
                System.out.printf("Please enter another [%d] word(s) separated by spaces:%n", n - intLen1);

                // gets console input and splits it into [sTmpArr1] array.
                // Sets [limit] identifier to get only needed elements + 1
                String sTmpArr1[] = sc.nextLine().split("\\W",n - intLen1 + 1);

                // gets new array's extra length
                int intLen2 = Math.min(n-intLen1, sTmpArr1.length);

                // declares new array that will append the result
                String sTmpArr2[] = new String[intLen1 + intLen2];

                // inserts content of incomplete array
                System.arraycopy(sArray,0,sTmpArr2,0, intLen1);

                // appends [sTmpArr1]
                System.arraycopy(sTmpArr1,0,sTmpArr2,intLen1,intLen2);

                // sets new final array
                sArray = sTmpArr2;

                // updates array's length
                intLen1 += intLen2;
            }
            // input is too long and has to be cut down to size
            else {
                // declares the newly cut to size array
                String sTmpArr1[] = new String[n];

                // inserts content from oversized array
                System.arraycopy(sArray,0,sTmpArr1,0, n);

                // sets new final array
                sArray = sTmpArr1;

                // updates array's length
                intLen1 = n;
            }
        }

        // method's return declaration
        return sArray;
    }

    public static String[] lettersMatchIgnoreCase(String[] array, String key) {
        return lettersMatchIgnoreCase(array, key, true);
    }

    public static String[] lettersMatchIgnoreCase(String[] array, String key, boolean bAll) {
        // sets temporary result holding variable
        StringBuilder sbResult = new StringBuilder();

        // transforms [key] into a lower case char array
        char arTarget[] = key.toLowerCase().toCharArray();

        // stores [array] upper bound for further use
        int N = array.length - 1;


        for (int i = 0; i <= N; i++) {

            // transforms array[i] into a lower case char array
            char arSource[] = array[i].toLowerCase().toCharArray();

            StringBuilder sbCounter = new StringBuilder();

            // source -> target character comparing
//            Exit_For:
            for (int j = 0; j < Math.min(arTarget.length,arSource.length); j++) {

                // if match is found, updates temporary result.
                // The final added separator (i.e., [,]), will be erased at a later stage.
                if (arSource[j] == arTarget[j]) {

                    sbCounter.append(arSource[j]).append(":").append(j).append(",");

                    // exit for loop when first match is found based on [bAll] flag value.
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

        // returns the array based on temporary result
        return sbResult.toString().split(";");
    }
}

