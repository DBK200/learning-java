package com.sessions.practice.temperatureconverter;

import java.util.Scanner;

public class TemperatureConverterClassic {

    static Scanner input = new Scanner(System.in);
    //from Celsius to Kelvin
    public static double fromCelsiusToKelvin(double C) {
        double kelvin_grades = C + 273.15;
        System.out.println("The temperature in " + C + " in Celsius is " + kelvin_grades + " in Kelvin");
        return kelvin_grades;
    }

    //from Kelvin to Celsius
    public static double fromKelvinToCelsius(double K) {
        double celsius_grades = K - 273.15;
        System.out.println("The temperature in " + K + " in Kelvin is " + celsius_grades + " in Celsius");
        return celsius_grades;
    }

    //from Celsius to Fahrenheit
    public static double fromCelsiusToFahrenheit(double C) {
        double fahrenheit_grades = C*9/5 + 32;
        System.out.println("The temperature in " + C + " in Celsius is " + fahrenheit_grades + " in Fahrenheit");
        return fahrenheit_grades;
    }

    //from Fahrenheit to Celsius
    static double fromFahrenheitToCelsius(double F) {
        double celsius_grades = (F-32)*5/9;
        System.out.println("The temperature in " + F + " in Fahrenheit is " + celsius_grades + " in Celsius");
        return celsius_grades;

    }

    //from Kelvin to Fahrenheit
    static double fromKelvinToFahrenheit(double K) {
        double fahrenheit_grades =(K - 273.15)* 9 / 5 + 32;
        System.out.println("The temperature in " + K + " in Kelvin is " + fahrenheit_grades + " in Fahrenheit");
        return fahrenheit_grades;
    }

    //from Fahrenheit to Kelvin
    static double fromFahrenheitToKelvin(double F) {
        double kelvin_grades = (F + 459.67) * 5 / 9; ;
        System.out.println("The temperature in " + F + " in Fahrenheit is " + kelvin_grades + " in Fahrenheit");
        return kelvin_grades;
    }

    //Method to read the value of temperature given by user
    static double input(String word) {
        System.out.println("Enter " + word + " value: ");
        double val = input.nextDouble();
        return val;
    }

    //Method to print converted value of temperature
    static void output(double val, String word) {
        System.out.printf("%s value: %2f", word, val);
    }

    public static void main(String[] args) {

        System.out.println("1. Celcius to Fahrenheit\n2. Celcius to Kelvin\n"+
                "3. Fahrenheit to Celcius\n4. Fahrenheit to Kelvin\n"+
                "5. Kelvin to Celcius\n6. Kelvin to Fahrenheit\n7. Exit");

        System.out.println("Enter Choice: ");
        int choice = input.nextInt();
        double num = 0;
        switch(choice) {
            case 1: num = input("Celsius");
                output(fromCelsiusToFahrenheit(num), "Fahrenheit");
                break;
            case 2: num = input("Celsius");
                output(fromCelsiusToKelvin(num), "Kelvin");
                break;
            case 3: num = input("Fahrenheit");
                output(fromFahrenheitToCelsius(num), "Celsius");
                break;
            case 4: num = input("Fahrenheit");
                output(fromFahrenheitToKelvin(num), "Kelvin");
                break;
            case 5: num = input("Kelvin");
                output(fromKelvinToCelsius(num), "Celsius");
                break;
            case 6: num = input("Kelvin");
                output(fromKelvinToFahrenheit(num), "Fahrenheit");
                break;
            case 7: System.exit(0);
                break;
            default: System.out.println("Invalid input");
        }
    }
}
