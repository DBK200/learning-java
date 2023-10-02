package com.sessions.session22.structural;

public class DemoFacade {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        // check stock, delivery, payment
        orderService.placeOrder("iphone", "Bucharest", 3000);
    }
}
