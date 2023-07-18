package com.sessions.session3;
import java.util.Scanner;

public class OperatorsHomework
{
    public static void main(String[] args)
    {
        int result = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double avg = arithmeticAverageGrade(10, 8, 6, 9, 10, 10, 7, 8, 9, 7, 8, 9, 8, 10, 10, 10, 10);

        System.out.println("Sum of the numbers is: " + result);

        System.out.printf("\nYour average for this year is: %.2f\n\n", avg);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");

        long a = scanner.nextLong();

        long binary = decimalToBinaryConversion(a);

        System.out.println("The binary representation of " + a + " is: " + binary + '\n');

        System.out.print("Enter a binary number: ");

        a = scanner.nextLong();

        long decimal = binaryToDecimal(a);

        System.out.println("The binary number in decimal is: " + decimal + '\n');

        System.out.print("Enter a decimal number: ");

        long number1 = scanner.nextLong();

        System.out.print("Enter a decimal number: ");

        long number2 = scanner.nextLong();

        long bin = number1 | number2;

        bin = decimalToBinaryConversion(bin);

        System.out.println("The binary representation of " + number1 + " is: " + decimalToBinaryConversion(number1));
        System.out.println("The binary representation of " + number2 + " is: " + decimalToBinaryConversion(number2));
        System.out.println("The result of or per bit between the two numbers is: " + bin + '\n');

        bin = number1 & number2;

        bin = decimalToBinaryConversion(bin);

        System.out.println("The binary representation of " + number1 + " is: " + decimalToBinaryConversion(number1));
        System.out.println("The binary representation of " + number2 + " is: " + decimalToBinaryConversion(number2));
        System.out.println("The result of and per bit between the two numbers is: " + bin + '\n');

        System.out.print("Enter a number: ");

        int x = scanner.nextInt();

        if (isEven(x))
            System.out.println(x + " is even");

        else
            System.out.println(x + " is odd");

        System.out.print("Enter a number: ");

        int y = scanner.nextInt();

        var response = y + y++ + ++y + --y - y--;

        System.out.println("The result is: " + response);

        scanner.close();
    }
    static int sum(int ... stringOfNumbers)
    {
        int sum = 0;

        for (int number : stringOfNumbers)
            sum += number;

        return sum;
    }
    static double arithmeticAverageGrade(int ... grades)
    {
        int sum = 0;

        for (int grade : grades)
            sum += grade;

        return grades.length > 0 ? (double) sum / grades.length : 0.0;
    }
    static Long decimalToBinaryConversion(Long number)
    {
        if(number == 0)
            return number;

        StringBuilder binaryNumber = new StringBuilder();
        Long coeff = number;

        while (coeff > 0)
        {
            long remainder = coeff % 2;
            binaryNumber.append(remainder);
            coeff /= 2;
        }

        binaryNumber.reverse();

        return Long.valueOf(binaryNumber.toString());
    }
    static Long binaryToDecimal(Long binaryNumber)
    {
        Long number = 0L;
        Long base = 1L;

        while (binaryNumber > 0)
        {
            long lastDigit = binaryNumber % 10;
            binaryNumber /= 10;
            number += lastDigit * base;
            base = base * 2;
        }

        return number;
    }
    static boolean isEven(int number)
    {
        return number % 2 == 0;
    }
}