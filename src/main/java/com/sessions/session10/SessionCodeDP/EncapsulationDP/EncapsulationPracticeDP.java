package com.sessions.session10.SessionCodeDP.EncapsulationDP;

public class EncapsulationPracticeDP {
    public static void main(String[] args) {
        UserProfileDP user=new UserProfileDP();
        System.out.println(user.getFirstName());
        user.setFirstName("Delia");
        System.out.println(user.getFirstName());
    }
}
