package com.sessions.session13.Homework.BasicJava;

public class Ex3
{
    //Char to Int Conversion: Write a program that prompts the user to enter a single character.
    // Convert the character to its corresponding int value using the Character.getNumericValue() method.
    // What happens if the character is not a numeric digit? How can you handle this scenario?

    public static void main(String[] args)
    {
        //convertire daca char este cifra
        char a='2';
        int b=Character.getNumericValue(a);
        System.out.println("Convertire:" +b);

        char a2='a';
        boolean a3=Character.isLetter(a2);
        if(a3==true)
        {
            System.out.println("Caracterul este litera");
        }
       else
        {
            int c=Character.getNumericValue(a2);
            System.out.println("Convertire:" +c);
        }
    }
}
