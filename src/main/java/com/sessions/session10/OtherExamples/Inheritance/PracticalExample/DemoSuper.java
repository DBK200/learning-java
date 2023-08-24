package com.sessions.session10.OtherExamples.Inheritance.PracticalExample;

public class DemoSuper {
    public static void main(String[] args) {
        //all arguments defined
        BoxWeightWithSuper box1=new BoxWeightWithSuper(10,20,15,34.3);
        BoxWeightWithSuper box2=new BoxWeightWithSuper(2,3,4,0.076);
        BoxWeightWithSuper box3=new BoxWeightWithSuper(); //default
        BoxWeightWithSuper box4=new BoxWeightWithSuper(3,2); //cube
        BoxWeightWithSuper box5=new BoxWeightWithSuper(box1); //clone


        double vol;

        vol=box1.volume();
        System.out.println("(all parameters) Volume of box1 is: "+vol);
        System.out.println("Weight of box1 is: "+box1.weight);
        System.out.println();

        vol=box2.volume();
        System.out.println("(all parameters) Volume of box2 is: "+vol);
        System.out.println("Weight of box2 is: "+box2.weight);
        System.out.println();


        vol=box3.volume();
        System.out.println("(default) Volume of box3 is: "+vol);
        System.out.println("Weight of box3 is: "+box3.weight);
        System.out.println();

        vol=box4.volume();
        System.out.println("(cube) Volume of box4 is: "+vol);
        System.out.println("Weight of box4 is: "+box4.weight);
        System.out.println();

        vol=box5.volume();
        System.out.println("(clone) Volume of box5 is: "+vol);
        System.out.println("Weight of box5 is: "+box5.weight);
        System.out.println();



    }
}
