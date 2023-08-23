package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex17;

import java.util.ArrayList;

public class Movie {

    private String title;
    private String director;
    private String actor;
    private ArrayList<String> reviews;

    public Movie(String title, String director, String actor){
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.reviews = new ArrayList<>();
    }
    public void addReview(String review){
        reviews.add(review);
    }
    public void printReviews(){
        for (String review : reviews){
            System.out.println("- " + review);
        }
    }
}
