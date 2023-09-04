package com.sessions.session15.Homework.Challange5;

import java.util.Collections;
import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int id;

    public Product (String name, int price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Product product)){
            return false;
        }
        return id == product.id;
    }
    public int hashCode(){
        return Objects.hash(id);
    }
    public void setId(int id){
        this.id = id;
    }
}
