package com.sessions.session16;

import java.util.LinkedList;
import java.util.List;

public class GenericsPractice {

    private static <E> void printArray(E[] array){
        for (E element : array){
            System.out.println(element);

        }

    }
    public static void main(String[] args) {

//        List<String> stringList = new LinkedList();
//        stringList.add("sa");

//        Order<String, Integer> order = new Order<>(3, "numele", "23", 33);
//        System.out.println(order.getItem());

        String[] stringArray = {"a", "b" , "c"};
        Integer[] integerArray = {1, 2, 3};
        printArray(stringArray);
        printArray(integerArray);
    }
}

class Order<T, U>{

    private int id;
    private String name;
    private T item;
    private U category;

    public Order(int id, String name, T item, U category){
        this.id =id;
        this.name = name;
        this.item = item;
        this.category =category;
    }
    public T getItem(){
        return  item;
    }

}
