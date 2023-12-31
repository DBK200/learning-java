package com.sessions.examples_solid.dependency_inversion.before;

public class Store {

    private Book book = new Book();
    private CD cd = new CD();

    public void buyBook() {
        System.out.println("Buying book with price " + book.getPrice());
    }
}


class Test{
    public static void main(String[] args) {
        Store store = new Store();
        store.buyBook();
    }
}
