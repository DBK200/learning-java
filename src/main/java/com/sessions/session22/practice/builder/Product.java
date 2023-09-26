package com.sessions.session22.practice.builder;

public class Product {
    private String name;
    private int price;
    private String description;
    private int starReview;
    private String type;
    private long id;

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

    private Product(String name, int price, String description,
                    int starReview, String type, long id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.starReview = starReview;
        this.type = type;
        this.id = id;
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

    public static class ProductBuilder{
        private String name;
        private int price;
        private String description;
        private int starReview;
        private String type;
        private long id;

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

        public static ProductBuilder createProductBuilder(){
            return new ProductBuilder();
        }
        public Product build(){
            return new Product(name, price, description, starReview, type, id);
        }
    }
}


class Test{
    public static void main(String[] args) {
        Product iphone = Product.ProductBuilder.createProductBuilder()
                .withId(23)
                .withType("Phone")
                .withStarReview(3)
                .build();
        System.out.println(iphone);
    }
}