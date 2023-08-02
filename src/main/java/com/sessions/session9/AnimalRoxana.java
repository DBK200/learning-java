package com.sessions.session9;

public class AnimalRoxana
{
    protected String name;
    protected int age;
    //fara sa setam propietatiile
    public AnimalRoxana()
    {

    }
    //sa setam propietatiile
    public AnimalRoxana(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setName(String name)//name este diferit de cel de sus,variabila locala
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }






}
