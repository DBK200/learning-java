package com.sessions.session11.abstraction;

public class AbstractTest implements UserProfile {

    public void getEmailAddress() {
        System.out.println("this is the email address");
    }

    public void getUserPhoneNumber() {
        System.out.println("this is the phone number");
    }

    public String getUserAddress(){
        return "this is from current class";
    }

    public static void main(String[] args) {
//        Vehicle car = new Car();
//        car.startEngine();
//        Vehicle.myMethod();

        AbstractTest abstractTest = new AbstractTest();
        System.out.println(abstractTest.getUserAddress());
    }
}
