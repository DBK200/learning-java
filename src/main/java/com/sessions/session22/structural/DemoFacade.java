package com.sessions.session22.structural;

public class DemoFacade {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        orderService.placeOrder("iphone", "Bucharest", 3000);
    }
}
