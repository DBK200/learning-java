package com.sessions.session13recap.Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers separated by space: ");

        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        for(String part: parts) {
            numbers.add(Integer.parseInt(part));
        }

        System.out.println(numbers);
    }
}
