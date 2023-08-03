package com.sessions.session9;

import java.time.LocalDate;

public class PracticeClassesAV {

    private int age; //instance variable - am nevoie de o instanta a clasei ca sa o apelez
    public String name = "nume";
    private boolean car;
    final static int counter = 0; //static variable, poate fi folosit oriunde, inclusiv si in metode care nu sunt statice

    //clasa final nu mai poate fi mostenita

    public static void main(String[] args) {

//       int result = calculateSum(2, 3);
//       System.out.println(result);
       System.out.println(getCurrentDate());

       PracticeClassesAV myObject = new PracticeClassesAV(); //constructorul default
        System.out.println(myObject.age);
        System.out.println(myObject.name);
        System.out.println(myObject.car);

        System.out.println(counter);
        // counter = 2; - eroare
    }

    int calculateSum(int a, int b) {

        int x = counter;
        return a + b;
    }
    static LocalDate getCurrentDate(){
//        return LocalDate.now();
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }
    private static void printVariables(String name){
        int x = 0; //local
        System.out.println(name); //local
    }
    private static void printVariables2(){
        int x = 0; //local
    }
}
