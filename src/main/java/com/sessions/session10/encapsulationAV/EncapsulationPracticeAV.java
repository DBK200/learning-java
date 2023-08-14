package com.sessions.session10.encapsulationAV;

public class EncapsulationPracticeAV {

    public static void main(String[] args) {
        UserProfileAV user = new UserProfileAV();
        System.out.println(user.getFirstName());
        user.setFirstName("Alex");
        System.out.println(user.getFirstName());
        
    }
}
