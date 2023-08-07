package com.sessions.session8;


public class PracticeClassesMarian {
    public static void main(String[] args) {

        CarB myCar = new CarB (4, "red", "benzina");
        System.out.println(myCar.getPaintColor()); // se poate apela din orice clasa
//        myCar.printHorsepower(); //nu o putem apela din alta clasa

    }
}
