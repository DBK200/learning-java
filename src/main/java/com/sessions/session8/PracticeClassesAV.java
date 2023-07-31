package com.sessions.session8;

public class PracticeClassesAV {

    public static void main(String[] args) {

        CarAV myCarAV = new CarAV(4, "red", "gas");
        System.out.println(myCarAV.getPaintColor()); // se poate apela din orice clasa
//        myCarAV.printHorsePower(); // nu o putem apele din alta clasa
    }
}
