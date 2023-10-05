package com.sessions.session25.practice.dependency_invertion_principle.after;

public class Book implements Product{

    private int price;

    public int getPrice(){
        return price = 100;
    }

}

class ComicBook implements Product{

    private int price = 10;

    public int getPrice(){
        return price;
    }

}
