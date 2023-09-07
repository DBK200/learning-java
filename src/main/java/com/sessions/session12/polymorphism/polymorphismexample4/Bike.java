package com.sessions.session12.polymorphism.polymorphismexample4;

 class Bike {
    void run(){
        System.out.println("running");
    }
}

class Splendor extends Bike{
     void run(){
         System.out.println("splendor running safely with 60 km");
     }
    public static void main(String[] args) {

        Bike bike = new Splendor();     // referinta este de tipul superclasei, obiectul este de tipul subclasei
        bike.run();
    }
}
