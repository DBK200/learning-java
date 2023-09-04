package com.sessions.session13.Homework.BasicJava;

public class Ex2
{
//String to Integer: Write a program that prompts the user to enter
// a string representing an integer value.
//Convert the string to an int using the Integer.parseInt() method.
// What happens if the string cannot be parsed as an integer? How can you handle this scenario?


    public static void main(String[] args) {
        String string = "12345";
        int intV = Integer.parseInt(string);
        System.out.println("Convertirea unui String in int:" + intV);

        String string2 = "124b";
        try {
            int int2 = Integer.parseInt(string2);
            System.out.println("Convertire:" + int2);
        } catch (NumberFormatException exception)
        {
            System.out.println("Error");
        }
    }

}
