package com.sessions.session10.incapsulation;

public class encapsulationpracticeme {
    public static void main(String[] args) {
        userprofile user = new userprofile();
        System.out.println(user.getFirstname());
        user.setFirstname("Alex");
        System.out.println(user.getFirstname());
    }
}
