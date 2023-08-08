package com.sessions.session10.encpasulation;

public class EncapsulationPractice {

    public static void main(String[] args) {
        UserProfile user = new UserProfile();
        System.out.println(user.getFirstName());
        user.setFirstName("Alex");
        System.out.println(user.getFirstName());
    }
}
