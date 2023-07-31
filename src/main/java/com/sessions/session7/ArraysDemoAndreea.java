package com.sessions.session7;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysDemoAndreea {
    public static void main(String[] args) {

        // Arrays
//        int[] numbers = new int[3];
//        System.out.println(numbers);
//
//        for (int x : numbers){
//            System.out.println(x);
//        }
//
//        int[] specificNumbers = new int[]{2, 3, 6, 7, 9, 2, 3};
//        String[][] usernames = {{"Alex", "Diana", "Andreea"},
//                {"Popescu", "Ionescu"}
//        };
//
//        // print Diana Ionescu
//        System.out.println(usernames[0][1] + " " + usernames[1][1]);

        //copyOfRange
//        String[] carMakers = {"Audi", "BMW", "Mercedes", "Peugeot", "Renault", "Citroen"};
//        String[] germanCarMakers = Arrays.copyOfRange(carMakers, 0, 3);
//        for ( String name : germanCarMakers){
//            System.out.println(name);
//        }

        //binarySearch 6    2, 3, 4, 5, 6, 7
//        int[] sortedNumbers = {1, 2, 3, 4, 5, 6};
//        int result = Arrays.binarySearch(sortedNumbers, 21);
//        System.out.println(result);

//        int[] unsortedNumbers = {7, 3, 4, 8, 1, 2};
//        int result = Arrays.binarySearch(unsortedNumbers, 7);
//        System.out.println(result);

    //sort
//        String[] carMakers = {"Audi", "Audii", "BMW", "Mercedes", "Peugeot", "Renault", "Citroen"};
//        Arrays.sort(carMakers);
//        for(String name : carMakers){
//            System.out.println(name);
//        }
//        System.out.println(Arrays.binarySearch(carMakers, "Mercedes"));

    // varargs
       // printAddressFromVarArgs("Iasi", "bld Chimiei", "nr 2", "bl c1", " orice");


        //ArrayList
//        ArrayList list1 = new ArrayList(); // un obiect de tip ArrayList, list1 este referinta catre acest obiect
//        ArrayList list2 = new ArrayList(2);
//        ArrayList list3 = list1;
//
//        list1.add("something");
//        list1.add(1);
//        list1.add(false);
//
//        System.out.println(list1);
//
//        list2.add(1);
//        list2.add("some string");
//        list2.add(2);
//        System.out.println(list2);


        // Generics <>
//        ArrayList<String> listaMasini = new ArrayList<>();
//        listaMasini.add("BMW");
//        listaMasini.add("Dacia");
//        System.out.println(listaMasini);
////        listaMasini.remove("BMW");
////        System.out.println(listaMasini);
//        //listaMasini.size();
//        System.out.println(listaMasini.isEmpty());
//        System.out.println(listaMasini.get(1));
//
//       ArrayList<Integer> ageList = new ArrayList();
//       ageList.add(2);


        // equals
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        list1.add("abc");
//        list2.add("abc");
//        System.out.println(list1.equals(list2));

        // converting from arrays to arraylist
//        Integer[] numbersAsArray = {2,3,4,5};
//        List<Integer> numbersAsList = Arrays.asList(numbersAsArray);

        // numbersAsList
//        List<String> lista = new ArrayList<>(); // List is the interface implemented by ArrayList class
//        System.out.println(lista.getClass());

        // LinkedList
//        LinkedList linkedList = new LinkedList();
//        linkedList.add("somestring");
//        linkedList.addFirst("first item");
//        linkedList.addLast("last item");
//        System.out.println(linkedList);
//        System.out.println(linkedList.peek()); // afiseaza primul element din lista
//        System.out.println(linkedList);
//        System.out.println(linkedList.poll()); // afiseaza si elimina primul element
//        System.out.println(linkedList);
//        System.out.println(linkedList.offerFirst());

        // Wrapper classes
        //autoboxing - din primitiva in Wrapper Class
        int x=10;
        Integer xAsInteger = Integer.valueOf(x); // explicit autoboxing
        Integer xAsInteger2 = x; // implicit autoboxing

        // unboxing - din Wrapper Class in primitiva
        Integer y = 10;
        int yAsPrimitive = y.intValue(); // returns Integer from int primitive




    }

    //varargs
//    private static void printAddress(String tara, String orasul, String strada, String localitatea){
//        System.out.println(tara + " " + orasul + " " + strada + " " + localitatea);
//    }
//
//    private static void printAddressFromVarArgs(String name, String... input){
//        // only one varargs per method
//        // varargs should be the last parameter
//        for ( String x : input){
//            System.out.println(x);
//        }
//    }



}
