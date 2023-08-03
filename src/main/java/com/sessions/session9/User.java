package com.sessions.session9;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private String email;
    private boolean isImported;
    private static int listId = 121;
    private static String listName = "General users";
    public User() {

    }
    public User(int id, String name, String email, boolean isImported) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isImported = isImported;
    }
    public int getListId() {
        return listId;
    }
    public String getListName() {
        return listName;
    }
    public void printUserData(LocalDate date){
        System.out.println("Date: " + date);
        System.out.println("User Id: " + this.id);
        System.out.println("User Name: " + this.name);
        System.out.println("User Email: " + this.email);
        System.out.println("User isImported: " + this.isImported);
    }
}
