package com.sessions.session15.Homework.Exercise5;

public class Application {
    public static void main(String[] args) {

        Product product1 = new Product("bread", 10, 1);
        Product product2 = new Product("onion", 4, 1);

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product1.equals(product2));

        product2.setId(2);
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product1.equals(product2));
    }
}
