package com.sessions.session23.structural;

public class OrderService {

    private final StockService stockService=new StockService();
    private final PaymentService paymentService=new PaymentService();
    private  final DeliveryService deliveryService=new DeliveryService();

    public void placeOrder(String product,String location,int price){


        stockService.checkStock(product);
        paymentService.checkPrice(price);
        deliveryService.checkDelivery(location);


    }
}
