package com.sessions.session13recap.oop;

public class Main {
    public static void main(String[] args) {

        // Create object of class BankAccount
        BankAccount account1 = new BankAccount(33889944, "basic", 557.63, 5.3);
//        account1.deposit(33.15);
//        account1.deposit(-99);
//        account1.withdraw(-99);
//        account1.withdraw(55.17);
//        account1.calculateInterestRate();
//        account1.printAccountDetails();

        // Create object of Shape class
        Shape shape1 = new Shape("rectangle",8, 10);
       int perimeter = shape1.calculatePerimeter(8,10);
       int area = shape1.calculateArea(8,10);
        System.out.println("Perimeter of shape: " + shape1.getName() + " " +  perimeter);
        System.out.println("Area of shape: " + shape1.getName() + " " +  area);
    }
}
