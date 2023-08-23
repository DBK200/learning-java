package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex8;

public class TrafficLightTest {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("Green", 20);

        System.out.println(light.isGreen());
        System.out.println(light.getDuration());

        light.changeColor("Yellow");
        System.out.println(light.isYellow());

    }
}
