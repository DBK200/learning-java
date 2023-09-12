package com.sessions.session17;

public interface Exercising {
    double operate(double a, double b);

}

class Main2 {
    public static void main(String[] args) {


        double num1 = 15.2;
        double num2 = 19.7;

        Exercising addition = (a, b) -> a + b;
        double resultA = addition.operate(num1, num2);
        System.out.println("Addition result: " + resultA);

        Exercising subtraction = (a, b) -> a - b;
        double resultS = subtraction.operate(num1, num2);
        System.out.println("Subtraction result: " + resultS);
    }
}
