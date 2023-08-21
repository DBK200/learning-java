package com.sessions.session12.HomeworkAV.challenge1.example3;

public class Application {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();

        Primate primate = lemur;
        //Lemur lemur2 = primate; //does not compile

        Lemur lemur3 = (Lemur) primate;
        System.out.println(lemur3.age);
    }
}
