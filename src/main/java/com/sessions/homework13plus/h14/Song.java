package com.sessions.homework13plus.h14;

import java.util.HashSet;
import java.util.Set;

public class Song {
    String title,arist;
    double length;

    public Song(String title, String arist, double length) {
        this.title = title;
        this.arist = arist;
        this.length = length;
    }

    public static void main(String[] args) {
        Song s1 = new Song("song1","artist1",3.41);
        Song s2 = new Song("song1","artist1",5.43);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+ " " + s2.hashCode());

        Set<Song> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        if(obj == this) {return true;}
        if(!(obj instanceof Song)){return false;}
        Song song = (Song) obj;
        return title.equals(song.title) && arist.equals(song.arist);

    }

    @Override
    public int hashCode(){
        int result = 61;
        result = 7 * result + arist.hashCode();
        result = 7 * result + title.hashCode();
        return result;
    }
}
