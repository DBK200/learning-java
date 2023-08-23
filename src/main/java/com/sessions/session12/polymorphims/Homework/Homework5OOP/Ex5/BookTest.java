package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex5;

import java.util.ArrayList;

public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book("Fight Club", "Chuck Palahniuk", "9780203808009");
        Book book2 = new Book("The Stranger", "Albert Camus", "9786610151271");
        Book.add_Book(book1);
        Book.add_Book(book2);
        ArrayList<Book> bookCollection = Book.getBookCollection();
        for (Book book : bookCollection){
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getISBN());
        }
    }
}
