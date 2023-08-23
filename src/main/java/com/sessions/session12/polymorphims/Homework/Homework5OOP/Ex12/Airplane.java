package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex12;

import java.time.LocalDate;
import java.time.LocalTime;

public class Airplane {

    private String flightNum;
    private String destination;
    private LocalTime scheduledDeparture;
    private int delayTime;

    public Airplane(String flightNum, String destination, LocalTime scheduledDeparture){
        this.flightNum = flightNum;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.delayTime = 0;
    }
    public void delay(int minutes){
        this.delayTime = minutes;
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
    }
    public void checkStatus(){
        if(delayTime == 0){
            System.out.println("Flight " + flightNum + " is on time");
        }else {
            System.out.println("Flight " + flightNum + " is delayed by " + delayTime);
        }
    }
}
