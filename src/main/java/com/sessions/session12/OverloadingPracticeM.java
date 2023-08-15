package com.sessions.session12;

public class OverloadingPracticeM {

    private int calculateArea(int l){
        return l * l;
    }

    private int calculateArea(int lungime, int latime){ //overloading prin nr de argumente/parametri
        return lungime*latime;
    }

    private Double calculateArea(double raza){
        return 3.14 * raza * raza;
    }
//    private int calculateArea(int x){ //we cannot have same method with
//        System.out.println("ceva");
//        return 2;
//    }

    public static void main(String[] args) {
        System.out.println(new OverloadingPracticeM().calculateArea(2));
        System.out.println(new OverloadingPracticeM().calculateArea(2,3));
        System.out.println(new OverloadingPracticeM().calculateArea(2.5));

    }
}
