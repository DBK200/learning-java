package com.sessions.session9.OtherExamples.NestedClasses;

public class Outer {
    int outer_x=100;

    void test(){
        Inner inner=new Inner();
        inner.display();
    }
    //this is an inner class
    class Inner{
        int y=10;
        void display(){
            System.out.println("display: outer_x = "+outer_x);
        }
    }

    void showY(){
        //System.out.println(y); //error, y not know
    }
}

class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.test();
    }
}
