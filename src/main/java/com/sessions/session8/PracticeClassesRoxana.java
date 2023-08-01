package com.sessions.session8;

public class PracticeClassesRoxana
{
        public static void main(String[] args)
        {
            CarRoxana myCar = new CarRoxana(4, "red", "benzina");
            System.out.println(myCar.getPaintColor()); // se poate apela din orice clasa
//        myCar.printHorsepower(); // nu o putem apela din alta clasa
            Audi audi =  new Audi();
        }
}
