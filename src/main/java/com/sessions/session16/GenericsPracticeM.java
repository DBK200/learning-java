package com.sessions.session16;

import java.util.ArrayList;
import java.util.List;

public class GenericsPracticeM {

    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
//        List<String> stringlist = new ArrayList<>();
//        stringlist.add("wrg");
//        Order<String, Integer> order = new Order<>(2, "numele", "23", 23);
//        System.out.println(order.getItem());
        String[] stringArray = {"a", "b", "c"};
        Integer[] integerArray = {1, 2, 3};
        printArray(stringArray);
        printArray(integerArray);
    }
}

class Order<T, U> {

    private int id;
    private String name;
    private T item;
    private U category;

    public Order(int id, String name, T item, U category) {
        this.id = id;
        this.name = name;
        this.item = item;
        this.category = category;
    }

    public T getItem() {
        return item;
    }
}