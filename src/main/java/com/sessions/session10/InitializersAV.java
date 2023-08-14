package com.sessions.session10;

public class InitializersAV {
    int y;

    {
        int x = 2;
        y = 2;
        System.out.println("Inside instance initializer");
    } // se apeleaza la fiecare instantiere (new)

    final static int NUMBER;
    final static int NUMBER2 = 3;

    static {
        NUMBER = 2;
//        NUMBER2 = 2 //does not compile, value already assigned
        System.out.println("Inside static initializer");
    } // se apeleaza o singura data la inceput

    public InitializersAV() {
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {

        InitializersAV initializers = new InitializersAV();
        InitializersAV initializers2 = new InitializersAV();
        initializers.printStuff();

    }

    private void printStuff() {
        System.out.println("Inside print stuff method");
    }
}
