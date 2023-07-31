package com.sessions.session8.HomeworkPackage;

public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title =title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public void details(){
        System.out.println("Here are the book details: \ntitle: " + title + "\nauthor: "
                + author + "\npublicationYear: " + publicationYear + "\ngenre: "+ genre);
    }

}
