package com.sessions.session10.Encapsulation;

public class ProductObj {
    public static void main(String[]args){
        ProductM productM = new ProductM();
        productM.setId(10);
        productM.setPrice(20.80);
        productM.setDescription("text");
        productM.setNumberOfReviews(10);
        productM.setSpecification("text");
        System.out.println(productM.getId());
        System.out.println(productM.getPrice());
        System.out.println(productM.getDescription());
        System.out.println(productM.getNumberOfReviews());
        System.out.println(productM.getSpecification());
    }
}
