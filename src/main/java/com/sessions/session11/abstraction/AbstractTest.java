package com.sessions.session11.abstraction;

public class AbstractTest implements UserProfiel{

    @Override
    public void getEmailAdress(){
        System.out.println("Email Adress");
    }

    @Override
    public void getUserPhoneNumber() {
        System.out.println("Phone number");
    }

    @Override
    public String getUserAdress(){
        return "this is from current class";
    }

    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        car.calculateSomething();
        Vehicle.myMethod();
        Car.myMethod();

        AbstractTest test = new AbstractTest();
        test.getEmailAdress();
        test.getUserPhoneNumber();

        System.out.println(test.getUserAdress());
    }
}
