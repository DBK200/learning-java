package com.sessions.session7;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        //Arrays
//    int[] numbers=new int[3];
//        System.out.println(numbers);
//    for(int x : numbers){
//        System.out.println();
//        }
//
//        int[] specificNumbers=new int[]{2,3,5,4,6,4,5};
//        specificNumbers[0]=3;
//        for (int x:specificNumbers){
//            System.out.println(x);
//        }
//
//        int[] specificNumbersShortcut={2,3,5,4,6,4,5};
//        int[] array1;
//        int [] array2;
//        int[] array3[];


//        String[][] usernames={{"Alex","David","Diana"},{"Popescu","Ionescu"}};
//        System.out.println(usernames[0][1]+" "+usernames[1][1]);

        //copyOfRange
//        String[] carMakers={"Audi","BMW","Mercedes","Peugeot","Renault","Citroen"};
//        String[] germanCarMakers=Arrays.copyOfRange(carMakers,3,6);
//        for (String name:germanCarMakers){
//            System.out.println(name);
//        }

        //binarySearch
//        int[] sortNumbers={1,2,3,4,5,6};
//        int resut =Arrays.binarySearch(sortNumbers, 21);
//        System.out.println(resut);

//        int[] sortNumbers={7,3,4,8,1,2};
//        int resut =Arrays.binarySearch(sortNumbers, 2);
//        System.out.println(resut);

        //sort
//        String[] carMakers={"Audi","BMW","Mercedes","Peugeot","Renault","Citroen"};
//        Arrays.sort(carMakers);
//        for (String name:carMakers){
//            System.out.println(name);
//        }
//
//        System.out.println(Arrays.binarySearch(carMakers,"Mercedes"));

        //varargs

//        printAdress("Ro","iasi");

        //ArrayList


//        ArrayList list1=new ArrayList();//un obiect de tip ArrayList, list1 este referinta
//        ArrayList list2=new ArrayList(2);//
//        ArrayList list3= list1;
//
//        list1.add("something");
//        list1.add(1);
//        list1.add(false);
//
//        System.out.println(list1);


        //generics
//        ArrayList<String> listaMasini = new ArrayList<>();
//        listaMasini.add("bmw");
//        listaMasini.add("dacia");
//        System.out.println(listaMasini);
//        listaMasini.remove("bmw");
//        System.out.println(listaMasini);
//        listaMasini.size();
//        System.out.println(listaMasini.isEmpty());
//        System.out.println(listaMasini.get(0));
//
//        ArrayList<Integer> ageList = new ArrayList<>();
//        ageList.add(2);


        //equals
//        ArrayList<String> list1=new ArrayList<>();
//        ArrayList<String> list2=new ArrayList<>();
//        list1.add("abc");
//        list2.add("abc");
//        System.out.println(list1.equals(list2));
//
//        //coverting from arrays to arraylist
//        Integer[] numbersAsArray={2,3,4,5};
//        List<Integer>numbersAsList=Arrays.asList(numbersAsArray);
        //numbersAsList

//       List<String> lista=new ArrayList<>();//List is the interface implemented by ArrayList class
//        System.out.println(lista.getClass());

        //LinkedList
//        LinkedList linkedList=new LinkedList();
//        linkedList.add("somestring");
//        linkedList.addFirst("first item");
//        linkedList.addLast("last item");
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.peek());//read first element
//        System.out.println(linkedList);
//        System.out.println(linkedList.poll());//read and remove first element
//        System.out.println(linkedList);

        //Wrapper classes
        //autoboxing
       // int x=10;
//        Integer xAsInteger=Integer.valueOf(x);//explicit autoboxing
//        Integer xAsInteger2=x;//implicit autoboxing

        //unboxing
//        Integer y=10;
//        int yAsPrimitive=y.intValue();//returns Integer from int primitive


    }



//    private static void printAdress (String tara, String orasul ){
//        System.out.println(tara+" "+orasul);
//    }

//    private static void printAdressFromVarargs (String x, String... input ){
//        System.out.println(tara+" "+orasul);}
}







