package com.sessions.patternsHomework.structural.facade;

import java.util.ArrayList;
import java.util.Date;

public class HotelBooker {
    public ArrayList<Hotel> getHotelNamesFor(Date from, Date to) {
        Hotel hotel1 = new Hotel();
        ArrayList<Hotel> hotelArrayList = new ArrayList<>();
        hotelArrayList.add(hotel1);
        System.out.println("searching and returning hotels...");
        return hotelArrayList;
    }
}
