package com.sessions.session15.Homework.Challange4;

import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private double length;

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Song song)){
            return false;
        }
        return title.equals(song.title) && artist.equals(song.artist);
    }

    public int hashCode(){
        return Objects.hash(title, artist);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
