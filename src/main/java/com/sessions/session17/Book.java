package com.sessions.session17;

import com.sessions.session16.Product;

public class Book {

    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}

class AnonymousClass{
    public static void main(String[] args) {

        Book book = new Book("Leaders eat last") {
            public String getTitle() {
                return "I cannot find the title";
            }
        };
//        //Anonymous class
//        Printer printer = new Printer() {
//            @Override
//            public void printStuff() {
//                System.out.println("print some stuff");
//            }
//        };
//        printer.printStuff();


       Printer printer = stuff -> stuff + "printed in the console...";
        System.out.println(printer.printStuff("ceva de printat "));


        }
        }