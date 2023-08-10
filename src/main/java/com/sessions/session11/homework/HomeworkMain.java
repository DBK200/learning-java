package com.sessions.session11.homework;

public class HomeworkMain {

    public static void main(String[] args) {

//        Ex.1.:
        Subclass1 subclass1 = new Subclass1();
        subclass1.message();
        Subclass2 subclass2 = new Subclass2();
        subclass2.message();

//        Ex.2.:
        BankA bankA = new BankA();
        bankA.getBalance();
        BankB bankB = new BankB();
        bankB.getBalance();
        BankC bankC = new BankC();
        bankC.getBalance();

//        Ex.3.:
        AbstractClassSubClass subClass = new AbstractClassSubClass();
        subClass.a_method();
        subClass.n_method();

//        Ex.4.:
        Area area = new Area();
        area.rectangleArea(3,4);
        area.squareArea(17);
        area.circleArea(3);
    }
}
