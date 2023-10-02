package com.sessions.session23.structural;

import java.util.Objects;

public class DemoFcade {
    public static void main(String[] args) {
        OrderService orderService=new OrderService();
        orderService.placeOrder("iphone","Bucharest",3000);
    }
}
