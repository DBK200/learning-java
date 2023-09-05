package com.sessions.session15.Homework;

public class Song {
    private String title;
    private String artist;
    private int length;

    public String getTitle(){
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    Song(String title, String artist, int length){
        this.title=title;
        this.artist=artist;
        this.length=length;
    }


    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object == this) {
            return true;
        }

        if (!(object instanceof Song)) {
            return false;
        }
        Song song = (Song) object;

        return title.equals(title) && artist.equals(artist);
    }


    public int hashCode() {
        return title.hashCode()+artist.hashCode();
    }

    public static void main(String[] args) {
        Song song1 = new Song("Not Afraid","Eminem", 4);
        Song song2 = new Song("Not Afraid","Eminem", 6);
        System.out.println(song1.equals(song2));
        System.out.println(song1.hashCode());
        System.out.println(song2.hashCode());
    }
}
