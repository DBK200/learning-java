package com.sessions.session11.OtherExamples.NestedInterfaces;


//B implements the nested interface
public class B implements A.NestedIF{
    @Override
    public boolean isNotNegative(int x) {
        return x<0 ? false :true;
    }
}
