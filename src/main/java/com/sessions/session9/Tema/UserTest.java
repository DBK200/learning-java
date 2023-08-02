package com.sessions.session9.Tema;

public class UserTest
{
    public static void main(String[] args) {
        UserRoxana user = new UserRoxana("Roxana", "Enache", "Female", 20, "Student", "Pizza", "Romanian");
        user.printUser();
        System.out.println("My favorite color is " +UserRoxana.printFavoriteColor());
        System.out.println("My favorite game is " +UserRoxana.printFavoriteGame());
    }
}
