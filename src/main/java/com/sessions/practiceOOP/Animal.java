package com.sessions.practiceOOP;

public interface Animal extends Interface1{
//
    //cannot be private
//    private void eat(); //does it compile?

    //fields are final so they need to be initialized
//    int age;//does it compile?

    String name = "Animal";//does it compile?
//
//    default String printName(String name){//does it compile?
//        return "Animal name is " + name;
//    }
//
     int getAge();//does it compile?
//
    static int getNumberOfFeet(){ //does it compile?
        return 4;
    }

//    Animal(){
//        //does it compile
//    }
//
}
