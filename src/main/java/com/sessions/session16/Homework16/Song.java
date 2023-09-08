package com.sessions.session16.Homework16;
import java.util.Objects;
public class Song {

    private String title;
    private String artist;
    private double length;

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public boolean equals(Object object){
        if(object==null)
            return false;
        if(object==this)
            return true;
        if(!(object instanceof Song))
            return false;

        Song song=(Song) object;
        return title.equals(song.title)&&artist.equals(song.artist);
    }

    public int hashCode() {
        return Objects.hash(title,artist);
    }
}
