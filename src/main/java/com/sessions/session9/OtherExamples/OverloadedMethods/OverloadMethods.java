package com.sessions.session9.OtherExamples.OverloadedMethods;

public class OverloadMethods {

    public void test(){
        System.out.println("No parameters");
    }

    //Overload test for one integer parameter
    public void test(int a){
        System.out.println("a: "+ a);
    }


    // the return type alone is insufficient to distinguish 2 versions of a method
//    public int test(int a){
//        System.out.println("a: "+ a);
//        return a*a;
//    }

    //Overload test for 2 integer parameters
    public void test(int a, int b){
        System.out.println("a and b: "+a+" "+b);
    }

    public double test(double a){
        System.out.println("double a: "+a);
        return a*a;
    }


}
