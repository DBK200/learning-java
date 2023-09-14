package com.sessions.session15.Homework;

public class Product {
    private String name;
    private int price;
    private int id;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }


    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object == this) {
            return true;
        }

        if (!(object instanceof Product)) {
            return false;
        }
        Product product = (Product) object;

        return id == product.id;
    }


    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Water", 10, 1);
        Product product2 = new Product("Water", 10, 1);
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

    }
}
