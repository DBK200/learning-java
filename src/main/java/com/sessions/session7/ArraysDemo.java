package com.sessions.session7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysDemo {
//    private final Double PI = 3.14;

    public static void main(String[] args) {
//
//        //Arrays
//        int[] numbers = new int[3];
//        System.out.println(numbers);
//
//        for (int x : numbers) {
//            System.out.println(x);
//        }
//
//        int[] specificNumbers = new int[]{2,3,6,7,9,2,3};
//        specificNumbers[0]=3;
//        for (int x : specificNumbers) {
//            System.out.println(x);
//        }
////        specificNumbers[7]=3; - throws index out of bounds exception
//
//        int[] specificNumbersShortcut = {2,3,6,7,9,2,3};
//
//        int[] array1;
//        int [] array2;
//        int array3[];
//        int array4 [];
//
//        String[][] usernames = {{"Alex", "Diana", "Andreea"},{"Popescu","Ionescu"}};
//        //printam Diana Ionescu
//        System.out.println(usernames[0][1] + " " + usernames[1][1]);

        //copyOfRange
//        String[] carMakers = {"Audi", "Bmw", "Mercedes", "Peugeot", "Renault", "Citroen"};
//
//        String[] germanCarMakers = Arrays.copyOfRange(carMakers, 3, 6);
//        for (String name: germanCarMakers){
//            System.out.println(name);
//        }
//
        //binarySearch
//        int[] sortedNumbers = {1,2,3,4,5,6};
//        int result = Arrays.binarySearch(sortedNumbers, 21);
//        System.out.println(result);

//        int[] unsortedNumbers = {7,3,4,8,1,2};
//        int result = Arrays.binarySearch(unsortedNumbers, 7);
//        System.out.println(result);

        //sort
//        String[] carMakers = {"Audi", "Audii", "Bmw", "Mercedes", "Peugeot", "Renault", "Citroen"};
//        Arrays.sort(carMakers);
//        for (String name : carMakers) {
//            System.out.println(name);
//        }
//
//        System.out.println(Arrays.binarySearch(carMakers, "Mercedes"));

        //varargs
//        printAddress("Ro","Iasi");
//        printAddressFromVarArgs("Iasi", "bld Chimiei", "nr 2", "bl c1", "wergerfgerg");

        //ArrayList
//        ArrayList list1 = new ArrayList(); //un obiect de tip ArrayList, list1 este referinta
//        ArrayList list2 = new ArrayList(2); //
//        ArrayList list3 = list1;
//
//        list1.add("something");
//        list1.add(1);
//        list1.add(false);
//
//        System.out.println(list1);
//
//        list2.add(1);
//        list2.add("some string ");
//        list2.add(2);
//
//        System.out.println(list2);

        //generics <>
//        ArrayList<String> listaMasini = new ArrayList<>();
//        listaMasini.add("BMW");
//        listaMasini.add("Dacia");
//        System.out.println(listaMasini);
//        listaMasini.remove("BMW");
//        System.out.println(listaMasini);
//        listaMasini.size()
//        System.out.println(listaMasini.isEmpty());
//        System.out.println(listaMasini.get(1));
//
//        ArrayList<Integer> ageList = new ArrayList<>();
//        ageList.add(2);

        //equals()
        ArrayList<String> list1 =  new ArrayList<>();
        ArrayList<String> list2 =  new ArrayList<>();
        list1.add("abc2");
        list2.add("abc");
        System.out.println(list1.equals(list2));

        //converting from arrays to arraylist
//        Integer[] numbersAsArray= {2,3,4,5};
//        List<Integer> numbersAsList = Arrays.asList(numbersAsArray);
//        numbersAsList.

//       List<String> lista = new ArrayList<>();// List is the interface implemented by ArrayList class
//        System.out.println(lista.getClass());

        // LinkedList
//        LinkedList linkedList =  new LinkedList();
//        linkedList.add("somestring");
//        linkedList.addFirst("first item ");
//        linkedList.addLast("last item");
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.peek()); //read first element
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.poll()); // read and remove first element
//        System.out.println(linkedList);

        //Wrapper classes
        //autoboxing din primitiva in Wrapper Class
        int x =10;
        Integer xAsInteger = Integer.valueOf(x); //explicit autoboxing
        Integer xAsinteger2 = x; //implicit autoboxing

        //unboxing  din Wrapper class in primitiva
        Integer y = 10;
        int yAsPrimitve = y.intValue(); // returns Integer from int primitive

    }

    private static void printAddress(String tara, String orasul, String strada, String localitatea) {
        System.out.println(tara + " " + orasul + " " + strada + " " + localitatea);
    }

    private static void printAddressFromVarArgs( String... input){
        // only one varargs per method
        // varargs should be the last parameter

        for (String x: input){
            System.out.println(x);
        }
    }

}
