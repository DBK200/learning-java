package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex12;

import java.time.LocalDate;
import java.time.LocalTime;

public class AirplaneTest {

    public static void main(String[] args) {


        Airplane flight1 = new Airplane("UIT123", "Athens", LocalTime.now());
        Airplane flight2 = new Airplane("UIT222", "Bucharest", LocalTime.of(10, 34));

        flight1.checkStatus();
        flight2.checkStatus();
        flight1.delay(30);
        flight1.checkStatus();
    }
}
