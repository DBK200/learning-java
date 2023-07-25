package com.sessions.session7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayDemoAV {
    //private final Double PI = 3.14;
    public static void main(String[] args) {

        //Arrays
//        int[] numbers = new int[3];
//        System.out.println(numbers); //nu are metoda toString, se afiseaza hash code
//        for (int x: numbers) {
//            System.out.println(x);
//        }
//
//        int[] specificNumbers = new int[]{2,4,9,5,3,7};
//        specificNumbers[0] = 3;
//        for (int x: specificNumbers) {
//            System.out.println(x);
//        }
        //specificNumbers[7] = 3; throws index out of bounds exception

//        int[] specificNumbersShortcut = {2,4,9,5,3,7};
//
//        int[] array1;
//        int [] array2;
//        int array3[];
//        int array4 [];
//
//        String[][] usernames = {
//                {"Alex", "Diana", "Andreea"},
//                {"Popescu", "Ionescu"}
//        };
        //printam Diana Ionescu
//        System.out.println(usernames[0][1] + " " + usernames[1][1]);

        //copyOfRange - coiem partial un array in alt array
//        String[] carMakers = {"Audi", "BMV", "Mercedes", "Peugeot", "Renault", "Citroen"};
//
//        String[] germanCarMakers = Arrays.copyOfRange(carMakers, 0, 3);
//        for (String name: germanCarMakers){
//            System.out.println(name);
//        }

        //binarySearch - Array-ul trebuie sa fie sortat, algoritm: compara cu valoarea din mijloc, apoi se muta la dreapta/stanga, apoi iar la jumatate
//        int[] sortedNumbers = {1, 2, 3, 4, 5, 6};
//        int result = Arrays.binarySearch(sortedNumbers, 20);
//        System.out.println(result); //daca e negativ, nu a gasit numarul

//        int[] unSortedNumbers = {7, 3, 4, 8, 1, 2};
//        int result = Arrays.binarySearch(unSortedNumbers, 4);
//        System.out.println(result); //daca e sortat, comportamentul e imprevizibil

        //sort
//        String[] carMakers = {"Audi", "Audii", "amv", "Mercedes", "Peugeot", "Renault", "Citroen"};
//        Arrays.sort(carMakers);
//        for (String name: carMakers){
//            System.out.println(name);
//        }
//        System.out.println(Arrays.binarySearch(carMakers, "Mercedes"));

        //varargs
//        printAddress("Romania", "Iasi", "Unirii", "Iasi");
//        printAddressFromVarArgs("Iasi", "bld Unirii", "nr 2", "bl C1", "ghgjh");

        //ArrayList
//        ArrayList list1 = new ArrayList(); //un obiect care contine obiecte, list 1 referinta catre obiect
//        ArrayList list2 = new ArrayList(2); //putem sa-i adaugam elemente
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
//
//        System.out.println(list2);

        //generics <> - diamond operator
//        ArrayList<String> listaMasini = new ArrayList<>();
//        listaMasini.add("BMV");
//        listaMasini.add("Dacia");
//        System.out.println(listaMasini);
////        listaMasini.remove("BMV");
////        System.out.println(listaMasini);
////        int size = listaMasini.size();
//        System.out.println(listaMasini.isEmpty());
//        System.out.println(listaMasini.get(0)); //elementul de pe index 0
//
//        ArrayList<Integer> ageList = new ArrayList<>();
//        ageList.add(0, 2);

        //equals
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        list1.add("abc2");
//        list2.add("abc");
//        System.out.println(list1.equals(list2));

        //converting from arrays to arrayList
//        Integer[] numbersAsArray = {2, 3, 4, 5};
//        List<Integer> numbersAsList = Arrays.asList(numbersAsArray);
//
//        List<String> lista = new ArrayList<>(); //list is the interface implemented by arraylist
//        ArrayList<String> lista2 = new ArrayList<>();
//        System.out.println(lista.getClass()); //java.util.ArrayList

        //LinkedList
//        LinkedList linkedList = new LinkedList<>();
//        linkedList.add("some string");
//        linkedList.addFirst("first item");
//        linkedList.addLast("last item");
//        linkedList.addLast("last last item");
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.peek()); //read first element
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.poll()); //read and remove first element
//        System.out.println(linkedList);

        //wrapper classes
        //autoboxing
        int x = 10;
        Integer xAsInteger = Integer.valueOf(x); //explicit autoboxing - din primitiva in Integer
        Integer xAsInteger2 = x; // implicit

        //unboxing din wrapper class in primitiva
        Integer y = 10;
        int yAsPrimive = y.intValue(); //nu e metoda statica


    }

    //static - disponibil la nivel de clasa
    private static void printAddress(String tara, String orasul, String strada, String localitatea) {
        System.out.println(tara + " " + orasul + " " + strada + " " + localitatea);
    }

    private static void printAddressFromVarArgs(String... input){
        //se poate doar un singur varargs parameter pe metoda
        //varargs should be the last parameter
        for (String x: input) {
            System.out.println(x);
        }
    }
}
