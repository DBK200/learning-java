package com.sessions.homework13plus.h14;

import java.util.HashSet;
import java.util.Set;

public class Product {
    String name;
    int price, id;

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Suc rece", 5, 30);
        Product p2 = new Product("Suc cald" , 1 , 30);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() + " " + p2.hashCode());

        Set<Product> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {return false;}
        if (obj == this) {return true;}
        if (!(obj instanceof Product)){return false;}

        Product product = (Product) obj;

        return id== product.id;
    }

    @Override
    public int hashCode(){
        int result = 7 ;
        result = 3 * result + id;
        return result;
    }
}
