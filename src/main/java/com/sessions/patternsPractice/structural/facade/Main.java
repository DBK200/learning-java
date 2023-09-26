package com.sessions.patternsPractice.structural.facade;

class DriverHistory {
    public void checkDriverHistory() {
        System.out.println("Checking driver history");
    }
}

class CarStock {
    public void checkAvailableCars() {
        System.out.println("Checking available cars");
    }
}

class CarBooking {
    public void bookCarForCustomer() {
        System.out.println("Booking a car for a customer...");
    }
}

// Facade class
class CarRentalFacade {
    private DriverHistory driverHistory;
    private CarStock carStock;
    private CarBooking carBooking;

    public CarRentalFacade() {
        driverHistory = new DriverHistory();
        carStock = new CarStock();
        carBooking = new CarBooking();
    }

    public void rentCar() {
        driverHistory.checkDriverHistory();
        carStock.checkAvailableCars();
        carBooking.bookCarForCustomer();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        CarRentalFacade carRentalFacade = new CarRentalFacade();
        carRentalFacade.rentCar();
    }
}
