package com.sessions.session16.Homework16;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public boolean equals(Object object) {
        if(object==null)
            return false;
        if(object==this)
            return true;
        if(!(object instanceof Product))
            return false;

        Product product=(Product) object;
        return id==product.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}
