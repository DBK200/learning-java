package com.sessions.session9.OtherExamples.ObjectsAsParameters;

public class PassObj {

    int a,b;

    public PassObj(int i, int j){
        a=i;
        b=j;
    }
    //return true if o is equal tp the invoking object
    boolean equalTo(PassObj o){
        if(o.a==a && o.b==b) return true;
        return false;
    }
}
