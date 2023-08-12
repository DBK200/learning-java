package com.sessions.session12.polymorphism;

public class OverloadingPractice {

    // de cautat ce e un record in java
    private int calculateArea(int l){
        return l*l;
    }

//     private int calculateArea(int x){    // nu putem avea doua metode cu aceeasi semnatura
//         System.out.println("ceva");
//         return 2;
//     }
    private int calculateArea(int lungime, int latime){ // overloading prin numarul de argumente / parametrii
        return lungime * latime;
    }

    private Double calculateArea(double raza){
        return 3.14 * raza * raza;
    }

    public static void main(String[] args) {
        System.out.println(new OverloadingPractice().calculateArea(2)); // new OverloadingPractice() - instanta a clasei

        System.out.println(new OverloadingPractice().calculateArea(2, 3)); // new OverloadingPractice() - instanta a clasei

        System.out.println(new OverloadingPractice().calculateArea(2.5));


    }
}
