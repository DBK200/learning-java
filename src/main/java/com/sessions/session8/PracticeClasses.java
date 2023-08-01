package com.sessions.session8;

public class PracticeClasses {

    public static void main(String[] args) {
        Car myCar = new Car(4, "red", "benzina");
        System.out.println(myCar.getPaintColor()); // se poate apela din orice clasa
//        myCar.printHorsepower(); // nu o putem apela din alta clasa
        BMW bmw =  new Bmw();
        Student student = Student();

    }

}
