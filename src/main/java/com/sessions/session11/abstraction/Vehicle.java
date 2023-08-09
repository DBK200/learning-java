package com.sessions.session11.abstraction;

public abstract class Vehicle extends Transportation{

    // should not be used to create new objects
    // must be inherited

    // abstract method example

    // o clasa abstracta trebuie sa contina keyword-ul abstract. Nu e obligatoriu sa contina si o metoda abstracta, dar o metoda abstracta trebuie sa fie obligatoriu
    // intr-o clasa abstracta

    // o clasa abstracta nu poate fi final. Ea trebuie mostenita obligatoriu, iar prima clasa care o mosteneste trebuie sa ii implementeze metodele abstracte
    // clasa abstracta nu poate fi nici private pentru ca elementele de tip private sunt accesibile doar in cazul clasei in care se afla

    public abstract void startEngine();


    // Constructor
    Vehicle(){ // can be defined with no arguments
        System.out.println("inside constructor");
    }
    public static void myMethod(){

    }
    public void calculateSomething(){
        System.out.println("wef");
    }
}
