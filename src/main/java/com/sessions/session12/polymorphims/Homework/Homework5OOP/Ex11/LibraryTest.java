package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex11;

import com.sessions.session11.abstraction.defaultMethod.B;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("White Noise", "Don DeLillo");
        Book book2 = new Book("Confession", "Lev Tolstoi");
        library.addBook(book1);
        library.addBook(book2);


        for (Book book : library.getBooks()){
            System.out.println(book.getNameOfBook() + " " + book.getAuthor());
        }
    }

}

