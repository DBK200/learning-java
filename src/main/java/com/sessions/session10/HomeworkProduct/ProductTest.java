package com.sessions.session10.HomeworkProduct;

public class ProductTest {

    public static void main(String[] args) {

        Product product = new Product();

        product.setId(334);
        product.setPrice(399.99f);
        product.setDescription("Some new phone");
        product.setNumOfReviews(32);
        product.setSpecifications("Big screen\nExcellent camera\nFast processor");
        System.out.println("The Id if the product is: " + product.getId());
        System.out.println("Price is: " + product.getPrice());
        System.out.println("Decription: " + product.getDescription());
        System.out.println("Number of reviews: " + product.getNumOfReviews());
        System.out.println("Specifications: " + product.getSpecifications());

        System.out.println();

        Product product2 = new Product(23, 999.99f, "Laptop", 16, "High performance\nDurable\nHigh Resolution Screen");
        System.out.println("The Id if the product is: " + product2.getId());
        System.out.println("Price is: " + product2.getPrice());
        System.out.println("Decription: " + product2.getDescription());
        System.out.println("Number of reviews: " + product2.getNumOfReviews());
        System.out.println("Specifications: " + product2.getSpecifications());
    }
}
