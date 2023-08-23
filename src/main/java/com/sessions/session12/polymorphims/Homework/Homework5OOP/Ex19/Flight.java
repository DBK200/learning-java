package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex19;

public class Flight {
    private int flightNum;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassengers;
    private double price;
    private int confirmationNum;

    public Flight(int flightNum, String passengerName, String origin, String destination,String date, int numPassengers, double price){
        this.flightNum = flightNum;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.price = price;
    }
    public int getFlightNum(){
        return flightNum;
    }
    public String getPassengerName(){
        return passengerName;
    }
    public String getOrigin(){
        return origin;
    }
    public String getDate(){
        return date;
    }
    public int getConfirmationNum(){
        return confirmationNum;
    }
    public void setConfirmationNum(int confirmationNum){
        this.confirmationNum = confirmationNum;
    }
}
