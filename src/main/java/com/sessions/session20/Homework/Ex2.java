package com.sessions.session20.Homework;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex2
{
    //Write a program that attempts to access an element of an array at an index entered by the user.
    // Handle the case where the index is out of bounds.

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(2,5,3,7,4,9,6,1);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti indexul:");
        int index=scanner.nextInt();
        if(index>=0 || index<list.size())
        {
            System.out.println("Nr:"+list.get(index));
        }
        else
        {
            System.out.println("The index is out of bounds");
        }


    }
}
