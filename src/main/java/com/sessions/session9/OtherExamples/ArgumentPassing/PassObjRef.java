package com.sessions.session9.OtherExamples.ArgumentPassing;



public class PassObjRef {

    int a,b;

    public PassObjRef(int i, int j){
        a=i;
        b=j;
    }

    //pass an object
    void meth(PassObjRef o){
        o.a *=2;
        o.b /=2;
    }
}
