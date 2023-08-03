package com.sessions.session9;

import java.time.LocalDate;

public class PracticeClassesTeodor {

    public int age; //instance variable
    //we need an instance in order to call this variable
    public String name ;
    private boolean car;

    private final static int counter2 = 0; // static variable
    public static int counter = 1;

    public static void main(String[] args) {

        PracticeClassesTeodor myObject = new PracticeClassesTeodor();
        System.out.println(myObject.age);
        System.out.println(myObject.name);
        myObject.car = true;
        System.out.println(myObject.car);

        System.out.println(counter);


        int sum = myObject.calculateSum(15,36);
        System.out.println(sum);


    }

    private int calculateSum(int x, int y){
        int z = counter;
        return x + y + z;
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
    }
}
