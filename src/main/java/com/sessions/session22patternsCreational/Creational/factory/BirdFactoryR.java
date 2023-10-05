package com.sessions.session22patternsCreational.Creational.factory;

import java.util.Objects;

public class BirdFactoryR
{
    public BirdR getBird(String birdType)
    {
        if(Objects.equals(birdType.toLowerCase(),"eagle")) {
            return new EagleR();
        } else if (Objects.equals(birdType.toLowerCase(),"owl"))
        {
            return new OwlR();
        } else if (Objects.equals(birdType.toLowerCase(),"parrot"))
        {
            return new ParrotR();
        } else
        {
            return null;
        }

    }
}
