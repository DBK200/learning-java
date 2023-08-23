package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex19;

import com.sessions.session11.abstraction.defaultMethod.A;

import java.util.ArrayList;
import java.util.Random;

public class TravelApp {

    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    public TravelApp(){
        this.flights = new ArrayList<>();
        this.hotels = new ArrayList<>();
    }
    public void setFlights(String origin, String destination, String date, int numPassengers){
        System.out.println(origin + " " + destination + " " + date + " " + numPassengers);
    }
    public void searchHotels(String location, String checkIn, String checkOut, int numGuest){
        System.out.println(location + " " + checkIn + " " +checkOut + " " + numGuest);
    }
    public void bookFlight(int flightNum, String passengerName, String origin, String destination, String date, int numPasengers, double price){
        Flight flight = new Flight(flightNum, passengerName, origin, destination, date, numPasengers, price);
        int confirmationNum = generateConfirmationNum();
        flight.setConfirmationNum(confirmationNum);
        this.flights.add(flight);
        System.out.println(confirmationNum);
    }
    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
        Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
        int confirmationNum= generateConfirmationNum();
        this.hotels.add(hotel);
        System.out.println(confirmationNum);
    }
    public void cancelReservation(int confirmationNum){
        for (Flight flight : this.flights){
            if(flight.getConfirmationNum() == confirmationNum){
                this.flights.remove(flight);
                System.out.println(confirmationNum);
                return;
            }
        }
        System.out.println("No reservation found with confirmation number " + confirmationNum + ".");
    }
    private int generateConfirmationNum(){
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }
}
