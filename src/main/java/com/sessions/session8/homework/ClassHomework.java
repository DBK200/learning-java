package com.sessions.session8.homework;

public class ClassHomework {
    public static void main(String[] args) {

        Chair myChair = new Chair("orange", 500);
        Clock myClock = new Clock("digital", "Phillips", 150);
        Table myTable = new Table(90, "wood");
        Dessert myDessert = new Dessert("tiramisu", 20);
        System.out.println("In my house I have a " + myTable.getMaterial() +
                " table and a " + myClock.getType() + " " + myClock.getBrand() + " clock.");
    }
}
