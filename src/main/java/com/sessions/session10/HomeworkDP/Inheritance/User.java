package com.sessions.session10.HomeworkDP.Inheritance;

public class User {

    private String email;
    private String password;

    private String name;
    private String address;



    protected User(String email, String password, String name, String address){
        this.email=email;
        this.password=password;
        this.name=name;
        this.address=address;
    }

    protected User(String email, String password, String name){
        this.email=email;
        this.password=password;
        this.name=name;
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void changePassword(String oldPassword,String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Your password has changed");
        }else{
            System.out.println("Old password incorrect. Password did not change");
        }
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(email);
        System.out.println("Address: "+address);

    }

}
