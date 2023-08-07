package com.sessions.session9.Homework;

import java.time.LocalDate;

public class UserTestDP {

    public static void main(String[] args) {
        User.getAccountCreationInformationBeforeAccountCreation();
        User user=new User();
        System.out.println("Is account active? "+ user.getIsActive());
        user.verifyAndActivate();
     //   user.getAccountCreationInformation();
        user.setFirstName("Alexandra");
        user.setLastName("Totta");

        user.setEmail("someemail@gmail.com");
       // user.getAccountCreationInformation();
//        user.setBirthday(LocalDate.of(2015,5,5));
        user.setBirthday(LocalDate.of(1994,5,5));
      //  user.getAccountCreationInformation();
        user.setPassword("23c3rnkm3");
        user.getAccountCreationInformation();

        user.verifyAndActivate();

        System.out.println("Is account active? "+ user.getIsActive());
        System.out.println(User.REQUIRED_AGE);


    }
}
