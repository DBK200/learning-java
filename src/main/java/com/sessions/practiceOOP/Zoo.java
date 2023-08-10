package com.sessions.practiceOOP;

public abstract class Zoo {

    private int numberOfAnimals;

    //abstract methods cannot have body
    abstract int getNumberOfAnimals();

    //default methods can be defined only in interfaces
    String getDescriptionOfZoo(){//does it compile?
        return "This zoo is called ZooZoo and it has 20 animals.";
    }

//    Zoo(){
//        System.out.println("this is from the abstract");
//    }

    //abstract classes/interfaces cannot be instantiated
    public static void main(String[] args) {
//        Zoo zoo=new Zoo();//does it compile?
    }

    public abstract int getAge(); //does it compile?


    abstract int getTicketPrice(); //does it compile?

    //private and abstract cannot be used together
//    private abstract String getAppointmentDetails(); //does it compile?
//
//


}
