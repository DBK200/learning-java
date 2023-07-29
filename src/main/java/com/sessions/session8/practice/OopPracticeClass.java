/**********************
 *                    *
 *  Date: 27.07.2023  *
 *                    *
 **********************/

package com.sessions.session8.practice;

public class OopPracticeClass {
    public static void main(String[] args) {
        Car myCar = new Car(4,"red", "petrol");
        System.out.println("myCar has colour " + myCar.getPaintColour());

        // {privateMethod()} is not accessible outside the class
        // Next call can't be done
        // myCar.privateMethod()


    }

}
