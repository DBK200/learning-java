package com.sessions.session23.structural;


public class OrderService {
    private final StockService stockService = new StockService();
    private final PaymentService paymentService = new PaymentService();
    private final DeliveryService deliveryService = new DeliveryService();
    public void placeOrder(String product, String location, int price){
       stockService.checkStock(product);
//       customerHistoryService.checkCustomerDiscount();
       paymentService.checkPayment(price);
       deliveryService.checkDelivery(location);


        //StockService
//        checkStock(product);


//        System.out.println("Checking stock...");
//        System.out.println("Stock ok :)");
//
//        //PaymentService
//        //        checkPayment(price);
//        System.out.println("Checking price...");
//        System.out.println("Checking payment options...");
//
//        //DeliveryService
//        //        checkDelivery(location);
//        System.out.println("Checking delivery options");
//        System.out.println("adding delivery details");

    }
}
