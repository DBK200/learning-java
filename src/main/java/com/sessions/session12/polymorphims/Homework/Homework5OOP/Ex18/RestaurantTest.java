package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex18;

public class RestaurantTest {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.addItem("Hamburger", 4.99);
        restaurant.addItem("Pizza", 15.99);
        restaurant.addItem("Stake", 19.99);

        restaurant.displayMenu();

        restaurant.addRating("Pizza", 5);
        restaurant.addRating("Pizza", 4);
        restaurant.addRating("Stake", 5);
        restaurant.addRating("Hamburger", 2);
        restaurant.addRating("Hamburger", 3);

        System.out.println(restaurant.getAverageRating("Hamburger"));
        System.out.println(restaurant.getAverageRating("Pizza"));

        restaurant.removeItem("Hamburger");
        restaurant.displayMenu();
    }
}
