package com.sessions.session9.OtherExamples.OverloadedConstructors;

public class OverloadConstructorsTest {
    public static void main(String[] args) {
        Box box1=new Box(10,20,15);
        Box box2=new Box();
        Box box3=new Box(7);

        double vol;

        //get volume of first box
        vol=box1.volume();
        System.out.println("Volume of box1 is: "+vol);

        //get volume of second box
        vol=box2.volume();
        System.out.println("Volume of box2 is: "+vol);

        //get volume of third box
        vol=box3.volume();
        System.out.println("Volume of box3 is: "+ vol);
    }
}
