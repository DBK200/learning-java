package com.sessions.session22.challenges;

/**
 * <h1>Different Builder Class</h1>
 * <p>The class is a simplified version of a builder class</p>
 */
public class NewProduct {
    private String name;
    private int price;
    private String description;
    private int starReview;
    private String type;
    private long id;

    // Makes the constructor private
    private NewProduct() {}

    // Object instantiation method.
    // Creates a new object filled with default values
    public static NewProduct buildNewProduct() {
        return new NewProduct();
    }

    // Getters declaration
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStarReview() {
        return starReview;
    }

    public String getType() {
        return type;
    }

    public long getId() {
        return id;
    }

    // Pseudo-setters moved from Builder subclass
    public NewProduct withName(String name) {
        this.name = name;
        return this;
    }

    public NewProduct withPrice(int price) {
        this.price = price;
        return this;
    }

    public NewProduct withDescription(String description) {
        this.description = description;
        return this;
    }

    public NewProduct withStarReview(int starReview) {
        this.starReview = starReview;
        return this;
    }

    public NewProduct withType(String type) {
        this.type = type;
        return this;
    }

    public NewProduct withId(long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return String.format("NewProduct {name: " + format(name) +
                ", price: " + price +
                ", description: " + format(description) +
                ", starReview: " +  starReview +
                ", type: " + format(type) +
                ", id: " + id + "}");
    }

    private String format(String text){
        return (text == null ? text : "'" + text + "'");
    }
}


class Test{
    public static void main(String[] args) {

        NewProduct iphone = NewProduct.buildNewProduct()
                .withId(23)
                .withName("iPhone 12")
                .withType("Phone")
                .withStarReview(3);

        System.out.println(iphone);
    }
}