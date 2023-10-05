package com.sessions.session23patternsStructural.facade;

public class OrderServiceR
{
    private final StockServiceR stockService=new StockServiceR();
    private final PaymentServiceR paymentService=new PaymentServiceR();
    private final DeliveryServiceR deliveryService=new DeliveryServiceR();
    public void placeOrder(String product,String location,int price)
    {
        //verificam daca exista produsul respectiv

        stockService.checkStock(product);
        paymentService.checkPayment(price);
        deliveryService.checkDelivery(location);

    }
}
