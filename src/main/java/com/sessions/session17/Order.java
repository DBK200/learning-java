package com.sessions.session17;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {

    private String orderId;
    private String description;
//    ...

    private T item;

    public Order() {
    }

    ;

    public Order(String name, String description, T item) {
        this.orderId = name;
        this.description = description;
        this.item = item;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getDescription() {
        return description;
    }

    public T getItem() {
        return item;
    }
}

class GenericPractice {

    public static void main(String[] args) {
        Order<String> order1 = new Order<>("wedwd","wefwef","wefwef");
        System.out.println(order1.getItem());

        Order<Integer> order2=new Order<>("234234","this is my order", 23);
        List<String> list= new ArrayList<>();
    }


}
