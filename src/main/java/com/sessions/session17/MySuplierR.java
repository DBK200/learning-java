package com.sessions.session17;

public interface MySuplierR
{
    //The suplier-este acea operatie care nu trebuie sa i dam nicio variabila dar ne returneaza un rezultat
    String generatedDescription();
}

class PracticeR
{
    public static void main(String[] args)
    {
        MySuplierR mySuplier=()->"djbfkdswf";
        System.out.println(mySuplier.generatedDescription());
        MyConsumerR myConsumer=(int a)->{
            System.out.printf("The circle area with radius %d is:%f",a ,Math.PI*Math.pow(a,2));
        };
        myConsumer.printArea(10);


    }
}
interface MyConsumerR
{
    //The Consumers - an operation that takes a single input argument and returns no result
    void printArea(int  x);
}