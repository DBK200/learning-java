package com.sessions.Homework;

public class Music {
    private String name;
    private String genre;
    private int duration;
    private int bpm;
    private boolean top100;

    public void playSong() {
        System.out.println(name + " starts playing");
    }

    public Music(String name, String genre, int duration, int bpm, boolean top100) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.bpm = bpm;
        this.top100 = top100;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public boolean isTop100() {
        return top100;
    }

    public void setTop100(boolean top100) {
        this.top100 = top100;
    }
}
