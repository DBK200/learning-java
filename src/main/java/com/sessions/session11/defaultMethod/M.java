package com.sessions.session11.defaultMethod;

public class M implements E, R
{
    public String calculateNumbers()
    {
       //return "inside class M";
        return E.super.calculateNumbers();
    }

    public static void main(String[] args) {
        new M().calculateNumbers();
    }

}
