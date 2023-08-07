package com.sessions.session9.SessionCode;



import java.time.LocalDate;

public class PracticeClassesDeliaP {


    // Instance variables
    private int age;
    public String name="nume";
    private boolean car;

    final private static int counter2=0;//static variable
    public static int counter=0;//static variabel

    public static void main(String[] args){
//        System.out.println( calculateSum(2,3));
//
//        System.out.println(getCurrentDate());
        PracticeClassesDeliaP myObject=new PracticeClassesDeliaP();
        System.out.println(myObject.age);
        System.out.println(myObject.name);
        System.out.println(myObject.car);

        System.out.println(counter);


    }

//-----------------Local variables - defined inside the methods
    private static void printVariables(String name){

        int x=0;
        System.out.println(name);
    }

    private static void printVariables1(){

        int x=0;
        //name - does not exist
    }

//--------------------------------------------------------------------

    private static int calculateSum(int x, int y){
//        int sum=x+y;
//        return sum;
        return x+y;
    }

    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }
}
