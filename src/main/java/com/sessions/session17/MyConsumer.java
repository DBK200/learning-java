package com.sessions.session17;

import com.sessions.session14.HashMap.Main;

public interface MyConsumer {
    //The Consumers - an operation the takes a single input argument and return no result

    void printArea(int a);

}
class Practice2{
    public static void main(String[] args) {

        MyConsumer myConsumer = (int a) -> {
            System.out.printf("The circle are with radius %d is : %f ", a,  + Math.PI * Math.pow(a, 2));
        };
        myConsumer.printArea(5);
    }


}
