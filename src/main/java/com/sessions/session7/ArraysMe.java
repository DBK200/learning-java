package com.sessions.session7;

import java.util.ArrayList;

public class ArraysMe {
    public static void main(String[] args) {
        //Arrays
       /* int[] numbers = new int[3];
        System.out.println(numbers);
        for (int x : numbers) {
            System.out.println(x);
        }

            int[] specificNumbers = new int[]{2,3,6,7,9,2,3};
            specificNumbers[0]=3;
            for (int x : specificNumbers){
                System.out.println(x);

                int[] specificNumbersShortcut = {2,3,6,7,9,2,3};
                int [] array1;
                int [] array2;
                int array3[];
                int array4 [];

                String[][] usernames ={{"Alex","Diana","Andreea"},{"Popescu","Ionescu"}};
                        System.out.println(usernames[0][1]+""+usernames[1][1]);

        String[] carMakers ={"Audi","BMW","Mercedes","Peugeot","Renault","Citroen"};
        String[] germanCarMakers = Arrays.copyOfRange(carMakers,3,6);
        for (String name:germanCarMakers){
            System.out.println(name);

        }



        int[] unsortedNumbers ={7,3,4,8,1,2};
        int result = Arrays.binarySearch(unsortedNumbers, 2);
        System.out.println(result);


        String[] carMakers ={"Audi","Audii","BMW","Mercedes","Peugeot","Renault","Citroen"};
        Arrays.sort(carMakers);
        for (String name:carMakers){
            System.out.println(name);
        }

        System.out.println(Arrays.binarySearch(carMakers,"Mercedes"));
        */


        //private static void printAddress(String tara, String orasul, String strada, String localitatea) {
        //  System.out.println (tara+" "+orasul+" "+strada+" "+localitatea);


        ArrayList list1 =new ArrayList();
        ArrayList list2 =new ArrayList<>(2);
        ArrayList list3 =list1;

        list1.add("something");
        list1.add(1);
        list1.add(false);
        System.out.println(list1);

        list2.add(1);
        list2.add("some string");
        list2.add(2);

        System.out.println(list2);

    }
    }


