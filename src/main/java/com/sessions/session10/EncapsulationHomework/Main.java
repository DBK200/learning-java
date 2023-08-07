package com.sessions.session10.EncapsulationHomework;

public class Main {
    public static void main(String[] args) {


    // Object of Product class made through no args constructor
    Product product = new Product();

    // Setting the values of the product object's properties using setter methods
        product.setId(55478);
        System.out.println("Id set through setter method: " + product.getId());

        product.setPrice(23.55f);
        System.out.println("Price set through setter method: " + product.getPrice());

        product.setDescription("Wireless headphones");
        System.out.println("Description set through setter method: " + product.getDescription());

        product.setNumberOfReviews(23);
        System.out.println("Number of review set through setter method: " + product.getNumberOfReviews());

        product.setSpecifications("Wireless, bluetooth 5.3 connection, in ear, with microphone, vocal assistant");
        System.out.println("Specifications set through setter method: " + product.getSpecifications());
        System.out.println();

        // Object of Product class made through all args constructor
        Product product1 = new Product(12997, 33.88f, "Gaming headphones", 55, "Professional gaming headphones, detachable microphone, background noise cancellation");
        System.out.println("Id set through all args constructor: " + product1.getId());
        System.out.println("Price set through all args constructor: " + product1.getPrice());
        System.out.println("Description set through all args constructor: " + product1.getDescription());
        System.out.println("Number of reviews set through all args constructor: " + product1.getNumberOfReviews());
        System.out.println("Specifications set through all args constructor: " + product1.getSpecifications());
    }
}