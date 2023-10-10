package com.sessions.patternsHomework.structural.facade;

import java.util.ArrayList;
import java.util.Date;

public class TravelFacade {
    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public void getFlightsAndHotels (Date from, Date to) {
        flightBooker = new FlightBooker();
        ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);
        hotelBooker = new HotelBooker();
        ArrayList<Hotel> hotels = hotelBooker.getHotelNamesFor(from, to);
        System.out.println("printing the results... ");
    }
}
