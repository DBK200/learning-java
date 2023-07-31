package com.sessions.session8;

public class PracticeClasses {

    public static void main(String[] args) {

        CarAnd myCar = new CarAnd(4, "red", "benzina");
        System.out.println(myCar.getPaintColor());
       // myCar.printHorsepower(); // nu o putem apela din alta clasa
    }
}
