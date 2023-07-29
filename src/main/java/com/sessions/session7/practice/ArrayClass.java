/**********************
 *                    *
 *  Date: 25.07.2023  *
 *                    *
 **********************/

package com.sessions.session7.practice;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        // Arrays
        int[] numbers =new int[] {2,3,6,7,9,2,3};
        numbers[0] = 3;
        for (int x: numbers) {
            System.out.println(x);
        }

        // Next declaration through an out of bound exception
        // because the index is grater than array's dimension
        // numbers[7] = ....

        String[][] userNames = {
                {"Alex", "Diana", "Andreea"},
                {"Popescu", "Ionescu"}
        };
        // Print Diana Ionescu
        System.out.println("Name is: " + userNames[0][1] + " " + userNames[1][1]);

        // copyOfRange method
        String[] carMakers = {"Audi", "Audii", "Mercedes", "BMW", "Peugeot", "Renault", "Citroen"};
        String[] germanMakers = Arrays.copyOfRange(carMakers, 3, 6);

        for (String name: germanMakers) {
            System.out.println(name);
        }

        // Binary search
        int[] sortedNumbers = {1,2,3,4,5,6};
        // If value is not found, returns where value would be found
        int iResult = Arrays.binarySearch(sortedNumbers, 5);
        System.out.println("Number 5 was found in position " + iResult);

        int[] unsortedNumbers = {7,3,4,8,1,2};
        // If value is not found, returns ... a surprise
        iResult = Arrays.binarySearch(unsortedNumbers, 5);
        System.out.println("Number 5 was found in position " + iResult);

        // Sorting arrays
        System.out.println(Arrays.toString(carMakers));
        Arrays.sort(carMakers);
        System.out.println(Arrays.toString(carMakers));

        System.out.println("[Mercedes] was found in position " + Arrays.binarySearch(carMakers, "Mercedes"));

        // Variable arguments
        printAddressFromVarArgs("Romania", "Bucuresti", "Bd. Balcescu", "Nr. 2");


    }

    private static void printAddress(String sCountry, String sCity, String sStreet) {
        System.out.println(sCountry + " " + sCity + " " + sStreet);
    }

    // Var arg must be placed at the end of method's declaration
    private static void printAddressFromVarArgs(String ... sInput) {
        for (int i = 0; i < sInput.length; i++){
            System.out.print(((i == 0) ? "" : ", ") + sInput[i]);
        }
    }


}
