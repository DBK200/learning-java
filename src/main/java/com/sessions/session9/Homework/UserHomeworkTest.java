package com.sessions.session9.Homework;

public class UserHomeworkTest {
    public static void main(String[] args) {



        UserHomework userHomework1 = new UserHomework("Ion", "ion123",
                "ion97!", 7863, 23, "Romania", 1000.0);

        UserHomework userHomework2 = new UserHomework();
        userHomework2.setName("Matei");
        userHomework2.setUsername("Matei39");
        userHomework2.setPassword("matei90");
        userHomework2.setID(3332);
        userHomework2.setAge(19);
        userHomework2.setCountry("Ungaria");

        UserHomework userHomework3 = new UserHomework();

        System.out.println(userHomework1.printAllDetails());
        System.out.println(userHomework2.printAllDetails());
        System.out.println(userHomework3.printAllDetails());
        System.out.println();

        userHomework1.setPassword("newPassword");
        System.out.println(userHomework1.getPassword());

        userHomework1.deposit(200.5);
        System.out.println(userHomework1.getBalance());
        System.out.println(userHomework3.getDefaultBalance());

        System.out.println();
        System.out.println("Total users created: " + UserHomework.getTotalAccessing());
        System.out.println("The default balance is: " + UserHomework.getDefaultBalance());




    }
}
