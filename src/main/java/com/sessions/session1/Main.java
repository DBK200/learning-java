package com.sessions.session1;

/*

    === Session 01 Challenge ===

    Imagine you have a house, and you want to map the objects from that house, to Java classes.
    The properties of the real life objects are translated to Java as the class fields (variables).
    Try to identify at least 10 objects from the house and create classes and fields.
    Try to use local, instance and static variables.

    Example:
    public class Couch {
	    private String brand;
    	private String colour;
    	private int weight;
    }

    Create at least 5 methods for each class that return some properties from the house.
    As an example, we can have {getBalanceAccount()} method that returns the subtraction
    between 2 variables (totalAmount and totalSpent).

    Please pay attention to the code formatting (spacing & indentation), and keep it as clean as possible.
    Use shortcut ctrl+alt+l to format the code.

    Note: the first row below the class name is empty.
          We should always leave an empty row after the class, just for indentation purposes.

*/

public class Main {
    public static void main(String[] args) {

        /*--------------
         |  Car class  |
         --------------*/

        // object creation
        Car vw = new Car();

        // sets the maker
        vw.setMake("Volkswagen ID.3");

        // colour is set to BLUE
        vw.setColour("blue");

        // speed increased to 25.3 km/h
        vw.increaseSpeed(25.3);

        // prints out current speed
        System.out.printf("[%s] Current speed of %s is %.1f [km/h].%n",
                vw.getClass().getSimpleName(),
                vw.getMake(),
                vw.getSpeed());

        // speed decreased to 0
        vw.decreaseSpeed(25.3);

        // prints out current speed
        System.out.printf("[%s] %s is currently moving is %b.%n",
                vw.getClass().getSimpleName(),
                vw.getMake(),
                vw.bIsMoving());

        // prints out class data
        // calling the method defined in class
        vw.printClass();

        // separator line
        System.out.println();


        /*------------------
         |  Bicycle class  |
         ------------------*/
        Bicycle mtb = new Bicycle();
        mtb.setMake("Pegas");
        System.out.printf("[%s] %s has disc brakes is %b.%n",
                mtb.getClass().getSimpleName(),
                mtb.getMake(),
                mtb.isDiscBrakes());
        mtb.upgrade();
        System.out.printf("[%s] %s has disc brakes is %b.%n",
                mtb.getClass().getSimpleName(),
                mtb.getMake(),
                mtb.isDiscBrakes());
        mtb.setMountainBike(true);
        mtb.printClass();

        // separator line
        System.out.println();


        /*----------------
         |  Truck class  |
         -----------------*/
        Truck man = new Truck();
        man.setMake("MAN");
        man.setWheels(4);
        man.setCabOver(false);
        man.printClass();

        // separator line
        System.out.println();


        /*------------------
         |  Tractor class  |
         -------------------*/
        Tractor jd = new Tractor();
        jd.setMake("John Deer");
        jd.setWheels(4);
        jd.setSpeed(30.56);
        jd.setTraction("all");
        jd.printClass();
        jd.setTraction("something");
        jd.printClass();
    }
}