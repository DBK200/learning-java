package com.sessions.session12.Exercises.OOP.Exercise5;

import com.sessions.session11.defaultmethod.B;

import java.util.ArrayList;

public class Book {

    private String title;
    private String autor;
    private String ISBN;
    private static ArrayList<Book> bookCollcection=new ArrayList<>();

    private Book(String title,String autor,String ISBM){
        this.title=title;
        this.autor=autor;
        this.ISBN=ISBM;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public static void addBook(Book book){
        bookCollcection.add(book);
    }
    public static void removeBook(Book book){
        bookCollcection.remove(book);
    }

    public static ArrayList<Book> getBookCollcection(){
        return bookCollcection;8
    }

}
