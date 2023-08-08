package com.sessions.session10.Encapsulation;

public class EncapsulationPracticeM {
    public static void main(String[] args){
        UserProfileM user = new UserProfileM();
        System.out.println(user.getFirstName());
        user.setFirstName("Alex");
        System.out.println(user.getFirstName());
    }
}
