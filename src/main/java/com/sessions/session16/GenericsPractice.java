package com.sessions.session16;

import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {

    // metode cu generics
    private static <E> void printArray(E[] array){  // vreau sa primesc un array de un tip de date generic E
        for(E element : array){  // pentru fiecare element de tip E din array-ul acesta se va face...
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("wrg");

//        Order<String, Integer> order = new Order<>(2, "numele", "aaa", 23);
//            // tot ce inseamna T devine String
//        System.out.println(order.getItem());

        String[] stringArray = {"a", "b", "c"};
        Integer[] integerArray = {1, 2, 3};
        printArray(stringArray);
        printArray(integerArray);
    }
}


// se refera la a comanda un produs
// <> = diamond operator

// Electronics, auto, ...
class Order<T, U> {
    private int id;
    private String name;
    private T item; //item este de tip T si nu da eroare pentru ca este definit la nivelul clasei

    private U category;
    public Order(int id, String name, T item, U category){
        this.id = id;
        this.name = name;
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}