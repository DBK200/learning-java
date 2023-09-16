package com.sessions.session19.challenges;

import java.util.*;

/**
 *   <h1>Challenge 5 (Find-in and Optional)</h1>
 *   Given a list of integers, find the first even number greater than {@code LIMIT} and print it.
 **/

public class OptionalsChallenge05 {
    public static void main(String[] args) {

        final int LIMIT = 911000;

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1e6; i++) {
            numbers.add(random.nextInt(-LIMIT,LIMIT + 100));
        }


        // 1: Using streams
        //    returns the value and index in the list

        // Starts the Stopwatch
        Timer.out.startStopwatch();

        Integer iResult = numbers.stream().filter(x -> x % 2 == 0 && x > LIMIT).findFirst().orElse(-1);
//        Integer iResult = numbers.stream().filter(x -> x % 2 == 0 && x > LIMIT).toList().get(0);
        if(iResult != -1) {
            // Gets the index in the list
            int iIndex = numbers.indexOf(iResult);
            System.out.printf("First even number greater than %d is found at index %d and has value %d%n",
                    LIMIT, iIndex, iResult);
        }
        else
            System.out.printf("No even number greater than %d was found in the list%n", LIMIT);

        // Prints out duration
        Timer.out.printStopwatch("1. Using streams w/ index returning, was calculated in:");


        // 2: Using streams
        //    returns only the value

        // Starts the Stopwatch
        Timer.out.startStopwatch();

        iResult = numbers.stream().filter(x -> x % 2 == 0 && x > LIMIT).findFirst().orElse(-1);
//        iResult = numbers.stream().filter(x -> x % 2 == 0 && x > LIMIT).toList().get(0);
        if(iResult != -1)
            System.out.printf("First even number greater than %d has the value %d%n",
                    LIMIT, iResult);
        else
            System.out.printf("No even number greater than %d was found in the list%n", LIMIT);

        // Prints out duration
        Timer.out.printStopwatch("2. Using streams w/o index returning, was calculated in:");


        //  3: Using a for loop
        //     - the value and index at once

        // Starts the Stopwatch
        Timer.out.startStopwatch();

        for (int i = 0; i < numbers.size(); i++) {
            int iValue = numbers.get(i);
            if (iValue % 2 == 0 && iValue > LIMIT){
                System.out.printf("First even number greater than %d is found at index %d and has the value %d%n",
                        LIMIT, i, iValue);
                break;
            }
            if (i == numbers.size() - 1)
                System.out.printf("No even number greater than %d was found in the list%n", LIMIT);
        }

        // Prints out duration
        Timer.out.printStopwatch("3. Using FOR loop, was calculated in:");
    }
}
