package com.sessions.practice.bike;

public class MountainBike extends Bicycle{
    // Attributes
    private int seatHeight;

    // All args constructor
    public MountainBike(int gear, int speed, int startHeight){

        // invoke the constructor of the superclass (Bicycle)
        super(gear, speed);
        seatHeight = startHeight;
    }

    // Getters and setters

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    // override toString() method of Bicycle class to print more information
    @Override
    public String toString(){
        return (super.toString() + " \nSeat height is " + seatHeight);
    }
}
