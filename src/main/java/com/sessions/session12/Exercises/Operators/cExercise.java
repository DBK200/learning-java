package com.sessions.session12.Exercises.Operators;

public class cExercise {
//    Write a program to add 8 to the number 2345 and then divide it by 3.
//    Now, the modulus of the quotient is taken with 5 and then multiply the
//    resultant value by 5. Display the final result.
    public static void main(String[] args) {
        int number=2345;
        System.out.println(number);
        number+=8;
        System.out.println(number);
        number/=3;
        System.out.println(number);
        number%=5;
        System.out.println(number);
        number*=5;
        System.out.println("Final number="+number);

    }
}
