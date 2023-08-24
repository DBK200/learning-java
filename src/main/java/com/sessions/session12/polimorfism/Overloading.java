package com.sessions.session12.polimorfism;

public class Overloading
{
    //metode ce se numesc la fel dar au parametrii diferiti
    //1 -prin nr de argumente
    private int claculateArea(int latura)
    {
        return latura*latura;
    }
    //nu putem avea doua metode cu acelasi nume si acelasi nr de parametri
    // deoarece nu se pot diferentia cand apelam metoda
//    private int claculateArea(int x)
//    {
//        return x;
//    }
    private int claculateArea(int lungime,int latime)
    {
        return lungime*latime;
    }
    //2 prin
    private Double calculateArea(double raza)
    {
        return 3.14*raza*raza;
    }

    public static void main(String[] args)
    {
        System.out.print("Aria patratului: ");
        System.out.println(new Overloading().claculateArea(2));
        System.out.print("Aria dreptunghiului: ");
        System.out.println(new Overloading().claculateArea(2,5));
        System.out.print("Raza cercului: ");
        System.out.println(new Overloading().calculateArea(2));


    }
}
