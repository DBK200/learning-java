package com.sessions.session14.homeworksession14;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHomework {

        // TreeSet guarantees the order of the elements when iterated,
    // but the order is the sorting order of the elements

    public static void main(String[] args) {

        // 1. Write a Java program to create a new tree set,
        // add some colors (string) and print out the tree set
        TreeSet<String> colors = new TreeSet<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");
        colors.add("green");
        colors.add("orange");
        colors.add("white");

//        System.out.println("The elements of the colors TreeSet are: ");
//        for(String color : colors){
//            System.out.println(color);
//        }

        // 2. Write a Java program to iterate through all elements in a tree set    --> with Iterator
//    Iterator<String> iterator = colors.iterator();
//    while(iterator.hasNext()){
//        System.out.println(iterator.next());
//    }

        // 3. Write a Java program to add all the elements of a specified tree set to another tree set  -->  with addAll() method
//        TreeSet<String> colors2 = new TreeSet<>();
//        colors2.addAll(colors);
//        System.out.println(colors2);

        // 4. Write a Java program to create a reverse order view of the elements contained in a given tree set

            TreeSet<Integer> numbers = new TreeSet<>();
            numbers.add(3);
            numbers.add(-9);
            numbers.add(1);
            numbers.add(17);
            numbers.add(22);

            // Create a TreeSet to store the values of numbers TreeSet in reverse order
            TreeSet<Integer> reverseNumbers = new TreeSet<>(numbers.descendingSet());

            // print the elements in reverse order
//        Iterator<Integer> iterator = reverseNumbers.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        TreeSet<String> reverseColors = new TreeSet<>(colors.descendingSet());
//
//        // print the elements in reverse order
//        System.out.println("Elements of colors TreeSet in reverse order:");
//
//        // Use Iterator to print the elements
//        Iterator<String> iterator = reverseColors.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        // 5. Write a Java program to get the first and last elements in a tree set
//        System.out.println(numbers.first());
//        System.out.println(numbers.last());

        // 6. Write a Java program to clone a tree set list to another tree set
//        TreeSet<Integer> numbers2 = new TreeSet<>();
//        numbers2 = (TreeSet<Integer>) numbers.clone();
//        System.out.println(numbers2);

        // 7. Write a Java program to get the number of elements in a tree set
//        System.out.println(numbers.size());

        // 8. Write a Java program to compare two tree sets
//        TreeSet<Integer> numbers2 = new TreeSet<>();
//        numbers2.add(1);
//        numbers2.add(5);
//        numbers2.add(99);
//        System.out.println(numbers.equals(numbers));
//        System.out.println(numbers.equals(numbers2));

        // 9. Write a Java program to find the numbers less than 7 in a tree set
//        System.out.println("The following numbers are less than 7 in the given TreeSet");
//        for(Integer number : numbers){
//            if(number <7){
//                System.out.println(number);
//            }

        // 10. Write a Java program to get the element in a tree set which is greater than or equal to the given element
       // int givenElement=-99;
       //  int givenElement = 99;

        // This is not the ideal solutions because if there is no number, it will print the message at every iteration, instead of printing it only once
//        for(Integer number : numbers){
//            if(number >= givenElement){
//                System.out.println(number);
//            } else{
//                System.out.println("There are no elements greater than or equal to " + givenElement);
//            }
//        }

        // Or using a result TreeSet to store the elements
//        TreeSet<Integer> result = new TreeSet<>();
//
//        for(Integer element : numbers){
//            if(element >= givenElement){
//                result.add(element);
//            }
//        }
//
//        // Check if any result was found
//        if(!result.isEmpty()){
//            System.out.println("Elements greater than or equal to " + givenElement + ": " + result);
//        } else{
//            System.out.println("There are no elements greater than or equal to " + givenElement);
//        }

        // 11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
//        TreeSet<Integer> result = new TreeSet<>();
//
//        for(Integer element : numbers){
//            if(element <= givenElement){
//                result.add(element);
//            }
//        }
//
//        // Check if any result was found
//        if(!result.isEmpty()){
//            System.out.println("Elements less than or equal to " + givenElement + ": " + result);
//        } else{
//            System.out.println("There are no elements less than or equal to " + givenElement);
//        }

        // 12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element
//        TreeSet<Integer> result = new TreeSet<>();
//
//        for(Integer element : numbers){
//            if(element > givenElement){
//                result.add(element);
//            }
//        }
//
//        // Check if any result was found
//        if(!result.isEmpty()){
//            System.out.println("Elements strictly greater than " + givenElement + ": " + result);
//        } else{
//            System.out.println("There are no elements strictly greater than " + givenElement);
//        }

        // 13.Write a Java program to get an element in a tree set which is strictly less than the given element.
//        TreeSet<Integer> result = new TreeSet<>();
//
//        for(Integer element : numbers){
//            if(element < givenElement){
//                result.add(element);
//            }
//        }
//
//        // Check if any result was found
//        if(!result.isEmpty()){
//            System.out.println("Elements strictly less than " + givenElement + ": " + result);
//        } else{
//            System.out.println("There are no elements strictly less than " + givenElement);
//        }

        // 14. Write a Java program to retrieve and remove the first element of a tree set.  --> with function pollFirst()
//        Integer firstElement = numbers.pollFirst();
//
//        // check if the first element exists and print it
//        if(firstElement!=null){
//            System.out.println("First element (removed): " + firstElement);
//        } else{
//            System.out.println("The TreeSet numbers is empty");
//        }
//
//        // print the updated TreeSet
//        System.out.println("Updated TreeSet: " + numbers);

        // 15. Write a Java program to retrieve and remove the last element of a tree set
//        Integer lastElement = numbers.pollLast();
//
//        // check if the last element exists and print it
//        if(lastElement!=null){
//            System.out.println("Last element (removed): " + lastElement);
//        } else{
//            System.out.println("The TreeSet numbers is empty");
//        }
//
//        // print the updated TreeSet
//        System.out.println("Updated TreeSet: " + numbers);

        // 16. Write a Java program to remove a given element from a tree set
//        int givenElement=-9;
//        numbers.remove(-9);
//        System.out.println(numbers);

    }
}
