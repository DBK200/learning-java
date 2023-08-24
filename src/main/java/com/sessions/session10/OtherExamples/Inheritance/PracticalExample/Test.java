package com.sessions.session10.OtherExamples.Inheritance.PracticalExample;



public class Test {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = box1.volume();
        System.out.println("Volume of box1 is: " + vol);
        System.out.println("Weight of box1 is: " + box1.weight);

        System.out.println();

        vol = box2.volume();
        System.out.println("Volume of box2 is: " + vol);
        System.out.println("Weight of box2 is: " + box2.weight);

        System.out.println();


//------------ a superclass variable can reference a subclass object
        Box plainbox = new Box();
        //assign BoxWeight reference to Box reference
        plainbox=box1;

        vol=plainbox.volume(); //volume() defined in Box
        System.out.println("volume of plainbox is: "+ vol);

        /*The following statement is invalid because plainbox
        does not define a weight member.
         */
//        System.out.println("Weight of plainbox is: "+ plainbox.weight);
    }
}
