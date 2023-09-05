package com.sessions.practice.phone;

public class Main {

    public static void main(String[] args) {

        DeskPhone deskPhone = new DeskPhone("123456");
        deskPhone.powerOn();
        deskPhone.callPhone("123456");
        deskPhone.answer();

        MobilePhone mobilePhone = new MobilePhone("12345");
        mobilePhone.powerOn();
        mobilePhone.callPhone("12345");
        mobilePhone.answer();
    }
}
