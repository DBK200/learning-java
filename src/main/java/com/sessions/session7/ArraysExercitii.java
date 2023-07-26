package com.sessions.session7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysExercitii {
    // private final Double PI=3.14;

    public static void main(String[] args) {
        //Arrays

//        int[] numbers = new int[3];
//        System.out.println(numbers);
//        for (int x : numbers) {
//            System.out.println(x);
//        }
//
//
//        int[] specificNumbers=new int[]{2,5,3,6,4,5,8};
//        specificNumbers[0]=3;
//        for(int x:specificNumbers)
//        {
//            System.out.println(x);
//        }
//
//        int[] specificNumbersShortCut={2,5,3,6,4,5,8};
//
//        //cum putem declara un array
//
//        int[] array1;
//        int [] array2;
//        int array3[];
//        int array4 [];
//
//        String [][] usernames={
//                {"Alex","Diana","Andreea"},
//                {"Popescu","Ionescu"}};
//
//        System.out.println(usernames[0][1] + " " + usernames[1][1]);
//
//        //copyOfRange
//
//        String[] carMakers={"Audi","Mercedes","Bmw","Renaul","Pegeout"};
//        String[] germanCarMakers=Arrays.copyOfRange(0,3);
//        for(String name:germanCarMakers)
//        {
//            System.out.println(name);
//        }

        //binarySearch 9   2,3,4,5,6,7,8,9

//        int [] sortedNumbers={1,2,3,4,5,6};
//        int result= Arrays.binarySearch(sortedNumbers,5);
//        System.out.println(result);

//
        //sort

//        String[] carMakers={"Audi","Mercedes","Bmw","Renaul","Pegeout"};
//        Arrays.sort(carMakers);
//        for(String name:carMakers)
//        {
//            System.out.println(name);
//        }
//        System.out.println(Arrays.binarySearch(carMakers,"Mercedes"));
//
        //varargs

//        printAdressFromVarArgs("Iasi","Bucuresti","Blv Chimiei","nr2","bl c1");


        //ArraysList

//        ArrayList list1=new ArrayList();//e un obiect de tip ArrayList list1 este referinta
//        ArrayList list2=new ArrayList(2);
//        ArrayList list3=list1;
//
//        list1.add("something");
//        list1.add(1);
//        list1.add(false);
//
//        System.out.println(list1);
//
//        list2.add(1);
//        list2.add("some");
//        list2.add(9);
//
//        System.out.println(list2);
//

        //generics<>

//        ArrayList<String > listaMasini=new ArrayList<>();
//        listaMasini.add("BMW");
//        listaMasini.add("Dacia");
//        listaMasini.add("Audi");
//        System.out.println(listaMasini);
//       // listaMasini.remove("BMW");
//       // System.out.println(listaMasini);
//        //listaMasini.size();
//        System.out.println(listaMasini.isEmpty());
//        System.out.println( listaMasini.get(1));

//        ArrayList<Integer > ageList=new ArrayList<>();
//        ageList.add(2);
//
        //eguals()

//        ArrayList<String > list1=new ArrayList<>();
//        ArrayList<String > list2=new ArrayList<>();
//        list1.add("abc");
//        list2.add("abc");
//        System.out.println(list1.equals(list2));
//
//        //converting from arrays to arrays list
//
//        Integer[] numbersAsArray={2,3,4,5};
//        List<Integer> numbersAsList=Arrays.asList(numbersAsArray);
//
//        List<String> lista = new ArrayList<>();
//        System.out.println(lista.getClass());

        //LinkedList

        LinkedList linkedList=new LinkedList();
        linkedList.add(("SomeString"));
        linkedList.addFirst("First item");
        linkedList.addLast("Last item");
        System.out.println(linkedList);

       linkedList.peek();







    }

    public static void printAdress(String tara,String orasul,String localitatea)
    {
        System.out.println(tara + " " + orasul + " " + localitatea);
    }
    private static void printAdressFromVarArgs(String X,String...input)
    {
        //only one varargs per method
        //varargs should be the last parameter

        for(String x:input)
        {
            System.out.println(x);
        }

    }


}
