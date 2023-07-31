package com.sessions.HomeworkSession8;

public class ClassHomework {

    public static void main(String[] args) {

        // Object of Car class
//        Car car1 = new Car("Wolkswagen", "Golf VII", 2018, "blue", 70, true);
//        car1.turnOff();
//        car1.turnOn();
//        car1.accelerate(30);
//        car1.decelerate(20);
//        System.out.println("The current speed of the car is: " + car1.getCurrentSpeed() + " km/h");
//        System.out.println("The color of the car is: " + car1.getColor());
//        System.out.println("Car make is: " + car1.getMake());
//        System.out.println("Car model is: " + car1.getModel());
//        System.out.println("Car year is: " + car1.getYear());
//
//        // Object of Student class
//        Student student1 = new Student("Will", "Smith", 47621);
//        student1.setCourse1Grade(7.8);
//        student1.setCourse2Grade(8.3);
//        student1.setCourse3Grade(9.5);
//        student1.setCourse4Grade(6.2);
//        student1.setCourse5Grade(8.4);
//
//        System.out.println(student1.calculateMedia());
//        System.out.println();

        // Object of Animal class
//        Animal dog = new Animal("Dog", 0, 4);
//        dog.checkIfBird();
//        dog.eat();
//        dog.displayInfo();

//        Animal bird = new Animal("Bird", 2, 0);
//        bird.checkIfBird();
//        bird.eat();
//        bird.displayInfo();

        // Object of Book class
//        Book book1 = new Book("Ion", "Liviu Rebreanu",1920, true);
//        System.out.println("Title: " + book1.getTitle());
//        System.out.println("Author name: " + book1.getAuthorName());
//        System.out.println("Year of publication: " + book1.getYearOfPublication());
//
//        book1.borrowBook();
//        book1.returnBook();

        // Object of BankAccount class
        BankAccount account1 = new BankAccount("ZVING47548", "Alexandru Popescu", 750);
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Account holder: " + account1.getAccountHolder());
        System.out.println("Balance: " + account1.getBalance());

        account1.deposit(350);
        account1.deposit(-333);
        account1.withdraw(343);
        account1.withdraw(1000);
        System.out.println("Balance now: " + account1.getBalance());
    }
}
