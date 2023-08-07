package com.sessions.session9.OtherExamples.ObjectsAsParameters;

public class PassObjTest {
    public static void main(String[] args) {
        PassObj obj1=new PassObj(100,22);
        PassObj obj2=new PassObj(100,22);
        PassObj obj3=new PassObj(-1,-1);

        System.out.println("obj1 == obj2: "+obj1.equalTo(obj2));
        System.out.println("obj1 == obj3: "+obj1.equalTo(obj3));

    }
}
