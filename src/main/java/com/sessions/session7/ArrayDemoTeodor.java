package com.sessions.session7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayDemoTeodor {
//    private final Double PI = 3.14;

    public static void main(String[] args) {


//        int[] numbers = new int[3];
//        System.out.println(numbers);
//        for (int x : numbers) {
//            System.out.println(x);
//        }
//        int[] specificNumbers = new int[]{1,3,4,5,8,9,10};
//        specificNumbers[0] = 3;
//        for (int x : specificNumbers){
//            System.out.println(x);
//        }
//
//        int[] specificNumbersShortcut = {1,3,4,5,8,9,10};
//
//        int[] array1;
//        int [] array2;
//        int array[];
//        int array4 [];
//
//        String[][] usernames = {{"Diana", "Alex", "Andreea"}, {"Popescu", "Ionescu"}};
//        System.out.println(usernames[0][0] + " " + usernames[1][1]);


//        String[] carMakers = {"Audi", "BMW", "Mercedes", "Mazda", "Peugeot", "Renault", "Citroen"};
//        String[] germanCars = Arrays.copyOfRange(carMakers, 0, 3);
//        for (String name : germanCars){
//            System.out.println(name);
//        }

//        int[] sortedNumbers = {1,2,3,4,5,6};
//        int result = Arrays.binarySearch(sortedNumbers, -21);
//        System.out.println(result);

//        int[] unsortedNumbers = {8,1,2,9,5,7};
//        int result = Arrays.binarySearch(unsortedNumbers, 8);
//        System.out.println(result);

//        String[] carMakers = {"Audi", "Audii", "BMW", "Mercedes", "Mazda", "Peugeot", "Renault", "Citroen"};
//        Arrays.sort(carMakers);
//        for(String name : carMakers){
//            System.out.println(name);
//        }
//        System.out.println(Arrays.binarySearch(carMakers, "Mercedes"));

        //varargs
//        printAdress("RO", "Oradea", "republicii", "oradea");
//        printAdressFromVarArgs("Iasi", "bld Chimiei", "nr 3", "bl b2");


//        ArrayList arrayList = new ArrayList();
//        ArrayList arrayList1 = new ArrayList(2);
//        ArrayList arrayList2 = arrayList;
//        arrayList.add("something");
//        arrayList.add(1);
//        arrayList.add(false);
//
//        System.out.println(arrayList2);
//
//        arrayList1.add("some string");
//        arrayList1.add(2);
//        System.out.println(arrayList1);

        //generics<>

//        ArrayList<String> listaMasini = new ArrayList<>();
//        listaMasini.add("BMW");
//        listaMasini.add("Audi");
//        listaMasini.add("Smart");
//        System.out.println(listaMasini);
//        listaMasini.remove("BMW");
//        System.out.println(listaMasini.size());
//        System.out.println(listaMasini.get(0));
//
//        ArrayList<Integer> ageList = new ArrayList<>();
//        ageList.add(2);
//        System.out.println(ageList);

//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("abc");
//        list.add("abc");
//        System.out.println(list.equals(list1));
//
//        //converting from arrays to arraylist
//        Integer[] numbersAsArray = {2,3,4,5};
//        List<Integer> numbersAsList = Arrays.asList(numbersAsArray);
//
//
//        List<String> lista = new ArrayList<>(); //list is the interface implemented by arraylist class
//        System.out.println(lista.getClass());

        //linked list

//        LinkedList linkedList = new LinkedList();
//        linkedList.add("somestring");
//        linkedList.addFirst("first item");
//        linkedList.addLast("last item");
//        System.out.println(linkedList);
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList);
//        System.out.println(linkedList.poll());
//        System.out.println(linkedList);

        //Wrapper classes
        //autoboxing
        int x = 10;
        Integer xAsInteger = Integer.valueOf(x);
        Integer xAsInteger2 = x;

        //unboxing
        Integer y = 10;
        int yAsPrimitive = y.intValue(); //returns Integer from int primitive




    }


    private static void printAdress(String tara, String orasul, String strada, String localitatea){
        System.out.println(tara + " " + orasul + " " + strada + " "+ localitatea);
    }
    private static void printAdressFromVarArgs(String x, String... input){
        for (String i : input){
            System.out.println();
        }
    }
}
