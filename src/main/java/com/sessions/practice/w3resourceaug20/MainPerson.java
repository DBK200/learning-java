package com.sessions.practice.w3resourceaug20;

import java.util.ArrayList;

public class MainPerson {

    public static void main(String[] args) {


    // Create two instances of Person class
    Person person1 = new Person("Alina", 23);
    Person person2 = new Person("George", 33);

//        System.out.println("Information about person 1: ");
//        System.out.println("Name: " + person1.getName());
//        System.out.println("Age: " + person1.getAge() + " years old");
//        System.out.println();
//        System.out.println("Information about person 2: ");
//        System.out.println("Name: " + person2.getName());
//        System.out.println("Age: " + person2.getAge() + " years old");

        // Create two instances of Dog class
        Dog dog1 = new Dog("Hera", "german shepperd");
        Dog dog2 = new Dog("Bruno", "huski");

        // Modify the attributes using getters and setters
//        System.out.println("Information about dog 1: ");
//        dog1.setName("Cora");
//        System.out.println("New name: " + dog1.getName());
//        dog1.setBreed("Corgi");
//        System.out.println("New breed: " + dog1.getBreed());
//        System.out.println();
//
//        System.out.println("Information about dog 2: ");
//        dog2.setName("Boris");
//        System.out.println("New name: " + dog2.getName());
//        dog2.setBreed("Alaskan Malamute");
//        System.out.println("New breed: " + dog2.getBreed());

        // Calculate the area and perimeter of the rectangle
        Rectangle rectangle = new Rectangle();
//        double rectangleArea = rectangle.calculateRectangleArea(2.35, 3.54);
//        double rectanglePerimeter = rectangle.calculateRectanglePerimeter(2.35, 3.54);
//        System.out.println("The area of a rectangle with 2.35 width and 3.54 height is " + rectangleArea + " and the perimeter is " + rectanglePerimeter);

        // Calculate the area and circumference of a circle
        Circle circle = new Circle();
//        double circleArea = circle.calculateCircleArea(5.32);
//        double circleCircumference = circle.calculateCircleCircumference(5.32);
//        System.out.println("The area of a circle with radius 5.32 is: " + circleArea + " and the circumference or perimeter is: " + circleCircumference);

        // Create objects of Book class
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 45635);
        Book book2 = new Book("Ion", "Liviu Rebreanu", 58054);
        Book book3 = new Book("Padurea Spanzuratilor", "Liviu Rebreanu", 48204);
        Book book4 = new Book("Baltagu", "Mihail Sadoveanu", 39278);

        // Create a library of books
        ArrayList<Book> libraryOfBooks = new ArrayList<>();
        // Add elements to the library
       // book1.addElement(libraryOfBooks, book1);
        //book1.showElements();

        //book2.addElement(libraryOfBooks, book2);
        //book2.showElements();

       // book3.addElement(libraryOfBooks, book3);
        //book3.showElements();

        //book4.addElement(libraryOfBooks, book4);
        //book4.showElements();

        // Remove elements from library
//        book1.removeElement(libraryOfBooks, book1);
//        book1.showElements(libraryOfBooks);
//        book2.removeElement(libraryOfBooks, book2);
//        book2.showElements(libraryOfBooks);

        // Create object of Employee class
        Employee employee1 = new Employee("John Doe", "java developer", 15000);
        //employee1.printEmployeeDetails();
        //System.out.println(employee1.getSalary());

        //employee1.salaryRaise(30);
        //employee1.salaryRaise(11);
        //System.out.println(employee1.getSalary());
       // employee1.printEmployeeDetails();

        // Create object of Bank class
        ArrayList<Account> listOfAccounts = new ArrayList<>();
        Bank bank = new Bank();

        // Create objects of Account class
        Account account1 = new Account("Alin Popa", 304832, 456.29);
        Account account2 = new Account("George Popa", 547392, 324.99);
        Account account3 = new Account("Mihai Popescu", 569874, 326.55);

        // Add accounts to the list of accounts
       // bank.addAccount(account1, listOfAccounts);
       // bank.printAccountList(listOfAccounts);
       // bank.addAccount(account2, listOfAccounts);
       // bank.addAccount(account3, listOfAccounts);
        //bank.printAccountList(listOfAccounts);

        // Remove accounts from the list of accounts
       // bank.removeAccount(account3, listOfAccounts);
       // bank.removeAccount(account2, listOfAccounts);
       // bank.removeAccount(account1, listOfAccounts);
       // bank.printAccountList(listOfAccounts);


        // Create object of TrafficLight class
        TrafficLight trafficLight = new TrafficLight("green", 40);
//        System.out.println(trafficLight.getColor());
//        System.out.println(trafficLight.getDuration());
//        trafficLight.setDuration(50);
//        System.out.println(trafficLight.getDuration());
//        System.out.println(trafficLight.checkIfColorIsRed(trafficLight.getColor()));



    }


}
