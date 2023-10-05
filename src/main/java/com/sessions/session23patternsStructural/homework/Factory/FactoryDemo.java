package com.sessions.session23patternsStructural.homework.Factory;

import com.sessions.session23patternsStructural.homework.Factory.Ciobanesc;
import com.sessions.session23patternsStructural.homework.Factory.DogFactory;
import com.sessions.session23patternsStructural.homework.Factory.DogR;

public class FactoryDemo
{
    public static void main(String[] args)
    {
        DogR HuskyDog=new DogFactory().getDog("Husky");
        HuskyDog.makesSound();

        Ciobanesc CiobanescDog=(Ciobanesc) new DogFactory().getDog("Ciobanesc");
        CiobanescDog.makesSound();
    }
}

