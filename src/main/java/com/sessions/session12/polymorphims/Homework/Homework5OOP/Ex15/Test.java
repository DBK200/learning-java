package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex15;

public class Test {

    public static void main(String[] args) {

        MusicLibrary musicLibrary = new MusicLibrary();

        Song song1 = new Song("We are chaos", "M Manson");
        Song song2 = new Song("Payphone", "Maroon5");
        Song song3 = new Song("Candy Shop", "50 Cent");
        Song song4 = new Song("It's my life", "Bon Jovi");

        musicLibrary.addSong(song1);
        musicLibrary.addSong(song2);
        musicLibrary.addSong(song3);
        musicLibrary.addSong(song4);

        System.out.println(musicLibrary.getRandomSong());
        System.out.println();

        musicLibrary.printAllLibrary();
        System.out.println();

        musicLibrary.removeSong(song2);
        musicLibrary.printAllLibrary();

    }

}
