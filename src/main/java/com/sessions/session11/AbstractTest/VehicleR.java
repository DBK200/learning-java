package com.sessions.session11.AbstractTest;

public abstract class VehicleR extends TransportationR
{
    //shoud not be used to create new objects
    //must be inherited
    // ascunde detalii
    // clasa abstracta nu poate crea obiecte
    //pt metode nu are body sau logica
    //o metoda abstracta trebuie sa se afle intr o clasa abstracta
    //clasa abstracta nu este obligata sa aiba metode abstracte
    //avantaje:
    //1-se evita duplicarea

    public abstract void startEngine();//nu poate fi finala,private
    VehicleR()
    {
        System.out.println("inside contructor");
    }//pot fi definiti fara argumente
    public static void myMethod()
    {

    }
    public void calculateSomething()
    {
        System.out.println("cbfdj");
    }

}
