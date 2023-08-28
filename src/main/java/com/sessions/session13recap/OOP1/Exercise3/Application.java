package com.sessions.session13recap.OOP1.Exercise3;

public class Application {
    public static void main(String[] args) {

        Car car = new Car("Dacia", "Logan", 2023, "red");
        car.startCar();
        car.accelerateCar();
        car.brakeCar();
        car.stopCar();
    }
}
