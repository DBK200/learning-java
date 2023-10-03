package com.sessions.session23.structural.TemplatePatternHomework;

public class Cricket extends Game{
    @Override
    void startPlay(){
        System.out.println("Cricket game started. Enjoy the game!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game initialized! Start playing");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
