package com.sessions.session17;

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
        Book book = new Book("Leaders eat last"){   //in clasa anonima se poate da alta implementare
                                                        // metodelor din clasa initiala
            public String getTitle(){
                return "I can not find the title";
            }
        };

        // Anonymous class
//        Printer printer = new Printer(){  // clasa anonima
//            @Override
//            public void printStuff(){
//                System.out.println("Printing stuff");
//            }
//        };

        Printer printer = stuff -> stuff + " printed in the console..."; // declaram ce ar trebui sa faca metoda din Printer
        System.out.println(printer.printStuff("ceva de printat"));

      //  printer.printStuff();
    }
}
