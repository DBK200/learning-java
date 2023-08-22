package com.sessions.practice.w3resourceaug20;

import java.util.ArrayList;

public class Book {

    // Attributes/ properties
    private String title;
    private String author;
    private int ISBN;

    private ArrayList<Book> library = new ArrayList<>();

    // Parameterized constructor
    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter and setters
    // Getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getISBN(){
        return ISBN;
    }

    public ArrayList<Book> getLibrary(){
        return library;
    }

    // Setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setLibrary(ArrayList<Book> library){
        this.library = library;
    }

    // Method to show the elements of library
    public void showElements(ArrayList<Book> library){
        System.out.println("The elements of the library:");
        //for(int i=0; i<library.size(); i++)
        for(Book book : library) {
            System.out.println("The title is "  + book.getTitle() + ", the author is " + book.getAuthor() + " and the ISBN is " + book.getISBN() + " ");
        }
    }

    // Method to add books (Book objects) to the library (=an ArrayList of Book objects ArrayList<Book>)
    public void addElement(ArrayList<Book> library, Book book){
        library.add(book);
        System.out.println("You added '" + book.getTitle() + "' book by author " + book.getAuthor() + " to the library");
    }

    public void removeElement(ArrayList<Book> library, Book book){
        library.remove(book);
        System.out.println("You removed '" + book.getTitle() + "' book by author " + book.getAuthor() + " from the library");
    }
}
