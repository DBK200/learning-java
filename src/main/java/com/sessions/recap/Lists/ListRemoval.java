package com.sessions.recap.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRemoval {

//    List Removal: Write a program that creates a List of strings and prompts the user
//    to enter a string to remove. Use the remove() method to remove the first occurrence
//    of the string from the list, and then print out the modified list.

    public static void main(String[] args) {
        List<String> car=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String myString=scanner.nextLine();
        car.add("Mert");
        car.add("BMW");
        car.add("Audi");
        car.add("Dacia");
        System.out.println(car);

        for (String s:car)
        {
            if(s.equals(myString))
            {
                car.remove(myString);
                break;
            }
        }
        System.out.println(car);

    }
}
