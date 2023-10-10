package com.sessions.session21.creational.structural;

public class DemoFacade {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("iphone", "cluj", 2000);
    }
}
