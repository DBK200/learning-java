package com.sessions.session17;
public class BookAV {
    private String title;
    public BookAV(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}

class AnonymousClass {
    public static void main(String[] args) {

        BookAV book = new BookAV("Leaders eat last") {
            public String getTitle() {
                return "I cannot find the title";
            }
        };

//        System.out.println(book.getTitle());
//        BookAV newBook = new BookAV("title");
//        System.out.println(newBook.getTitle());

        //Anonymous class
//        PrinterAV printer = new PrinterAV() {
//            @Override
//            public void printStuff() {
//                System.out.println("Printing stuff");
//            }
//        };
//        printer.printStuff();

        //input -> logica + return type (output)
        PrinterAV printer = stuff -> stuff + " printed in the console...";
        System.out.println(printer.printStuff("stuff"));


    }
}
