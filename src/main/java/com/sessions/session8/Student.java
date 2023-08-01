package com.sessions.session8;

public class Student {

    private String nume;
    private  int medie;


    public Student(String nume,int medie){
        this.nume=nume;
        this.medie=medie;

    }

    public String promovare() {
        if(medie<5)
            return "Studentul nu a promovat";
        else
            return "Studentul a promovat";

    }


}
