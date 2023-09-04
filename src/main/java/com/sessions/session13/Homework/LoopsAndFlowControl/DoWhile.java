package com.sessions.session13.Homework.LoopsAndFlowControl;

import java.util.Scanner;

public class DoWhile
{
    //Do-While Loop: Write a program that prompts the user to enter
    // a number and calculates the sum of the digits of
    //that number using a do-while loop. Print out the sum of the digits.
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=n.nextInt();
        int sum=0;
        do{
            int nr=number%10;//am facut restu impartirii pt a afla ultima cifra
            sum=sum+nr;
            number=number/10;//am impartit la 10 pt a scapa de ultima cifra

        }while(number>0);
        System.out.println("suma este:"+sum);
    }
}
