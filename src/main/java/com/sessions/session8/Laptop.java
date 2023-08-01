package com.sessions.session8;

public class Laptop {

    private String brand;
    private double price;
    private int memory;

    public Laptop(String brand, double price, int memory)
    {
        this.brand=brand;
        this.price=price;
        this.memory=memory;
    }

    int x=1;
    public void startButton(){


        if(x==1)
        {
            System.out.println("Laptopul a fost pornit");
            x=0;
        }
        else if(x==0){
            System.out.println("Laptopul a fost oprit");
            x=1;
        }

    }

}
