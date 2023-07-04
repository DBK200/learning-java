package com.sessions.test;

public class Test {

    //accesibil doar din clasa asta
    private int privateInt = 1;
    //acces din alte clase/alte pachete
    public int publicInt = 2;
    //acces din alta clase din acelasi pachet sau subclasa din acelasi/alt pachet
    protected int protectedInt = 3;

    int packagePrivateInt = 4;
}
