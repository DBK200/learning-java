package com.sessions.session17;

@FunctionalInterface
public interface MyConsumerAV {
    //takes a single input argument and returns no result
    void printArea(int a);
}

class PracticeConsumer {
    public static void main(String[] args) {

        MyConsumerAV myConsumer = (int a) -> System.out.println(a);
        myConsumer.printArea(4);
    }
}