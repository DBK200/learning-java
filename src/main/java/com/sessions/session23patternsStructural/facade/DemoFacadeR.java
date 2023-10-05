package com.sessions.session23patternsStructural.facade;

public class DemoFacadeR
{
    public static void main(String[] args)
    {
        OrderServiceR orderService=new OrderServiceR();
        //o fatada a functiei order
        orderService.placeOrder("iphone","Bucuresti",300);
    }
}
