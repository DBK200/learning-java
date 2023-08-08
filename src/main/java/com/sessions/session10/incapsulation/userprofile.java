package com.sessions.session10.incapsulation;

public class userprofile {
    private String firstname;
    private int id;
    private String username;
    private String lastName;
    private String email;

    public String getFirstname(){
        return firstname;
    }

    public int getId(){
        return id;
    }

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public void setId(int id){
        if(id<1){
            return;
        }
        this.id=id;
    }


}
