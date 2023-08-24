package com.sessions.session10.OtherExamples.Inheritance.MethodOverriding;

public class B extends A{
    int k;

    B(int a, int b, int c){
        super(a,b);
        k=c;

    }

    //display k -this overrider show() in A
//    @Override
//    void show(){
//        System.out.println("k: "+k);
//    }


    //display i,j,k - overrides show() in A
    @Override
    void show(){
        super.show(); //calls show() in A
        System.out.println("k: "+k);
    }

    //overload show()
    void show(String msg){ //takes a parameter

        System.out.println(msg + k);
    }
}
