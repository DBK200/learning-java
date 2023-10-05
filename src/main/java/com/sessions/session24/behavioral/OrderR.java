package com.sessions.session24.behavioral;

public abstract class OrderR
{
    abstract void checkStock();
    abstract void checkDelivery();
    abstract void performPayment();
    abstract void sendNotification();
    public void placeOrder()
    {
        checkStock();
        checkDelivery();
        performPayment();
        //...
        sendNotification();
    }

}
class BookOrderR extends OrderR
{
     void checkStock()
    {
        System.out.println("Checking book stock");
    }
     void checkDelivery()
    {
        System.out.println("Checking delivery options for books");
    }
     void performPayment()
    {
        System.out.println("Performing payment for book order");
    }
     void sendNotification()
     {
         System.out.println("Sending SMS notification for book order...");
     }

}
class ElectroniscOrderR extends OrderR
{
    void checkStock()
    {
        System.out.println("Checking electronics stock");
    }
    void checkDelivery()
    {
        System.out.println("Checking delivery options for electronics");
    }
    void performPayment()
    {
        System.out.println("Performing payment for electronics order");
    }
    void sendNotification()
    {
        System.out.println("Sending SMS notification for electronics order...");
    }

}
class  TemplateDemoR
{
    public static void main(String[] args)
    {
        OrderR bookOrder=new BookOrderR();
        bookOrder.placeOrder();

        OrderR electronicsOrder=new BookOrderR();
        electronicsOrder.placeOrder();
    }
}
