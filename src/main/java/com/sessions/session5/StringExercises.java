/*

[x] 1.  Write a program to print out English alphabet.
[x] 2.  Write a program to print out reversed English alphabet.
[x] 3.  Write a program to print out all odd numbers between 1 and 100.
[x] 4.  Write a program to check if given string IS a Palindrome or NOT.
[x] 5.  Write a program to find the number and sum of all integers
        between 100 and 200 which are divisible by 9.
[x] 6.  Write a program to get from console a variable number of numbers
        and display the largest and smallest number entered.

 */

package com.sessions.session5;

import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {

        /*-------------------
         |  Exercise no. 1  |
         -------------------*/
        System.out.printf("[Exercise 01]%nAlphabet print out is: %s%n", printAlphabet());

        /*-------------------
         |  Exercise no. 2  |
         -------------------*/
        System.out.printf("%n[Exercise 02]%nReversed alphabet print out is: %s%n", printReverseAlphabet());

        /*-------------------
         |  Exercise no. 3  |
         -------------------*/
        int iStart = 0;
        int iEnd = 100;
        System.out.printf("%n[Exercise 03]%nOdd numbers between %d and %d are:%n", iStart, iEnd);
        System.out.printf("%s%n", getOddNumbers(iStart,iEnd));

        /*-------------------
         |  Exercise no. 4  |
         -------------------*/
        String sText = "A radar a";
        System.out.printf("%n[Exercise 04]%n\"%s\" is a palindrome returned:%n"
                        + "\t- %b, when case-sensitive%n"
                        + "\t- %b, when case-insensitive%n",
                sText,
                isPalindrome(sText, true),
                isPalindrome(sText, false));

        /*-------------------
         |  Exercise no. 5  |
         -------------------*/
        iStart = 0;
        iEnd = 20;
        String arData[] = getDivisibleByNine(iStart, iEnd).split(";");

        System.out.printf("%n[Exercise 05]%nNumber count of numbers between %d and %d divisible by 9 is: %s%n"
                        + "The sum of numbers between %1$d and %2$d divisible by 9 is: %s%n",
                iStart, iEnd,
                arData[0], arData[1]);

        /*-------------------
         |  Exercise no. 6  |
         -------------------*/
        Scanner sc = new Scanner(System.in);
        StringBuilder sbNumbers = new StringBuilder();

        System.out.printf("%n[Exercise 06]%nEnter the numbers for which you want to get MIN and MAX values, separated by spaces (press enter to quit):%n");

        sbNumbers.append(sc.nextLine());
        sc.close();

        arData = getRangeLimits(sbNumbers).split(";");

        System.out.printf("MIN value is: %s%n"
                        + "MAX value is: %s%n",
                arData[0], arData[1]);

/*      !!! WHILE declaration doesn't get negative numbers !!!

        System.out.printf("%n[Exercise 06]%nEnter the numbers for which you want to get MIN and MAX values, separated by spaces (type q/Q to quit):%n");

        // !!! This declaration doesn't seem to get negative numbers !!!
        while (true) {
            if (sc.next().equalsIgnoreCase("q")) break;
            if (sc.hasNextInt()) {
                sbNumbers.append((sbNumbers.length() == 0) ? "" : ";").append(sc.nextInt());
            }
        }
*/

    }

    private static String printAlphabet(){
        // English alphabet is starting with
        // 'a' and ends up with 'Z'.
        // This method will print out alphabet's letters
        // as mentioned above.
        // (https://symbl.cc/en/unicode/blocks/basic-latin/)

        StringBuilder sbAlphabet = new StringBuilder();
        for (int i = 'a'; i <= 'z'; i++) sbAlphabet.append(Character.toString(i));
        for (int i = 'A'; i <= 'Z'; i++) sbAlphabet.append(Character.toString(i));

        // Returned value
        return sbAlphabet.toString();
    }

    private static String printReverseAlphabet(){
        // English alphabet is starting with
        // 'a' and ends up with 'Z'.
        // This method will print out alphabet's letters
        // in reverse as opposed mentioned above.

        StringBuilder sbRevAlphabet = new StringBuilder();
        for (int i = 'Z'; i >= 'A'; i--) sbRevAlphabet.append(Character.toString(i));
        for (int i = 'z'; i >= 'a'; i--) sbRevAlphabet.append(Character.toString(i));

        // Returned value
        return sbRevAlphabet.toString();
    }

    private static String getOddNumbers(int iStart, int iEnd){
        // Initial validation
        if (iStart >= iEnd) return "[Error] Arguments issue: START >= END";

        StringBuilder sbResult = new StringBuilder();

        for (int i = (iStart % 2 == 0) ? iStart + 1 : iStart; i <= iEnd; i += 2) {
            sbResult.append( (sbResult.length() == 0) ? "" : ", ").append(i);
        }

        // Returned value
        return sbResult.toString();
    }

    private static boolean isPalindrome(String sText, boolean bCaseSensitive){
        // This method will return a boolean that tells if passed argument
        // is a palindrome or not, taking into account
        // the value of [bCaseSensitive] flag.
        // A palindrome is a string that remains the same when reversed.

        String sResult = new StringBuilder(sText).reverse().toString();

        if (bCaseSensitive) return sResult.equals(sText);
        else return sResult.equalsIgnoreCase(sText);
    }

    private static String getDivisibleByNine(int iStart, int iEnd){
        // This method will return the following for the numbers
        // between [iStart] and [iEnd] divisible by 9:
        //  [Numbers count];[Numbers sum]
        //
        // Note:
        //  The method is working only with positive numbers
        //

        // Initial validation
        if (iStart < 0) iStart *= -1;
        if (iEnd < 0) iEnd *= -1;
        if (iStart >= iEnd) return "ERROR;ERROR";

        long lSumResult = 0;
        int iCountResult = 0;

        iStart = (iStart % 9 == 0) ?
                 ((iStart == 0) ? 9 : iStart) : iStart + iStart % 9;

        while(iStart <= iEnd){
            iCountResult++;
            lSumResult += iStart;
            iStart += 9;
        }
        // Returned value
        return iCountResult + ";" + lSumResult;
    }

    private static String getRangeLimits(StringBuilder sbValues){
        // This method will return a string with the MIN and MAX values
        // from a StringBuilder argument that holds numbers separated
        // usually by spaces.
        // Actually, the method will separate the numbers by anything is not:
        //   number (0..9), decimal separator or '-'.
        // The method will separate all the numbers from the argument
        // and will return a string result as follows:
        //  [MIN Value];[MAX value]

        // Initial validation
        if (sbValues.isEmpty()) return "ERROR;ERROR";

        // Regular expression for SPLIT method: anything that's not a number character
        // except for '-' and current decimal separator
        String sRegEx = "[^0-9-" + new DecimalFormatSymbols().getDecimalSeparator() + "]";

        // Stores the numbers into an array of doubles
        String arValues[] = sbValues.toString().split(sRegEx);

        // Initialises returned values
        double dMinValue = Double.MAX_VALUE;
        double dMaxValue = Double.MIN_VALUE;

        for (String item : arValues) {
            double dTempValue = Double.parseDouble(item);
            if (dTempValue < dMinValue) dMinValue = dTempValue;
            else if (dTempValue > dMaxValue) dMaxValue = dTempValue;
        }
        // Returned value
        return dMinValue + ";" + dMaxValue;
    }
}
