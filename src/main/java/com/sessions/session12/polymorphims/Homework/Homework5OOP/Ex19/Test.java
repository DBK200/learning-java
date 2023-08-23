package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex19;

public class Test {
    public static void main(String[] args) {

        TravelApp travelApp = new TravelApp();
        travelApp.setFlights("Amsterdam", "Madrid", "2023-08-02", 2);
        travelApp.searchHotels("Madrid", "2023-08-02", "2023-09-01", 2);
        travelApp.bookFlight(122223, "Mike", "Amsterdam", "Madrid","2023-08-02", 2, 599.99);
        travelApp.bookHotel(56566565, "Mike", "Madrid", "2023-09-01", "2022-09-05", 2, 200.00);
    }
}
