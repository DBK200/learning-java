package com.sessions.session12.Homework12;

public class User implements Roles{

    private String mail;
    private String password;
    @Override
    public String getRole() {
        return "User";
    }

    public User(String mail,String password){
        this.mail=mail;
        this.password=password;
    }
}
