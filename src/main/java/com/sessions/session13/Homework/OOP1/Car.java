package com.sessions.session13.Homework.OOP1;

public class Car
{
    //Car: Create a Car class that has the following attributes:
    // make, model, year, and color. Implement methods for starting
    //the car, stopping the car, accelerating, and braking.
    public String marca;
    public String model;
    public int year;
    public String color;

    Car(String marca,String model,int year,String color)
    {
        this.marca=marca;
        this.model=model;
        this.year=year;
        this.color=color;

    }
    //metoda pt a porni masina
    public  void startCar()
    {
          System.out.println("Masina a fost pornita");
    }
    //metoda pt a opri masina
    public void stopCar()
    {
        System.out.println("Masina a fost oprita");
    }
    //metoda pt a accelera masina
    public void accelereaza()
    {
        System.out.println("Masina accelereaza");
    }
    //metoda pt a frana
    public void franare()
    {
        System.out.println("Masina franeaza");
    }

    public static void main(String[] args)
    {
        Car car=new Car("BMW","X3",2007,"White");
        System.out.println("Marca:"+car.marca);
        System.out.println("Model:"+car.model);
        System.out.println("Year:"+car.year);
        System.out.println("Color:"+car.color);
        car.startCar();
        car.accelereaza();
        car.franare();
        car.stopCar();
    }

}
