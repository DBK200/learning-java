package com.sessions.Homework;

public class Ebook {
    private String genre;
    private int numberOfPages;
    private String title;
    private int numberOfChapters;
    public void isLongBook(){
        if(numberOfPages>300) {
            System.out.println(title + " is a long book...");
        } else System.out.println(title + " is a short read.");
    }

    public Ebook(String genre, int numberOfPages, String title, int numberOfChapters) {
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.numberOfChapters = numberOfChapters;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(int numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }


}
