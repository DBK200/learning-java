package com.sessions.session8.HomeworkPackage;

public class ClassHomework {
    public static void main(String[] args) {

        Book book1 = new Book("Fight Club", "Chuck Palahniuk", 1996, "Novel");
        Book book2 = new Book("Crime and Punishment", " Fyodor Dostoevsky", 1866, " Philosophical fiction");
        book1.details();
        book2.details();
        book2.setTitle("The Stranger");
        book2.setAuthor("Albert Camus");
        book2.setPublicationYear(1942);
        book2.setGenre("Absurdist fiction");
        book2.details();

        System.out.println();

        BankAccount bankAccount = new BankAccount(1233.45,5389.32, "Pop Ionescu");
        System.out.println(bankAccount.getRonBalance());
        System.out.println(bankAccount.getEurBalance());
        System.out.println(bankAccount.getAccountHolderName());
        System.out.println(bankAccount.convertEurBalanceToRon());
        System.out.println(bankAccount.convertRonBalanceToEur());

        System.out.println();

        Phone phone = new Phone();
        phone.setBrand("Samsung");
        phone.setColor("Blue");
        phone.setPrice(1000);
        System.out.println(phone.getBrand());
        System.out.println(phone.getColor());
        System.out.println(phone.getPrice());
        phone.powerOn();
        phone.ring();
        phone.openCamera();
        phone.powerOff();

        System.out.println();

        Animal animal = new Animal("Rex", "Dog", "brown", 3);
        Cat cat = new Cat("Milo", "cat", "orange", 5);
        animal.run();
        animal.eat();
        animal.makeSound();
        animal.sleep();
        cat.makeSound();
        cat.run();
        cat.sleep();
        cat.scratchFurniture();
        System.out.println("Name: " + cat.getName());
        System.out.println("Type: " + cat.getType());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Color: " + cat.getColor());
    }
}
