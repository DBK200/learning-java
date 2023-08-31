package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex5 {

    //Write a program that prompts the user to enter two boolean values.
    // Use logical operators (&&, ||, !) to perform various operations on the values,
    // such as AND, OR, and NOT.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean input1 = scanner.nextBoolean();
        boolean input2 = scanner.nextBoolean();

        if (input1 && input2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (input1 || input2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (!input1 && input2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
