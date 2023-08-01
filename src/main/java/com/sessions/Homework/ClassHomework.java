package com.sessions.Homework;

public class ClassHomework {
    public static void main(String[] args) {
        Game Warframe = new Game("MMORPG",40,2014,false);
        Music CrabRave = new Music("Crabe Rave" , "Electronic", 3,125,true);
        Video Vacation = new Video(1080,1920,"30 minutes");
        Ebook Java4Dummies = new Ebook("Educational",900,"Java for dummies",9);

        Warframe.isGameOfTheYear();
        Warframe.crash();

        CrabRave.playSong();
        System.out.println("This song has " + CrabRave.getBpm() + " bpm");

        Vacation.pauseVideo();
        System.out.println("This video's resolution is " + Vacation.getResolutionWidth()+"x"+Vacation.getResolutionHeigth()+"p");

        Java4Dummies.isLongBook();
    }
}
