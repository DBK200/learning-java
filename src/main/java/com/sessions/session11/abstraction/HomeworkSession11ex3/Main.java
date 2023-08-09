package com.sessions.session11.abstraction.HomeworkSession11ex3;

public class Main {

    public static void main(String[] args) {

        // Creating an object of class SubClass
        SubClass obj = new SubClass();

        // Calling the abstract method and the non-abstract method and compare the results
        obj.a_method();
        System.out.println();

        obj.b_method();
        // Pare ca se comporta la fel pentru ca si method abstracta a_method() a primit intre timp o implementare

    }
}
