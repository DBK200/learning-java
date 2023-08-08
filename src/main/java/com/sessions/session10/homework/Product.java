package com.sessions.session10.homework;

public class Product {

    private int id;
    private float price;
    private String description;
    private int numberOfReviews;
    private String specifications;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public void printProductProprieties(){
        System.out.println("Id:" + id + " ,Price:" + price + " ,Description:" + description + " ,Number of reviews:" + numberOfReviews + " ,Specifications:" + specifications);
    }

    public Product(){};
    public Product(int id ,float price ,String description ,int numberOfReviews ,String specifications){
        this.id = id;
        this.price = price;
        this.description = description;
        this.numberOfReviews = numberOfReviews;
        this.specifications = specifications;
    }
}
