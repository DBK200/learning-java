package com.sessions.session23patternsStructural.homework.Factory;

import com.sessions.session23patternsStructural.homework.Factory.DogR;

class Husky implements DogR
{
    @Override
   public void makesSound()
    {
        System.out.println("Husky makes sound:HAM HAM HAM");
    }
}
