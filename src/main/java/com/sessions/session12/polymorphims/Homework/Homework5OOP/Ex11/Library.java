package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex11;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }


    public ArrayList<Book> getBooks(){
        return books;
    }




}
