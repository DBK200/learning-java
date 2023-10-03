package com.sessions.session21.creational.builder;

import com.sessions.session15.Homework.Exercise5.Product;

public class ProductAV {
    private String name;
    private int price;
    private String description;
    private int starReview;
    private String type;
    private long id;

    private ProductAV(String name, int price, String description, int starReview, String type, long id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.starReview = starReview;
        this.type = type;
        this.id = id;
    }
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

    public static class ProductBuilder {
        private String name;
        private int price;
        private String description;
        private int starReview;
        private String type;
        private long id;

        public static ProductBuilder productBuilder() {
            return new ProductBuilder();
        }

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public ProductBuilder withPrice(int price) {
            this.price = price;
            return this;
        }
        public ProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }
        public ProductBuilder withStarReview(int starReview) {
            this.starReview = starReview;
            return this;
        }
        public ProductBuilder withType(String type) {
            this.type = type;
            return this;
        }
        public ProductBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public ProductAV build() {
            return new ProductAV(name, price, description, starReview, type, id);
        }
    }
}

class Test {
    public static void main(String[] args) {

        ProductAV iphone = ProductAV.ProductBuilder.productBuilder()
            .withId(123)
            .withDescription("ggfds")
            .withPrice(534)
            .withType("phone")
            .withStarReview(3)
            .build();

        ProductAV tv = ProductAV.ProductBuilder.productBuilder()
                .withId(2)
                .withName("Samsung")
                .build();

        System.out.println(iphone);
    }
}