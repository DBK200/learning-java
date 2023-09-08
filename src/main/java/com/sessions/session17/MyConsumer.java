package com.sessions.session17;
@FunctionalInterface
public interface MyConsumer {
    // The Consumers - an operation that takes a single input argument and returns no result

    void printArea(int radius);
}

class Practice1{

    public static void main(String[] args) {


        MyConsumer myConsumer = (radius) -> {
            System.out.printf("The circle area with radius %d is: %f", radius, Math.PI * Math.pow(radius, 2));
        };

        myConsumer.printArea(10);
    }
}
