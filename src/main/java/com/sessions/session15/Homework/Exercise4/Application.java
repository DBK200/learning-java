package com.sessions.session15.Homework.Exercise4;

public class Application {
    public static void main(String[] args) {

        Song song1 = new Song("title", "artist", 13);
        Song song2 = new Song("title", "artist", 12);

        System.out.println(song1.hashCode());
        System.out.println(song2.hashCode());
        System.out.println(song1.equals(song2));
    }
}
