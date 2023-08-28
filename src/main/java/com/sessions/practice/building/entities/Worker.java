package com.sessions.practice.building.entities;

import java.util.ArrayList;

public class Worker {
    private String name;
    private ArrayList<String> tasks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    // Cum fac o diferenta intre variabilele de initializat in constructor si celelalte ?
    public Worker(String name){
        this.name = name;
    }
    // Methods ??
    // ce fac oamenii astia?
}
