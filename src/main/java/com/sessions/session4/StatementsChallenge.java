package com.sessions.session5;

public class StatementsChallenge {


    public static void main(String[] args) {
        long number = 547;
        System.out.printf("The statement \"%d is a prime number\" is %b.%n",number,isPrime(number));
        System.out.printf("The statement \"%d is an integer number\" is %b.%n",number,isInteger(number));
        System.out.printf("The statement \"%d is a palindrome\" is %b.%n",number,isPalindrome(number));

        int iNumber = 8;
        System.out.printf("%d is %s.", iNumber, numberToWord(iNumber));
    }

    // FOR example
    private static boolean isPrime(long number) {
        boolean bResult = false;

        if (number % 2 == 0 || Math.abs(number) < 2) return false;
        else {
            for (long i = 3; i <= number/2; i++) {
                if (number % i == 0) return false;
            }
        }

        return bResult;
    }

    // IF-ELSE example
    private static boolean isInteger(long number) {
        boolean bResult;
        if (number >= Integer.MIN_VALUE
                && number <= Integer.MAX_VALUE) bResult = true;
        else  bResult = false;

        return  bResult;

        // can be simplified as follows:
        // return (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE);
    }

    // DO-WHILE example
    private static boolean isPalindrome(long number){
        // checks if number is negative,
        // then turns it into positive
        number *= ((number < 0) ? -1 : 1);

        long lReverse = 0;
        long lTempNumber = number;
        do{
            lReverse = lReverse * 10 + lTempNumber % 10;
            lTempNumber /= 10;
        } while(lTempNumber > 0);

        return lReverse == number;
    }

    // SWITCH example
    private static String numberToWord(int number) {
        String sResult;

        switch (number){
            case 0:
                sResult = "Zero";
                break;
            case 1:
                sResult = "One";
                break;
            case 2:
                sResult = "Two";
                break;
            case 3:
                sResult = "Three";
                break;
            case 4:
                sResult = "Four";
                break;
            case 5:
                sResult = "Five";
                break;
            case 6:
                sResult = "Six";
                break;
            case 7:
                sResult = "Seven";
                break;
            case 8:
                sResult = "Eight";
                break;
            case 9:
                sResult = "Nine";
                break;
            default:
                sResult = "Invalid Value";
        }

        return sResult;
    }

}
