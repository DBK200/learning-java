package com.sessions.session20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Challenge2 {
    //Write a program that attempts to access an element of an array at an index entered by the user.
    // Handle the case where the index is out of bounds.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        int i = 0;
        System.out.println("Add 5 words to the list");
        while (i < 5){
            String input = scanner.nextLine();
            stringList.add(input);
            i++;
        }
        System.out.println("The list is: " + stringList);
        System.out.println("Enter an index to access an element: ");
        int input2 = scanner.nextInt();
        try {
            String element = stringList.get(input2);
            System.out.println(element);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Element is not in the list");
        }


    }
}
