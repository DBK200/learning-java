package com.sessions.session15.Homework.Exercise5;

public class Product {
    private String name;
    private int price;
    private int id;
    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    public void setId(int id) {
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
        return id + 32;
    }
}
