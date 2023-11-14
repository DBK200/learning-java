package com.sessions.examples_solid.dependency_inversion.after;

public class Store {

    private Product myProduct;

    Store(Product productFromUser) {
        myProduct = productFromUser;
    }

    public void buyProduct() {
        System.out.println("Buying product with price " + myProduct.getPrice());
    }
}

class Test {
    public static void main(String[] args) {
        Store store = new Store(new Book());
        store.buyProduct();

        store = new Store(new CD());
        store.buyProduct();

        store = new Store(new ComicBook());
        store.buyProduct();

    }
}
