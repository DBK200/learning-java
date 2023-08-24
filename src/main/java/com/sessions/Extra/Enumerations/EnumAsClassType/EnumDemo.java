package com.sessions.Extra.Enumerations.EnumAsClassType;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        //Display price of Winesap
        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.");


        System.out.println();

        //Display all apples and prices
        System.out.println("All apple prices: ");
        for(Apple a :Apple.values()){
            System.out.println(a + " costs "+ a.getPrice() + " cents.");
        }
    }
}
