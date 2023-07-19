package com.sessions.session5;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args){
        // 1. Write a program to print all alphabets from a to z
        System.out.println();
        System.out.println("1. Write a program to print all alphabets from a to z");
      for(int i=97;i<=122;i++)
      {
          System.out.print((char)i+" ");
      }

        System.out.println();


      //  2. Write a program to print reverse alphabets from Z to A
        System.out.println();
        System.out.println("2. Write a program to print reverse alphabets from Z to A");
        for(int i=90;i>=65;i--)
        {
            System.out.print((char)i+" ");
        }

        System.out.println();


        //  4. Write a Program to Check Given String is a Palindrome or Not

        System.out.println();
        System.out.println("4. Write a Program to Check Given String is a Palindrome or Not");
        System.out.println();

        String word = "mom";
        String wordReverse="";
        for(int i=word.length()-1;i>=0;i--){
           wordReverse+=word.charAt(i);
        }
        System.out.println(word.toLowerCase()+ " ->  "+wordReverse.toLowerCase());

      boolean isPalindrome= word.equalsIgnoreCase(wordReverse);
      if(isPalindrome){
          System.out.println("The word "+ word+ " is a palindrome");
      }else{
          System.out.println("The word "+ word+ " is not a palindrome");
      }

        System.out.println();


    //5. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9

        System.out.println();
        System.out.println("5. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9");
        System.out.println();
        int sum=0;
        int counter=0;
        System.out.print("The integers between 100 and 200 divisible with 9 are: ");
        for(int i=101;i<200;i++){
            if(i%9==0){
                counter++;
                sum+=i;
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("Between 100 and 200 there are "+ counter + " integer divisible by 9 ");
        System.out.println("The sum of all integeers found is: "+ sum);

        System.out.println();


        //6. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.

        System.out.println();
        System.out.println("6. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.");
        System.out.println("--- version 1 --- ");
//        Scanner input=new Scanner(System.in);
//        System.out.println("How many numbers do you want to enter?");
//        int numbersWanted= input.nextInt();
//
//
//        int inputNumber;
//        int smallest=Integer.MAX_VALUE;
//        int largest=Integer.MIN_VALUE;
//
//        while(numbersWanted>0){
//
//            System.out.print("Enter a number between " +Integer.MIN_VALUE+ " and "+ Integer.MAX_VALUE+ ": ");
//            inputNumber=input.nextInt();
//
//                if(inputNumber<= smallest){
//                    smallest=inputNumber;
//                }
//                if(inputNumber >= largest) {
//                    largest = inputNumber;
//                }
//        numbersWanted--;
//    }
//        System.out.println("Smallest : "+ smallest);
//        System.out.println("Largest: "+ largest);

        System.out.println();
        System.out.println("--------- version 2 ----------");
        System.out.println();

        Scanner input=new Scanner(System.in);


        int inputNumber;
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        String answerContinue="";

        do{
            System.out.print("Enter a number between " +Integer.MIN_VALUE+ " and "+ Integer.MAX_VALUE+ ": ");
            inputNumber=input.nextInt();
            if(inputNumber<= smallest){
                    smallest=inputNumber;
                }
            if(inputNumber >= largest) {
                   largest = inputNumber;
            }

            System.out.print("Type \"yes\" to continue: ");
            answerContinue=input.next();


        }while(answerContinue.equalsIgnoreCase("yes"));

          System.out.println("Smallest : "+ smallest);
          System.out.println("Largest: "+ largest);

    }












//
//


}
