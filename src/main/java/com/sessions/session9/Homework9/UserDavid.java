package com.sessions.session9.Homework9;


public class UserDavid {

    private String name;
    private int id;
    private int age;
    private char fathersInitial;
    private boolean employee;

    public UserDavid(){

    }

    public UserDavid(String name,int id,int age,char fathersInitial,boolean employee){
        this.name=name;
        this.id=id;
        this.age=age;
        this.fathersInitial=fathersInitial;
        this.employee=employee;
    }

    private static int luckyNumber=0;
    private  static String password="*****";


    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showDate(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Age: "+age);
        System.out.println("Father's initial: "+fathersInitial);
        System.out.println("Lucky Number: "+luckyNumber);
        if(employee==true)
            System.out.println("Is employed");
        else
            System.out.println("Is not employed");
    }
}
