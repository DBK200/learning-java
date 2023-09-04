package com.sessions.session13.Homework.Lists;

import java.util.*;

public class Sorting
{
    //List Sorting: Write a program that creates a List of integers and
    // sorts it in ascending order using the Collections.sort()
    // method. Print out the sorted list.
    public static void main(String[] args)
    {
        List<Integer> lista=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti nr de elemente:");
        int n=scanner.nextInt();
        System.out.println("Introduceti elementele listei:");
        for(int i=0;i<n;i++)
        {
            int m=scanner.nextInt();
            lista.add(m);
        }
        Collections.sort(lista);
        System.out.println("Lista sortata:"+lista);

    }
}
