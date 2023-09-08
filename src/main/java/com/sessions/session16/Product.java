package com.sessions.session16;

import java.util.ArrayList;

public class Product {

    private int id;
    private String name;
    private String description;

    public Product(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product: " + "id= " + id + " name= " + name + "description= " + description;
    }
}

class PracticeS16 {

        public static void main(String[] args) {
        Product product = new Product(23, "laptop", "this is a good laptop");
        System.out.println(product);
    }

}