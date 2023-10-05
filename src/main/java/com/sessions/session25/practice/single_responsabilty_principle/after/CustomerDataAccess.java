package com.sessions.session25.practice.single_responsabilty_principle.after;

class ResultPrinter <T> {
    T t;
    public <T> void printMessage(T message) {
        System.out.println(message.toString()); //formatat
        // save customer logic./..

//        );
        // Code for saving customer data to a database
//        t....
    }
}
