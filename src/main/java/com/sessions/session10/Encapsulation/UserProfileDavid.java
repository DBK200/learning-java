package com.sessions.session10.Encapsulation;

public class UserProfileDavid {
    private String firstName;
    private int id;
    private String username;
    private String lastName;
    private String email;



    public String getFirstName(){
        return firstName;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setId(int id){
        this.id=id;
    }
}
