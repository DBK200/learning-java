package com.sessions.session9.OtherExamples.ArgumentPassing;

public class PassObjRefTest {
    public static void main(String[] args) {
        PassObjRef ob=new PassObjRef(15,20);

        System.out.println("ob.a and ob.b before call: "+ob.a + " "+ ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: "+ob.a + " "+ ob.b);
    }
}
