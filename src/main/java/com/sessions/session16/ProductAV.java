package com.sessions.session16;

public class ProductAV {
    private int id;
    private String name;
    private String description;

    public ProductAV(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return  "Product: " + "i=" + id + " name=" + name + " description=" + description;
    }
}

class Practice {
    public static void main(String[] args) {

        ProductAV product = new ProductAV(23, "laptop", "this is a good laptop");
        String result = product.toString();
        System.out.println(result);
    }
}
