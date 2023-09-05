package com.sessions.practice.bike;

public class Main {

    public static void main(String[] args) {
        // Create object of Bicycle class
        Bicycle bicycle = new Bicycle(2, 5);

        // Call the method toString() of the Bicycle class
        System.out.println(bicycle.toString());

        // Create object of MountainBike class
        MountainBike mountainBike = new MountainBike(2, 4, 2);

        // Call the method toString() of the MountainBike class
        System.out.println( mountainBike.toString());
    }
}
