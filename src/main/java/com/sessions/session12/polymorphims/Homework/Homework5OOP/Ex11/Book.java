package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex11;

public class Book {

    private String nameOfBook;
    private String author;

    public Book(String nameOfBook, String author){
        this.nameOfBook = nameOfBook;
        this.author = author;
    }
    public String getBookDetails(){
        return "Name: " + nameOfBook + "Author: " + author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }
}
