package com.sessions.session7;

import java.util.*;

public class DataStructures
{
    //private final Double PI = 3.14; atribute constante

    public static void main(String[] args)
    {
        //Arrays

//        int[] numbers = new int[3];
//
//        for(int x : numbers)
//        {
//            System.out.println(x);
//        }
//
//        int[] specificNumbers = new int[]{2, 3, 6, 7, 9, 2, 3};
//
//        for(int x : specificNumbers)
//        {
//            System.out.println(x);
//        }
//
//        String[][] userNames = {
//                {"Alex", "Diana", "Andreea"},
//                {"Popescu", "Ionescu"}
//        };
//
//        System.out.println(userNames[0][1] + " " + userNames[1][1]);

        //copyOfRange

//        String[] carMakers = {"Audi", "BMW", "Mercedes", "Renault", "Citroen"};
//
//        String[] copyCarMakers = Arrays.copyOfRange(carMakers, 0, 3);
//
//        for (String name : copyCarMakers)
//        {
//            System.out.println(name);
//        }
//
//        Arrays.sort(carMakers);
//
//        System.out.println("Sorted array is bellow:");
//
//        for (String name : copyCarMakers)
//        {
//            System.out.println(name);
//        }
//
//        System.out.println("Index of Mercedes car is: " + Arrays.binarySearch(carMakers, "Mercedes"));

        //Array List

//        ArrayList<String> carList = new ArrayList<>();
//
//        carList.add("Dacia");
//        carList.add("BMW");
//        carList.add("Audi");
//        carList.add("Citroen");
//        carList.add("Opel");
//        carList.add("Jaguar");
//
//        System.out.println(carList);
//
//        carList.remove("BMW");
//
//        System.out.println(carList);

        //converting from arrays to array list

        Integer[] numbersAsArray = {2, 3 ,4, 5};

        List<Integer> numbersAsList = Arrays.asList(numbersAsArray);
    }

    private static double average(int ... grades)
    {
        int sum = 0;

        for(int j =0 ; j < grades.length; j++)
        {
            sum += j;
        }

        return(double) sum / grades.length;
    }
}
