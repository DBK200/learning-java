package com.sessions.session16;


public class ProductM {

    private int id;
    private String name;
    private String description;

    public ProductM(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product: " + "id= " + id + " name= " + name + " description= " + description;
    }
}

class Practice {
    public static void main(String[] args) {
        ProductM product = new ProductM(23, "laptop", "this is a good laptop");
        String result = product.toString();
        System.out.println(product);
    }
}