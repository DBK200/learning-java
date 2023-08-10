package com.sessions.session11.defaultMethod;

public class CM implements AM, BM {

    public String calculateNumbers() {
        return "inside class C";
//        return AM.super.calculateNumbers();
    }

}
