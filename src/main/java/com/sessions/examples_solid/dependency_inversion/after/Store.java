package com.sessions.examples_solid.dependency_inversion.after;

public class Store {

    private Product product;

    Store(Product product){
        this.product=product;
    }

    public void buyProduct() {
        System.out.println("Buying product with price " + product.getPrice());
    }
}



class Test{
    public static void main(String[] args) {
        Store store = new Store(new Book());
        store.buyProduct();
    }
}
