package com.sessions.patternsHomework.structural.facade;

import java.util.ArrayList;
import java.util.Date;

public class FlightBooker {
    public ArrayList<Flight> getFlightsFor(Date from, Date to) {
        Flight flight1 = new Flight();
        ArrayList<Flight> flightArrayList = new ArrayList<>();
        flightArrayList.add(flight1);
        System.out.println("searching and returning flights...");
        return flightArrayList;
    }
}
