package com.sessions.session13.Homework.BasicJava;

import java.util.Scanner;

public class Ex5
{
    //Boolean Logic: Write a program that prompts the user to enter
    // two boolean values. Use logical operators (&&, ||, !) to perform various
    // operations on the values, such as AND, OR, and NOT.

    public static void main(String[] args)
    {

        Scanner x=new Scanner(System.in);
        System.out.println("Introduceti primul boolean (true/false):");
        boolean y=x.nextBoolean();
        Scanner a=new Scanner(System.in);
        System.out.println("Introduceti cel de-al doilea boolean (true/false):");
        boolean b=a.nextBoolean();
        boolean rezultatul1=y&&b;
        System.out.println("&& (AND) result:" +rezultatul1);
        boolean rezultatul2=y||b;
        System.out.println("|| (OR) result:" +rezultatul2);
        boolean rezultatul3=!y;
        System.out.println("! (NOT) result:" +rezultatul3);




    }
}
