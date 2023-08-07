package com.sessions.session10.Encapsulation;

public class EncapsulationPractice {

    public static void main(String[] args) {

        UserProfile user = new UserProfile();
        user.setId(12);
        System.out.println(user.getId());
        System.out.println(user.getFirstName());
        user.setFirstName("Alex");
        System.out.println(user.getFirstName());
    }

}
