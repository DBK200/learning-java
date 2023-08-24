package com.sessions.Extra.Enumerations.Fundaments;

public class EnumDemo {
    public static void main(String[] args) {
        //declare an enum type variable
        Apple ap;

        //assignment
        ap=Apple.Jonathan;

        //Output an enum value
        System.out.println("Value of ap: "+ ap);
        System.out.println();

        ap=Apple.GoldenDel;

        //Compare 2 enum values
        if(ap == Apple.GoldenDel){
            System.out.println("ap contains GoldenDel.");
        }

        //Switch with enum
        switch (ap){
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("Winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;

        }


        System.out.println();

        //use values()
        System.out.println("Here are all Apple constants:");

        Apple[] allApples=Apple.values();
        for(Apple a:allApples)
            System.out.println(a);

        System.out.println();

        //use valueOf()
        ap=Apple.valueOf("Winesap");
        System.out.println("ap contains "+ ap);

        System.out.println();

//------------ ordinal(), compareTo(), equals()
        Apple ap1, ap2, ap3;

        //Obtain all ordinal values using ordinal()
        System.out.println("Here are all apple constants and their ordinal values: ");
        for(Apple a:Apple.values()){
            System.out.println(a+ " "+a.ordinal());
        }

        System.out.println();

        ap1=Apple.RedDel;
        ap2=Apple.GoldenDel;
        ap3=Apple.RedDel;

        //Demonstrate compareTo() and equals()
        if(ap.compareTo(ap2)<0){
            System.out.println(ap1 + " comes before "+ap2);
        }

        if(ap.compareTo(ap2)>0){
            System.out.println(ap2 + " comes before "+ap1);
        }


        if(ap.compareTo(ap2)==0){
            System.out.println(ap1 + " equals "+ap2);
        }


        System.out.println();

        if(ap1.equals(ap2)){
            System.out.println("Error!");
        }

        if(ap1.equals(ap3)){
            System.out.println(ap1 + " equals " + ap3);
        }

        if(ap1==ap3){
            System.out.println(ap1+ " == "+ap3);
        }
    }
}
