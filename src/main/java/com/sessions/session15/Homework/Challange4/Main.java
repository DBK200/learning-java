package com.sessions.session15.Homework.Challange4;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song();
        Song song2 = new Song();
        song1.setTitle("Aerials");
        song1.setArtist("System Of A Down");
        song1.setLength(4.04);
        song2.setTitle("Aerials");
        song2.setArtist("System Of A Down");
        song2.setLength(4.54);

        System.out.println(song1.equals(song2));
        System.out.println(song1.hashCode());
        System.out.println(song2.hashCode());
    }
}
