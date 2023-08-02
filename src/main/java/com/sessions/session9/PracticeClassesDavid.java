package com.sessions.session9;

import java.time.LocalDate;

public class PracticeClassesDavid {

    private int age;// instance variable
//    we need an instance in order to call this variable

    private  static int counter=0;//Static variable

    public static void main(String[] args) {

        PracticeClassesDavid myObject=new PracticeClassesDavid();
//        age//does not compile
        System.out.println(myObject.age);

        System.out.println(counter);

    }
    private static int calculateSum(int primulNumar,int alDoileaNumar) {
        return primulNumar+alDoileaNumar;
        //int x=counter;

    }
    static LocalDate getCurentDate(){
        return LocalDate.now();
    }

    private static void printVarables(String name){
        int x=0;
        System.out.println(name);
    }
    private static void printVarables2(){
        int x=0;
//        name
    }
}
