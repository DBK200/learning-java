package com.sessions.patternsPractice.structural.facade;

class SubsystemClass1 {
    public void method1() {
        System.out.println("SubsystemClass1 - Method1");
    }
}

class SubsystemClass2 {
    public void method2() {
        System.out.println("SubsystemClass2 - Method2");
    }
}

class SubsystemClass3 {
    public void method3() {
        System.out.println("SubsystemClass3 - Method3");
    }
}

// Facade class
class Facade {
    private SubsystemClass1 subsystemClass1;
    private SubsystemClass2 subsystemClass2;
    private SubsystemClass3 subsystemClass3;

    public Facade() {
        subsystemClass1 = new SubsystemClass1();
        subsystemClass2 = new SubsystemClass2();
        subsystemClass3 = new SubsystemClass3();
    }

    public void operation() {
        subsystemClass1.method1();
        subsystemClass2.method2();
        subsystemClass3.method3();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
