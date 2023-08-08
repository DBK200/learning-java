package com.sessions.session10.homework;

public class TestProduct {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId(17);
        product1.setPrice(32.99F);
        product1.setDescription("Monkey doll");
        product1.setNumberOfReviews(230);
        product1.setSpecifications("Flammable");
        product1.printProductProprieties();

        Product product2 = new Product(21,9.99F,"Expensive Water bottle",32,"1,5L");
        product2.printProductProprieties();
    }
}
