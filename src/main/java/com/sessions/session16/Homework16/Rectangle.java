package com.sessions.session16.Homework16;


public class Rectangle {

    private int hcode;
    private double width;
    private double height;


    public Rectangle(int hcode, double width, double height) {
        this.hcode = hcode;
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object object){

        if (object==null){
            return false;
        }

        if (object==this){
            return true;
        }

        if(!(object instanceof Rectangle)){
            return false;
        }

        Rectangle rectangle=(Rectangle) object;
        return hcode== rectangle.hcode&&width== rectangle.width&&height== rectangle.height;
    }

    public int hashCode(){
        return hcode;
    }
}
