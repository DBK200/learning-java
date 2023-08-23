package com.sessions.session9;

import java.time.LocalDate;

public class PracticeClasses {

    public int age; // instance variable
    // we need an instance in order to call this variable
    public String name = "numeceva";
    public boolean car;

    final private static int counter2 = 0; //static variable
    public static int counter = 0; //static variable

    public static void main(String[] args){
        PracticeClasses myObject = new PracticeClasses();
//        age //does not compile

        System.out.println(myObject.age);
        System.out.println(myObject.name);
        System.out.print(myObject.car);

        System.out.println(counter);
//        counter2 = 2;

    }

    private int calculateSum(int primulNumar,int alDoileaNumer){
//        int sum = primulNumar + alDoileaNumer;
//        return sum;
        int x = counter;
        return primulNumar + alDoileaNumer;
    }

    static LocalDate getCurrentDate(){
//        return LocalDate.now();

        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }

    private static void printVariables(String name){
        int x = 0;
        System.out.println(name);
    }

    private static void printVariables2(){
        int x = 0;
//        name
    }
}
