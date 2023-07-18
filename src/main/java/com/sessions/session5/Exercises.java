package com.sessions.session5;

import java.util.Scanner;

public class Exercises {


    //1. Write a program to print all alphabets from a to z

//    public static void main(String[] args) {
//        char s;
//        for (s = 'a'; s <= 'z'; s++) {
//            System.out.println(s);
//        }
//    }

    //2. Write a program to print reverse alphabets from Z to A
    //public static void main(String[] args)
    //{
    //    char s;
    //    for(s='Z';s>='A';s--)
    //    {
    //        System.out.println(s);
    //    }
    //}

    //3. Write a program to print all odd number between 1 to 100


//        public static void main(String[] args)
//        {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter The Number of Limit : ");
//            int l =input.nextInt();
//            for(int s=1;s<=l;s++)
//            {
//                if(s%2==1)
//                    System.out.println(s);
//            }
//        }

    //4. Write a Program to Check Given String is a Palindrome or Not
    // Scanner input = new Scanner(System.in);
    //		System.out.print("Enter The String :");
    //		String str = input.nextLine();
    //		String rev = "";
    //		int len = str.length();
    //		for (int i = (len - 1); i >=0; --i)
    //		{
    //			rev = rev + str.charAt(i);
    //		}
    //		if (str.toLowerCase().equals(rev.toLowerCase()))
    //		{
    //			System.out.println(str + " is a Palindrome String.");
    //		}
    //		else
    //		{
    //			System.out.println(str + " is not a Palindrome String.");
    //		}

    //   5. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
//    public static void main(String[] args) {
//        int sum = 0;
//        System.out.println("Numbers between 100 and 200, divisible by 9 : \n");
//        for (int i = 101; i < 200; i++) {
//            if (i % 9 == 0) {
//                System.out.println(i);
//                sum += i;
//            }
//        }
//        System.out.println("Sum is " + sum);
//    }

    // 6. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
//    public static void main(String[] args)
//    {
//        Scanner console = new Scanner(System.in);
//
//        int number;
//        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
//        int min = Integer.MAX_VALUE;  // Intialize min with maximum value
//
//        char choice;
//
//        do
//        {
//            System.out.print("Enter the number ");
//            number = console.nextInt();
//
//            if(number > max)
//            {
//                max = number;
//            }
//
//            if(number < min)
//            {
//                min = number;
//            }
//
//            System.out.print("Do you want to continue y/n? ");
//            choice = console.next().charAt(0);
//
//        }while(choice=='y' || choice == 'Y');
//
//        System.out.println("Largest number: " + max);
//        System.out.println("Smallest number: " + min);
//    }

}
