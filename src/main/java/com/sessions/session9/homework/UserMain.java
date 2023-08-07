package com.sessions.session9.homework;

public class UserMain {

    public static void main(String[] args){

        User user = new User();
        System.out.println("User 1 initial username: " + user.getUsername());
        System.out.println("User 1 initial password: " + user.getPassword());

        user.setUsername("Coco123");
        System.out.println("User 1 new username: " + user.getUsername());
        user.generateNewRandomPassword();
        System.out.println("User 1 new password: " + user.getPassword());

        User user2 = new User("Monkey2","ParolaDA",32);
        System.out.println("User 2 username: " + user2.getUsername());
        System.out.println("User 2 password: " + user2.getPassword());
        System.out.println("User 2 saved data memory size: " + user2.getSavedDataSizeGB() + "GB");

        User user3 = new User("User3","User3Password");
        System.out.println("User 3 username: " + user3.getUsername());
        System.out.println("User 3 password: " + user3.getPassword());
        System.out.println("User 3 saved data memory size: " + user3.getSavedDataSizeGB() + "GB");
        user3.setSavedDataSizeGB(8);
        user3.printSavedDataSize();

    }
}
