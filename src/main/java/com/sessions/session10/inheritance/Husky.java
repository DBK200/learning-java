package com.sessions.session10.inheritance;

public class Husky extends Dog
{
    public static void main(String[] args)
    {
        Husky husky = new Husky();

        husky.name = "Grivei";

        System.out.println(husky.name);
    }
}