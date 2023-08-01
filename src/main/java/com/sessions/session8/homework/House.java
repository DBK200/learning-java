package com.sessions.session8.homework;

public class House {

    private int length;
    private int width;
    private int height;
    private int numberOfRooms;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void printHouseDimensions(){
        System.out.println("House dimensions: " + length + "x" + width + "x" + height);
    }

    public House(){
        length = 0;
        width = 0;
        height = 0;
        numberOfRooms = 0;
    }

}
