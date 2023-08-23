package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex15;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {

    private ArrayList<Song> songs;


    public MusicLibrary(){
        this.songs = new ArrayList<>();
    }
    public void addSong(Song song){
        songs.add(song);
    }
    public void removeSong(Song song){
        songs.remove(song);
    }
    public Song getRandomSong(){
        if (songs.isEmpty()){
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());
        return songs.get(randomIndex);
    }

    public void printAllLibrary(){
        for (Song song : songs){
            System.out.println(song);
        }
    }


}
