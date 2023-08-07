package com.sessions.session10.HomeworkProduct;

public class Product {

    private int id;
    private float price;
    private String description;
    private int numOfReviews;
    private String specifications;

    public Product(){

    }

    public Product(int id, float price, String description, int numOfReviews, String specifications){
        this.id = id;
        this.price = price;
        this.description = description;
        this.numOfReviews = numOfReviews;
        this.specifications = specifications;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
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
    public int getNumOfReviews() {
        return numOfReviews;
    }
    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }
    public String getSpecifications() {
        return specifications;
    }
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }
}
