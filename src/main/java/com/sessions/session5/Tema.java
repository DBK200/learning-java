package com.sessions.session5;
import java.util.Scanner;

/*1. Write a program to print all alphabets from a to z
2. Write a program to print reverse alphabets from Z to A
3. Write a program to print all odd number between 1 to 100
4. Write a Program to Check Given String is a Palindrome or Not
5. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
6. Write a program to enter the numbers till the user wants and at the end the program should display the largest
and smallest numbers entered.
*/

public class Tema
{
    public static void main(String[] args)
    {
        //1

        char litera='a';
        do{
            System.out.println(litera);
            litera++;
        }while(litera<='z');
            System.out.println(" ");
            System.out.println(" ");

        //2

        char Litera='a';
       for(Litera='z';Litera>='a';Litera--)
          {
                 System.out.println(Litera);
          }
        System.out.println(" ");
        System.out.println(" ");

        //3

        int nr=1;
        System.out.println("Toate numerele impare cuprinse intre 1 si 100:");
        for( nr=1;nr<100;nr++)
            {
               if(nr%2!=0)
               {
                   System.out.println(nr);
               }
            }
        System.out.println(" ");

        //4

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un șir: ");
        String str = scanner.nextLine();
        String rev = "";
        int len = str.length();
        for (int i = (len - 1); i >=0; --i)
            {
            rev = rev + str.charAt(i);
             }
        if (str.toLowerCase().equals(rev.toLowerCase()))
            {
                System.out.println(str + " is a Palindrome String.");
            }
        else
            {
                System.out.println(str + " is not a Palindrome String.");
            }

        //5

        int numar=100;
        int suma=0;
        System.out.println("Nr divizibile cu 9 sunt:");
        for(numar=100;numar<200;numar++)
        {
            if(numar%9==0)
            {
                System.out.println(numar);
                suma+=numar;
            }
        }
        System.out.println("Suma este:" + suma);

        //6

        Scanner Numar=new Scanner(System.in);
        char alegere;
        int number;
        int Max=Integer.MAX_VALUE;
        int Min=Integer.MIN_VALUE;

        do {
            System.out.print("Introduceti un numar: ");
            number = Numar.nextInt();

            if (number > Max) {
                Max = number;
            }

            if (number < Min) {
                Min = number;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            alegere=Numar.next().charAt(0);
        } while (alegere=='y' || alegere == 'Y');

        System.out.println("Largest number: " + Max);
        System.out.println("Smallest number: " + Min);





    }

}