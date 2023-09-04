package com.sessions.session13.Homework.LoopsAndFlowControl;

import java.util.Scanner;

public class Break
{
    //Break Statement: Write a program that prompts the user to enter a series
    // of numbers until they enter a negative
    //number. Calculate the sum of the positive numbers using a break statement
    // to exit the loop when a negative number
    // is entered.

    public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
      int number;
      int sum=0;
      while(true)
      {
          System.out.println("Enter a number:");
          number=scanner.nextInt();
          if(number<0)
          {
              break;
          }
          sum=sum+number;
      }
        System.out.println("The sum of the pozitive numbers is:" +sum);



    }
}
