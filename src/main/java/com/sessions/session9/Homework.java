package com.sessions.session9;

//Homework
//        1. Create a new class called User that has at least 5 instance properties (variables)
//        2. Create a no arg constructor
//        3. Create an all arg constructor
//        4. Add 2 new static variables
//        5. Add 2 new methods that makes use of the static variables
//        6. Add at least one method that uses local and instance variables (add some logic like printing to the console or manipulating the variables)

import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
    User myUser = new User(1, "Popescu", "pop@gmail.com", true);
    System.out.println("List Id: " + myUser.getListId());
    System.out.println("List Name: " + myUser.getListName());
    myUser.printUserData(LocalDate.now());
    }
}
