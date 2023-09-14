package com.sessions.session18.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Filtering: Write a program that uses a stream to filter out all the negative numbers from a list of integers.
        List<Integer> numbers = Arrays.asList(3, 6, -4, 33, -56, 0);

        System.out.println("Original list: " + numbers);
        System.out.println("Filtered list: " + numbers.stream().filter(e -> e >= 0).toList());

        //Mapping: Write a program that uses a stream to transform a list of strings to uppercase and then sort them in alphabetical order.
        List<String> words = Arrays.asList("laptop","mouse", "keyboard");

        System.out.println("Original list: " + words);
        System.out.println("Filtered list: " + words.stream().map(e -> e.toUpperCase()).sorted().toList());

        //Reducing: Write a program that uses a stream to calculate the product of all the elements in a list of integers.
        List<Integer> numbers2 = Arrays.asList(3, 5, 9);
        System.out.println("List: " + numbers2);
        System.out.println("Product: " + numbers2.stream().reduce( 1, (a, b) -> a * b));

        //Sorting: Write a program that uses a stream to sort a list of custom objects by a specific property, such as age or name.
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(30));
        clients.add(new Client(45));
        clients.add(new Client(27));

        System.out.println("Original: " + clients);
        System.out.println("Sorted: " + clients.stream().sorted(Comparator.comparingInt((Client c) -> c.getAge())).toList());

        //Create a stream from a List of Strings that in the end reduces all the elements to a single String made from the concatenation of all the Strings inside the original collection
        List<String> words2 = Arrays.asList("laptop","mouse", "keyboard");

        System.out.println("List: " + words2);
        System.out.println("Concatenated: " + words2.stream().reduce("", (a, b) -> a + " " + b));
    }
}
