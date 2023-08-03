package com.sessions.session10.Inheritence;

public class HuskiR extends CatR
{
    //clasa HuskiR mosteneste 2 clase:Animal si Cat(multi level inheritance)
    //Animal
      //Cat  Mouse
        //Hauski
    public static void main(String[] args)
    {
        HuskiR huskiR=new HuskiR();
        System.out.println(huskiR.age);//vine din Animal
        System.out.println(huskiR.name);//vine din Cat
    }
}
