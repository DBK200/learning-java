package com.sessions.session1;

import com.sessions.session8.Car;

public class TemaSession1 {

    public static class Product{

        private String brandname;
        private int price;
        private boolean isnew;
        private double size;
        private char energy;

        private String getBrandname(){
            return brandname;
        }
        private void setBrandname(String brandname){
            this.brandname= brandname;
        }
        private int getPrice(){
            return price;
        }
        private void setPrice(int price){
            this.price=price;
        }
        private boolean getIsnew(){
            return isnew;
        }
        private void setIsnew(boolean isnew){
            this.isnew=isnew;
        }
        private double getSize(){
            return size;
        }
        private void setSize(double size){
            this.size=size;
        }
        private char getEnergy(){
            return energy;
        }
        private void setEnergy(char energy){
            this.energy=energy;
        }
    }

    public static void main(String[] args) {
        Product myWasher=new Product();
        Product myCar=new Product();
        {
            myWasher.setBrandname("Whirlpool");
            myWasher.setPrice(200);
            myWasher.setIsnew(true);
            myWasher.setSize(1.5);
            myWasher.setEnergy('A');
        }
        {
            myCar.setBrandname("Hyundai");
            myCar.setPrice(1000);
            myCar.setIsnew(false);
            myCar.setSize(9.3);
            myCar.setEnergy('G');
        }
        {
            System.out.println("BRAND"+":"+myWasher.getBrandname());
            System.out.println("COST Only"+":"+myWasher.getPrice()+" "+"Euro");
            System.out.println("NEW WASHER"+":"+myWasher.getIsnew());
            System.out.println("Lenght"+":"+myWasher.getSize()+"m");
            System.out.println("Energy CLASS IS"+":"+myWasher.getEnergy()+"+");
            System.out.println("---------------------------------------------");
        }
        {
            System.out.println("BRAND"+":"+myCar.getBrandname());
            System.out.println("COST Only"+":"+myCar.getPrice()+" "+"Euro");
            System.out.println("NEW WASHER"+":"+myCar.getIsnew());
            System.out.println("Lenght"+":"+myCar.getSize()+"m");
            System.out.println("Car runs on"+":"+myCar.getEnergy()+"as");
            System.out.println("---------------------------------------------");
        }
    }

}



