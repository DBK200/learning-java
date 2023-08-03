package com.sessions.session9;

import java.time.LocalDate;

public class MyPracticeClasses {

    private int age;
    private String name;
    private static int counter = 0;
    final static boolean HASCAR = false;
    public static void main(String[] args){
        MyPracticeClasses test = new MyPracticeClasses();
        System.out.println(test.calcSum(1,2));
        System.out.println(test.getCurrentDate());
        System.out.println(test.age);
        System.out.println(++counter);

        System.out.println(HASCAR);
//        HASCAR = true; doesnt work cuz its final/constant

        Animal animal = new Animal();
        animal.setName("Maimuta");
        System.out.println(animal.getName());
        Animal animal2 = new Animal("Cat", 2);
        System.out.println(animal2.getName() + " " + animal2.getAge() + "yo");

        Animal animal3 = new Animal("Azorel", 2, "canin");
        System.out.println(animal3.getName() + " " + animal3.getAge() + " " + animal3.getFamily());

    }

    private int calcSum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    private LocalDate getCurrentDate(){
        return LocalDate.now();
    }

}
