package com.sessions.session9.OtherExamples.ReturningObjects;

public class RetObj {

    int a;

    public RetObj(int i){
        a=i;
    }

    public RetObj incrByTen(){
        RetObj temp=new RetObj(a+10);
        return temp;
    }
}
