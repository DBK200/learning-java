package com.sessions.session15.Homework.Challange5;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Phone", 1000, 3445);
        Product product2 = new Product("Tablet", 700, 3445);

        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

        System.out.println();

        product1.setId(5489);
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
    }
}
