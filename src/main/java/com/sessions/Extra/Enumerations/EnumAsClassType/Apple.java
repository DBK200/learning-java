package com.sessions.Extra.Enumerations.EnumAsClassType;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(), Winesap(15), Cortland(8);

    private int price; //price of each apple

    //Constructor
    Apple(int price) {
        this.price = price;
    }

    //Overloaded constructos
    Apple() {
        this.price = -1;
    }

    //method
    int getPrice() {
        return price;
    }
}
