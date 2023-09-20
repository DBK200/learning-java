package com.sessions.session20.challenges;

import java.util.Scanner;

/**
 * <h1>Challenge 1</h1>
 * Write a Java program that asks the user for two numbers and attempts to divide them.<br>
 * Use {@code try-catch} to handle the case where division by zero occurs.
 */

public class ExceptionsChallenge01 {
    public static void main(String[] args) {

        Integer a = 4, b = 0;
        divideNumbers(a, b);
    }

    private static <T extends Number> void divideNumbers(T dividend, T divisor) {
        boolean bExit = false;
        Scanner sc = new Scanner(System.in);
        Number nDividend, nDivisor;
        String sDividend = "", sDivisor = "";

        while(!bExit) {
            try{
                if (sDividend.isEmpty()) nDividend = dividend;
                else nDividend = Double.parseDouble(sDividend);

                if (sDivisor.isEmpty()) nDivisor = divisor;
                else nDivisor = Double.parseDouble(sDivisor);
                // Next declaration makes sure that division by 0
                // doesn't return INFINITE
                if(nDivisor.doubleValue() == 0.0) throw new ArithmeticException();

                double dResult = nDividend.doubleValue() / nDivisor.doubleValue();
                System.out.printf("Result: %s divided by %s returned %.2f%n", nDividend, nDivisor, dResult);
                bExit = true;
            }
            catch(RuntimeException e){
                System.out.println("\nDividend and/or Divisor are wrong!");
                System.out.print("Enter new values for dividend and divisor separated by space [Q/q to quit]: ");
                String s = sc.nextLine();
                if (s.isEmpty()) continue;
                if (s.toUpperCase().charAt(0) == 'Q') bExit = true;
                else {
                    String sResult[] = s.replaceAll("\\s+", " ").split("\\s");
                    if (sResult.length < 2) continue;
                    sDividend = sResult[0];
                    sDivisor = sResult[1];
                }
            }
        }
    }


}
