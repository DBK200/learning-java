package com.sessions.session20.challenges;

/**
 * <h1>Challenge 3</h1>
 * Write a program that performs some risky operations (e.g., division, file manipulation, invalid arguments..etc..)
 * and handles specific exceptions differently.<br>
 * Use multi-catch to handle related exceptions in a single block and individual catch blocks for others.
 */

public class ExceptionsChallenge03 {
    public static void main(String[] args) {

        //int a = 31, b = 2;
        String a = "12a", b = "0";
        try{
            System.out.println(a + " divided by " + b + " returned " + divideNumbers(a,b));
        }
        catch(NullPointerException e){
            System.out.println("Dividend and/or Divisor can't be null.");
        }
        catch(ArithmeticException e) {
            System.out.println("Divisor can't be 0.");
        }
        catch(NumberFormatException e){
            System.out.println("Wrong string number representation.");
        }
    }

    private static <T extends Number> Double divideNumbers(T dividend, T divisor) throws NullPointerException, ArithmeticException {
        // Next declaration makes sure that division by 0
        // doesn't return INFINITE
        if(divisor.equals(0)) throw new ArithmeticException();

        return dividend.doubleValue() / divisor.doubleValue();
    }

    private static Double divideNumbers(String dividend, String divisor) throws NullPointerException, ArithmeticException {
        double dDividend = Double.parseDouble(dividend);
        double dDivisor = Double.parseDouble(divisor);

        // Next declaration makes sure that division by 0
        // doesn't return INFINITE
        if(dDivisor == 0) throw new ArithmeticException();

        return dDividend / dDivisor;
    }
}
