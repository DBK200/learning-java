package com.sessions.session10.Encapsulation;

public class ProductM {
    //Properties
    private int id;
    private double price;
    private String description;
    private int numberOfReviews;
    private String specification;

    //Encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

      public static void ProductM(int id, double price, String description, int numberOfReviews, String specification){
       id = 10;
       description = "some text";
       numberOfReviews = 15;
       specification = "another text";

    }
    public static void main(String[]args){

    }
}

