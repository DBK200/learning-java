package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex13;

public class Test {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product product1 = new Product("Telephones", 300);
        Product product2 = new Product("Laptops", 30);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.checkLowInventory();
    }
}
