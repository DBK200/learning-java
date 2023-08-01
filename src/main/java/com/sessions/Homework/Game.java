package com.sessions.Homework;

public class Game {
    private String genre;
    private float size;

    public Game(String genre, float size, int launchYear, boolean gameOfTheYearAward) {
        this.genre = genre;
        this.size = size;
        this.launchYear = launchYear;
        this.gameOfTheYearAward = gameOfTheYearAward;
    }
    public void isGameOfTheYear(){
        if (!gameOfTheYearAward) {
            System.out.println("It is not game of the year");
        } else System.out.println("It has a game of the year award.");
    }

    public void crash(){
        System.out.println("Game has crashed:(");
    }

    private int launchYear;
    private boolean gameOfTheYearAward;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public boolean isGameOfTheYearAward() {
        return gameOfTheYearAward;
    }

    public void setGameOfTheYearAward(boolean gameOfTheYearAward) {
        this.gameOfTheYearAward = gameOfTheYearAward;
    }
}
