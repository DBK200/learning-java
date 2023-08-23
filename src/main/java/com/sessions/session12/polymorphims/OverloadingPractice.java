package com.sessions.session12.polymorphims;

public class OverloadingPractice {

    private int calculateArea(int l){
        return l * l;
    }

    private int calculateArea(int lungime, int latime){  //overloading by parameters
        return latime * lungime;
    }

    private Double calculateArea(double raza){
        return Math.PI * raza * raza;
    }

    public static void main(String[] args) {

        System.out.println( new OverloadingPractice().calculateArea(15));
        System.out.println(new OverloadingPractice().calculateArea(5, 15));
        System.out.println(new OverloadingPractice().calculateArea(3.5));



    }

}
