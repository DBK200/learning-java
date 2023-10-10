package com.sessions.session21.creational.structural;

public class OrderService {
    private final StockService stockService = new StockService();
    private final PaymentService paymentService = new PaymentService();
    private final DeliveryService deliveryService = new DeliveryService();

    public void placeOrder(String product, String location, int price){

        stockService.checkStock(product);
        paymentService.checkPayment(price);
        deliveryService.checkDelivery(location);
    }
}
