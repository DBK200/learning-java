package com.sessions.session22patternsCreational.Creational.factory;

import com.sessions.patternsPractice.creational.factory.demo.Bird;

public class FactoryDemoR
{
    public static void main(String[] args)
    {
        BirdR eagleBird=new BirdFactoryR().getBird("eagle");
        eagleBird.fly();

        ParrotR parrotBird=(ParrotR) new BirdFactoryR().getBird("parroT");
        parrotBird.fly();
        parrotBird.talking();

    }
}
