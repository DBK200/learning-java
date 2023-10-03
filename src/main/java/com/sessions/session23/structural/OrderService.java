package com.sessions.session23.structural;

public class OrderService { //has a
    private final StockService stockService = new StockService();
    private final PaymentService paymentService = new PaymentService();
    private final DeliveryService deliveryService = new DeliveryService();

//    OrderService(StockService stockService, PaymentService paymentService,
//                 DeliveryService deliveryService){
//        this.stockService= stockService;
//        this.paymentService= paymentService;
//        this.deliveryService= deliveryService;
//    }
    public void placeOrder(String product, String location, int price) {
        stockService.checkStock(product);

//        customerHistoryService.checkCustomerDiscount..
        paymentService.checkPayment(price);
        //verify customer history,...
        deliveryService.checkDelivery(location);
    }

}
