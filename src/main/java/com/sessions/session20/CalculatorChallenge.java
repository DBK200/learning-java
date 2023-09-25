package com.sessions.session20;

import java.util.Scanner;

public class CalculatorChallenge {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter the first number: ");
            double number1 = Double.parseDouble(scanner.nextLine());

            System.out.print("enter the operator(+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            System.out.print("enter the second number: ");
            double number2 = Double.parseDouble(scanner.nextLine());

            double result = calculate(number1, operator, number2);
            System.out.println("Result: " + result);
        }catch (NumberFormatException e){
            System.out.println("invalid number");
        }catch (ArithmeticException e){
            System.out.println("arithmetic error");
        }catch (IllegalArgumentException e){
            System.out.println("invalid operator");
        }
    }
    public static double calculate(double number1, char operator, double number2)throws ArithmeticException, IllegalArgumentException{
        double result = 0.0;

        switch (operator){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 ==0){
                    throw new ArithmeticException("division by 0 is not possible");
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("invalid operator");
        }
        return result;
    }
}
