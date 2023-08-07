package com.sessions.session10.SessionCodeDP.EncapsulationDP;

public class UserProfileDP {

    private String firstName;
    private String lastName;

    private int id;
    private String username;
    private String email;


    public String getFirstName(){
        return this.firstName;
    }

    public int getId(){
        return this.id;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setId(int id){
        this.id=id;
    }
}
