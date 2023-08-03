package com.sessions.session10.Inheritence;

public class Mouse extends AnimalR
{
    public static void main(String[] args)
    {

        Mouse mouse = new Mouse();
        mouse.age=3;
        System.out.println(mouse);

        CatR Kitty=new CatR();
        Kitty.age=1;
        System.out.println(Kitty);
    }
}
