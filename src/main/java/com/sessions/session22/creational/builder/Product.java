package com.sessions.session22.creational.builder;

public class Product {

    private String name;
    private int price;
    private String description;
    private int starReview;
    private String type;
    private long id;

    private Product(String name, int price, String description,
                    int starReview, String type, long id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.starReview = starReview;
        this.type = type;
        this.id = id;
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

    public String getName() {
        return name;
    }

    public static class ProductBuilder {
        private String name;
        private int price;
        private String description;
        private int starReview;
        private String type;
        private long id;

        public static ProductBuilder createProductBuilder(){
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
//        public void setId(long id){thi.s....}
        public ProductBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public Product buildProduct() {
            return new Product(name, price, description, starReview,
                    type, id);
        }
    }
}

class Test{
    public static void main(String[] args) {
        Product iphone=Product.ProductBuilder.createProductBuilder()
                .withId(23)
                .withType("phone")
                .withStarReview(3)
                .withDescription("this is a description")
                .buildProduct();

        Product tv = Product.ProductBuilder.createProductBuilder()
                .withType("TV")
                .withName("Samsung")
                .withDescription("this is a tv")
                .withId(2)
                .withStarReview(5)
                .buildProduct();


        System.out.println(iphone);

//        Product product1=new Product("numele", 123, "descri",
//                0,"phone",123);
    }





}
