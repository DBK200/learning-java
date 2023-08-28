package com.sessions.practice.building.entities;

import java.util.ArrayList;

public class ConstructorEngineer {
    private String name;
    private ArrayList<String> tasks;

    public ConstructorEngineer(String name){
        this.name = name;
    }

    // Getters and setters
    // Getters
    public String getName(){
        return name;
    }

    public ArrayList<String> getTasks(){
        return tasks;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setTasks(ArrayList<String> tasks){
        this.tasks = tasks;
    }

}
