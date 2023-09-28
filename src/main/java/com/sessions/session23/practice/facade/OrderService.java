package com.sessions.session23.practice.facade;

/**
 * <h1>OrderService class</h1>
 */
public class OrderService {
    private final StockService stockService = new StockService();
    private final PaymentService paymentService = new PaymentService();
    private final DeliveryService deliveryService = new DeliveryService();

    public void placeOrder(String product, int price, String location) {

        // Stock checking: checkStock(product)
        stockService.checkStock(product);

        // Added later
        // LoyaltyService: checkLoyalty(name)
        // loyaltyService.checkLoyalty(name)

        // Payment checking: checkPayment(price)
        paymentService.checkPayment(price);

        // Delivery checking: checkDelivery(location)
        deliveryService.checkDelivery(location);
    }
}

/**
 * <h1>PaymentService class</h1>
 */
class StockService {
    public void checkStock(String product) {
        System.out.printf("Checking [%s] stock...%n", product);
        System.out.println("... added at a later");
        System.out.println("Stock OK");
    }
}

/**
 * <h1>PaymentService class</h1>
 */
class PaymentService {
    public void checkPayment(int price) {
        System.out.println("Checking price... " + price);
        System.out.println("Checking payment options...");
    }
}

/**
 * <h1>DeliveryService class</h1>
 */
class DeliveryService {
    public void checkDelivery(String location) {
        System.out.println("Checking delivery options...");
        System.out.println("Adding delivery details... " + location);
    }
}


/**
 * <h1>Testing class</h1>
 */
class DemoFacade {
    public static void main(String[] args) {
        OrderService order1 = new OrderService();
        order1.placeOrder("Pizza", 123, "Moon");
    }
}