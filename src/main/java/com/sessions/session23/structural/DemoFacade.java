package com.sessions.session23.structural;

public class DemoFacade {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        //checkstock, delivery, payment
        orderService.placeOrder("Iphone","Bucharest", 3000);
    }
}
