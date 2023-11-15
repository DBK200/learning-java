package com.sessions.session26.recap;

public class Problem14 {

    public static void main(String[] args) {
    Car car=new Car();
        System.out.println(car.type);
    }
}
class Vehicle {
    String type;
    Vehicle() {
        this("Car");
    }
    Vehicle(String type) {
        this.type = type;
    }
}
class Car extends Vehicle {
    Car() {
        super("Sports Car");
    }
}
/*
If an instance of Car is created, what will be the value of type?
a) "Car"
b) "Sports Car" x
c) null
d) "Vehicle"
 */