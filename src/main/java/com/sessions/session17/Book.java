package com.sessions.session17;

import java.sql.SQLOutput;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class AnonymousClass {
    public static void main(String[] args) {
        Book book = new Book("Leaders eat last"){
            public String getTitle(){
                return "I can not find the title";
            }
        };

        //Anonymous class
//        Printer printer=new Printer() {
//            @Override
//            public void printStuff() {
//                System.out.println("Printing stuff!!....");
//            }
//        };

        Printer printer = stuff -> stuff + " printed in the console....";
        System.out.println(printer.printStuff("ceva de printat "));

//        printer.printStuff();
    }

}