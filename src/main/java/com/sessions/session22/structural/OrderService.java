package com.sessions.session22.structural;

public class OrderService {
    private final StockService stockService = new StockService();
    private final PaymentService paymentService = new PaymentService();
    private final DeliveryService deliveryService = new DeliveryService();

    public void placeOrder(String product, String location, int price){
        //StockService
        //  checkStock(product);
//        System.out.println("Checking stock...");
//        System.out.println("Stock ok :)");
        stockService.checkStock(product);

        // PaymentService
        // checkPayment(price);
//        System.out.println("Checking price...");
//        System.out.println("checking payment options...");
        paymentService.checkPayment(price);

        // DeliveryService
        // checkDelivery(location);
//        System.out.println("checking delivery options...");
//        System.out.println("adding delivery details...");
        deliveryService.checkDelivery(location);
    }
}
