package com.sessions.session10.EncapsulationHomework;

public class Product {

    // Properties
    private int id;
    private float price;
    private String description;
    private int numberOfReviews;
    private String specifications;

    // No args contructor
    public Product(){

    }

    // All args constructor
    public Product(int id, float price, String description, int numberOfReviews, String specifications){
        this.id = id;
        this.price = price;
        this.description = description;
        this.numberOfReviews = numberOfReviews;
        this.specifications = specifications;
    }

    // Getters
    public int getId(){
        return id;
    }

    public float getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public int getNumberOfReviews(){
        return numberOfReviews;
    }

    public String getSpecifications(){
        return specifications;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setNumberOfReviews(int numberOfReviews){
        this.numberOfReviews = numberOfReviews;
    }

    public void setSpecifications(String specifications){
        this.specifications = specifications;
    }
}
