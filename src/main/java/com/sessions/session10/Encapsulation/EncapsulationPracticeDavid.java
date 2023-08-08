package com.sessions.session10.Encapsulation;

public class EncapsulationPracticeDavid {
    public static void main(String[] args) {
        UserProfileDavid user=new UserProfileDavid();
        System.out.println(user.getFirstName());
        user.setFirstName("Alex");
        System.out.println(user.getFirstName());
    }
}
