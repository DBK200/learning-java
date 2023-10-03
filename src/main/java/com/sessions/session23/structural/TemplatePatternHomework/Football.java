package com.sessions.session23.structural.TemplatePatternHomework;

public class Football extends Game{

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
