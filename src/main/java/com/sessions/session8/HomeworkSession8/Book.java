package com.sessions.session8.HomeworkSession8;

public class Book {
    private String title;
    private String authorName;
    private int yearOfPublication;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String authorName, int yearOfPublication, boolean isAvailable){
        this.title = title;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthorName(){
        return authorName;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("You borrowed the book " + getTitle() + " by " + getAuthorName() +
                    "\nYou have 14 days to return it");
        } else{
            System.out.println("Sorry, the book is already borrowed by someone else");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println("You returned the book " + getTitle() + " by " + getAuthorName());
        } else{
            System.out.println("The book was not borrowed");
        }
    }
}
