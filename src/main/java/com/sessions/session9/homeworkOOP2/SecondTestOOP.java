package com.sessions.session9.homeworkOOP2;

import java.time.LocalDate;

public class SecondTestOOP
{
    public static void main(String[] args)
    {
        User user1 = new User();

        System.out.println("You'll see a user made with no args constructor bellow\n");
        System.out.println(user1);
        System.out.println("Number of users is: " + User.getNumberOfUsers());

        User user2 = new User(22, "Razvan", LocalDate.of(2001, 6, 1), Nationality.Romanian, true);

        System.out.println("You'll see a user made with all args constructor bellow\n");
        System.out.println(user2);

        user1.setNationality(Nationality.Indian);
        user1.setAge(32);
        user1.setHasJob(true);
        user1.setName("Sreraj");

        System.out.println("\nWe modified user 1 properties and we'll see the new user bellow\n");
        System.out.println(user1);
        System.out.println("Number of users is: " + User.getNumberOfUsers());

        User user3 = new User(17, "Mariela", LocalDate.of(2005, 12, 14), Nationality.Bulgarian, false);
        System.out.println("\nYou'll see another user made with all args constructor bellow\n");
        System.out.println(user3);
        System.out.println("Number of users is: " + User.getNumberOfUsers());

        User user4 = new User(18, "Carlos", LocalDate.of(2006, 4, 23), Nationality.Spanish, true);
        System.out.println("\nYou'll see another user made with all args constructor bellow\n");
        System.out.println(user4);
    }
}