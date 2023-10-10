package com.sessions.patternsHomework.structural.facade;

import java.sql.Date;

public class Client {
    public static void main(String[] args) {

        TravelFacade travelFacade = new TravelFacade();
        travelFacade.getFlightsAndHotels(Date.valueOf("2023-12-10"), Date.valueOf("2024-1-5"));
    }
}
