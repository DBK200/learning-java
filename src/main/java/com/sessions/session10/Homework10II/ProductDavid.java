package com.sessions.session10.Homework10II;

public class ProductDavid {
    private int id;
    private float price;
    private String description;
    private int numberOfReview;
    private String specification;

    public ProductDavid(){

    }

    public ProductDavid(int id,float price,String description,int numberOfReview,String specification){
        this.id=id;
        this.price=price;
        this.description=description;
        this.numberOfReview=numberOfReview;
        this.specification=specification;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumberOfReview(int numberOfReview) {
        this.numberOfReview = numberOfReview;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfReview() {
        return numberOfReview;
    }

    public String getSpecification() {
        return specification;
    }
}
