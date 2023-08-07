package com.sessions.session10.Encapsulation;

public class UserProfile {

    private String firstName;
    private int id;
    private String username;
    private String lastName;
    private String email;

    UserProfile(){

    }


    public String getFirstName(){
        return firstName;
    }

    public int getId(){
        return id;
    }
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
