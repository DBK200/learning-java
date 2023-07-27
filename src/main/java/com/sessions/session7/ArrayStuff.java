package com.sessions.session7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayStuff {
     public static void main(String[] args) {

         int[] numbers = new int[3];
         System.out.println(numbers);

         for (int x : numbers){
             System.out.println(x);
         }

         int[] specificNumbers = new int[]{2,3,6,7,9,2,3};
         specificNumbers[0]=3;

         for (int x : specificNumbers){
             System.out.println(x);
         }

         int[] specificNumbersShourtcut = {2,3,6,2,7};

         String[][] usernames = {{"Alex","Diana","Andreea"},{"Popescu","Ionescu"}};

         System.out.println(usernames[0][1] + " " + usernames[1][1]);

         //copyOfRange
         String[] carMakers = {"Audi","Bmw","Mercedes","Peugeot","Renault","Citroen"};
         String[] germanCarMakers = Arrays.copyOfRange(carMakers,0,3);
         for (String name: germanCarMakers) System.out.println(name);

         //binarySearch
         int[] sortedNumbers = {1,2,3,4,5,6};
         System.out.println(Arrays.binarySearch(sortedNumbers, 5));

         int[] unsortedNumbers = {7,3,4,8,1,2};
         Arrays.sort(unsortedNumbers);
         for (int x : unsortedNumbers) System.out.print(x + " ");
         System.out.println(" -> 1 is on position: " + Arrays.binarySearch(unsortedNumbers, 1));

         printAddressFromVarArgs("Tara:Romania","Oras:Iasi","Strada:Pacurari 34");

    }

    private static void printAddress ( String tara, String orasul, String strada, String localitatea){
        System.out.println(tara + " " + orasul + " " + strada + " " + localitatea);
    }

    private static void printAddressFromVarArgs(String... input){
         for (String x: input){
             System.out.print(x + " ");
         }
        System.out.println();

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(2);
        ArrayList list3 = list1;

        list1.add("something");
        list1.add(1);
        list1.add(false);

        System.out.println(list1);

        list2.add(1);
        list2.add("some string");
        list2.add(2);

        System.out.println(list2);

        //Generics
        ArrayList<String> listaMasini = new ArrayList<>();
        listaMasini.add("BMW");
        listaMasini.add("Dacia");
        System.out.println(listaMasini);
        listaMasini.remove("BMW");
        System.out.println(listaMasini);
        //listaMasini.size()
        System.out.println(listaMasini.isEmpty());
        System.out.println(listaMasini.get(0));

        ArrayList<Integer> ageList = new ArrayList<>();
        ageList.add(2);
        ArrayList<String> listString1 = new ArrayList<>();
        listString1.add("abc");
        ArrayList<String> listString2 = new ArrayList<>();
        listString2.add("abc");
        System.out.println(listString1.equals(listString2));

        Integer[] numbersAsArray = {2,3,4,5};
        List<Integer> numbersAsList = Arrays.asList(numbersAsArray);
        System.out.println(numbersAsList);

        LinkedList linkedList = new LinkedList();
        linkedList.add("something");
        linkedList.addFirst("first item");
        linkedList.addLast("last item");
        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println(linkedList);

        System.out.println(linkedList.poll());
        System.out.println(linkedList);

        //Wrapper classes
        //autoboxing
        int x = 10;
        Integer xAsInteger = Integer.valueOf(x); //explicit autoboxing
        Integer xAsInteger2 = x; //implicit autoboxing

        //unboxing
        Integer boxedInteger = 10;
        int unboxedInteger = boxedInteger.intValue(); //explicit unboxing
        int unboxedInteger2 = boxedInteger; //implicit unboxing

    }

}
