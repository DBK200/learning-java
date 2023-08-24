package com.sessions.session13.recap;

public class EX2
{

    //Type Casting: Declare a variable of one data type, and then assign it
    // to a variable of another data type using type casting. For example,
    // declare a double variable and assign it to an int variable using type casting.
    // Print out the value of the int variable to verify that the type casting was successful.

    public static void main(String[] args) {
        double numar=5.2;
        int integerNumar=(int)numar;
        int nr=6;
        float x=(float)nr;

        System.out.println("The initial number is:" +numar);
        System.out.println("The value casted to int is:" +integerNumar);
        System.out.println("The initial integer number:" +nr);
        System.out.println("The value casted to float is:" +x);
    }
}
