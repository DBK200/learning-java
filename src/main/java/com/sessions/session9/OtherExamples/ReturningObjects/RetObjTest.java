package com.sessions.session9.OtherExamples.ReturningObjects;

public class RetObjTest {
    public static void main(String[] args) {
        RetObj obj1=new RetObj(2);
        RetObj obj2;

        obj2=obj1.incrByTen();
        System.out.println("obj1.a: "+obj1.a);
        System.out.println("obj2.a: "+obj2.a);


        obj2=obj2.incrByTen();
        System.out.println("obj2.a after second increase: "+obj2.a);
    }
}
