package com.sessions.session17;
@FunctionalInterface
public interface MyConsumer {
    //Tho Consumer - an operation that takes a single input argument and returns no result

    void printArea(int a);
}
class Print{
    public static void main(String[] args) {
        MyConsumer myConsumer = (int a) -> {
            System.out.printf("The circle area with radius %d is: %f", a, Math.PI*Math.pow(a,2));
        };
        myConsumer.printArea(10);
    }
}
