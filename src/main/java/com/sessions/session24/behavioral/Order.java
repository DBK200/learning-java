package com.sessions.session24.behavioral;

public abstract class Order {

    abstract void checkStock();
    abstract void checkDelivery();
    abstract void performPayment();
    abstract void sendNotification();



    public final void placeOrder(){

        checkDelivery();
        checkDelivery();
        performPayment();
        sendNotification();
    }
}

class BookOrder extends Order{

    @Override
    void checkStock() {
        System.out.println("Checking book stock");
    }

    @Override
    void checkDelivery() {
        System.out.println("Checking delivery options for books");

    }

    @Override
    void performPayment() {
        System.out.println("Performing payment for book order");

    }

    @Override
    void sendNotification() {
        System.out.println("Sending SMS notification for Book order...");

    }
}
class ElectronicsOrder extends Order{

    @Override
    void checkStock() {
        System.out.println("Checking electronics stock");
    }

    @Override
    void checkDelivery() {
        System.out.println("Checking delivery options for electronics");

    }

    @Override
    void performPayment() {
        System.out.println("Performing payment for book electronics");

    }

    @Override
    void sendNotification() {
        System.out.println("Sending SMS notification for electronics order...");

    }
}

class TemplateDemo{
    public static void main(String[] args) {
        Order bookOrder = new BookOrder() ;
        bookOrder.placeOrder();

        Order electronicsOrder = new ElectronicsOrder();
        electronicsOrder.placeOrder();

    }
}
