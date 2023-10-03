package com.sessions.session24.dependency_inversion.before;

public class Store {

    private Book book = new Book();
    private CD cd = new CD();

    public void buyBook() {
        System.out.println("Buying book with price " + book.getPrice());
    }
    //... -> OCP
}


class Test{
    public static void main(String[] args) {
        Store store = new Store();
        store.buyBook();
    }
}
