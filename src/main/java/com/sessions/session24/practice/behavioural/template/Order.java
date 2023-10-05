package com.sessions.session24.practice.behavioural.template;

/**
 * <h1>Template pattern abstract class</h1>
 */
public abstract class Order {

    abstract void checkStock();
    abstract void checkDelivery();
    abstract void performPayment();
    abstract void sendNotification();

    /**
     * Final method
     */
    public final void placeOrder() {
        checkStock();
        checkDelivery();
        performPayment();
        //...
        sendNotification();
    }

}


class BookOrder extends Order {

    @Override
    void checkStock() {
        System.out.println("Book stock checking...");
    }

    @Override
    void checkDelivery() {
        System.out.println("Book delivery options checking...");
    }

    @Override
    void performPayment() {
        System.out.println("Book ordering payment...");
    }

    @Override
    void sendNotification() {
        System.out.println("User notification by SMS. Book is coming...");
    }
}

class ElectronicsOrder extends Order {

    @Override
    void checkStock() {
        System.out.println("Electronics stock checking...");
    }

    @Override
    void checkDelivery() {
        System.out.println("Electronics delivery options checking...");
    }

    @Override
    void performPayment() {
        System.out.println("Electronics ordering payment...");
    }

    @Override
    void sendNotification() {
        System.out.println("User notification by SMS. The electronic product is coming....");
    }
}

/**
 * <h1>Testing class</h1>
 */
class TemplateTest{
    public static void main(String[] args) {
        Order bookOrder = new BookOrder();
        bookOrder.placeOrder();
        System.out.println("=".repeat(30));
        Order electronicsOrder = new ElectronicsOrder();
        electronicsOrder.placeOrder();
    }
}