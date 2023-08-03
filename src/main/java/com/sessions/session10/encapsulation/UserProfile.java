package com.sessions.session10.encapsulation;

public class UserProfile {

    private String firstName;
    private int id;
    private String username;
    private String lastName;
    private String email;

    UserProfile(){
    }

    // Getters and setters
    //Getters
    // Getter-ul nu are parametru de intrare pentru ca el doar returneaza ceva
    public String getFirstName(){
        return firstName;
    }

    public int getId(){
        return id;
    }

    // Setters - nu returneaza nimic pentru ca doar seteaza ceva

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setId(int id){
        if(id < 1){
            return;
        }
        this.id = id;
    }
}
