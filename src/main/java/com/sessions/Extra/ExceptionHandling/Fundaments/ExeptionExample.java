package com.sessions.Extra.ExceptionHandling.Fundaments;

import java.util.Random;

public class ExeptionExample {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random r=new Random();

        for(int i=0;i<125;i++){
            try{
                b=r.nextInt();

                c=r.nextInt();

                a=12345/ (b/c);
            }catch (ArithmeticException e){
                System.out.println("Division by zero.");
                System.out.println("Exception: "+e); //display description of exception
                a=0; //set a to 0 and continue
            }
            System.out.println("a: "+a);
        }
    }
}
