package com.sessions.session15.Homework.Challange1;

import java.util.Objects;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Rectangle rectangle)){
            return false;
        }
        return height == rectangle.height && width == rectangle.width;
    }
    public int hashCode(){
        return Objects.hash(width, height);
    }
}
