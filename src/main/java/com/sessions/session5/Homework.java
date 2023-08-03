package com.sessions.session5;


import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //1. Write a program to print all the alpahabets from a to z
          /*  char ch;
            for(ch ='a'; ch <= 'z'; ch++){
                System.out.println(ch);
        }*/

            //2. Write a program to print reverse alphabets from Z to A
        /*char ch;
        for(ch = 'Z'; ch >='A'; ch--){
            System.out.println(ch);
        }
*/
        //3. Write a program to print all odd number between 1 and 100
        /*int number=1;
        for(number=1; number <=100; number++){
            if(number%2==1){
                System.out.println(number);
            }
        }*/

        //4. Write a program to check given string is a palindrome or not
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Type a String to check: ");
        String str = scanner.nextLine();
        String rev ="";
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }*/

        //5. Write a program to find number and sum of all the integer between 100 and 200 which are divisible by 9
       /* int number;
        int num=0, sum=0;
        for(number = 100; number<=200; number++){
            if(number%9==0){
                num++;
                sum+=number;
            }
        }
        System.out.println("There are " + num + " numbers divisible by 9 between 100 and 200 and their sum is " + sum);*/

        //6. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallets number entered
        /*Scanner scanner = new Scanner(System.in);
        int number;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        char choice;

        do{
            System.out.println("Enter the number: ");
            number = scanner.nextInt();

            if(number>max){
                max=number;
            }

            if(number<min){
                min=number;
            }

            System.out.println("Do you want to continue y/n ?");
            choice = scanner.next().charAt(0);
         }while(choice=='y' || choice=='Y');

        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);

         */
    }
}
