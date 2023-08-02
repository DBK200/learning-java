package com.sessions.session9;

import java.time.LocalDate;

public class PracticeClassesRoxana
{
    //Instance variables,nu putem sa o apelam daca nu este statica
    public int age;
    //we need a instance in order to call this variable
    public String name;
    public boolean car;
    //static variables,poate fi folosita oriunde :static sau nestatic
    public static int counter=0;

   final private static int counter2=0; //final=constanta

    //metodele statice nu au "this"!!!!!!!!!!!
    public static void main(String[] args)
    {
      PracticeClassesRoxana myObject=new PracticeClassesRoxana();
      //age does not compile
        System.out.println(myObject.age);
        System.out.println(myObject.name);
        System.out.println(myObject.car);
        System.out.println(counter);
    }
    private static int calculateSum(int x,int y)
    {
        //int sum=x+y;
        // return sum;
        return x+y;
    }
    static LocalDate getCurrentDate()
     {
         LocalDate currentDate=LocalDate.now();
         return currentDate;
     }
     //Locale Variables

    private static void printVariables(String name)
    {
        int x=0;
        System.out.println(name);
    }
    private static void printVariables2()
    {
        int x=0;
    }









}
