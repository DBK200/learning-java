package com.sessions.session11.abstraction;

public class AbstractTestDv implements UserProfileDv{


    //public static final fields
    //abstract methods
    int x=2;
    public static final int y=3;
    public void getEmailAddress(){
        System.out.println("this is the email address");
    }

    public void getUserPhoneNumber(){
        System.out.println("this is the phone number");
    }

    public static void main(String[] args) {
//        Car car=new Car();
//        car.startEngine();
//        Vehicles.myMethod();

        AbstractTestDv abstractTestDv=new AbstractTestDv();

        System.out.println(abstractTestDv.getUserAddress());
    }
}
