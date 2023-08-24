package com.sessions.session12.Homework.Challange2.Model;

import java.time.LocalDate;

public class Employee {

    private int employeeID; //unique id
    private  String firstName;
    private String lastName;
    private String email;  //email of employee
    private String address; //address of employee
    private LocalDate birthdate;
    private LocalDate hiredDate;

    private LocalDate contractExpirationDate; //can be null

    private Role role;

    public Employee(int employeeID,String firstName, String lastName, String email, String address,
                    LocalDate birthdate, LocalDate hiredDate,LocalDate contractExpirationDate, Role role){

       this.employeeID=employeeID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.address=address;
        this.birthdate=birthdate;
        this.hiredDate=hiredDate;
        this.contractExpirationDate=contractExpirationDate;
        this.role=role;
    }

    public Employee(int employeeID,String firstName, String lastName, String email, String address,
                    LocalDate birthdate, LocalDate hiredDate, Role role){

        this.employeeID=employeeID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.address=address;
        this.birthdate=birthdate;
        this.hiredDate=hiredDate;
        this.contractExpirationDate=null;
        this.role=role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContractExpirationDate(LocalDate contractExpirationDate) {
        this.contractExpirationDate = contractExpirationDate;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFullName(){
        return firstName+" "+lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public LocalDate getContractExpirationDate() {
        return contractExpirationDate;
    }


    public String getSimplifiedEmployeeInfo(){
        String result=String.format("%8d %20s %22s ",employeeID,getFullName(),
                role);

        return result;
    }


    public String toString(){


        String result=String.format("%8d %10s %10s %22s %35s %13s %13s %13s",employeeID,firstName,
                lastName,role,email,address,birthdate,hiredDate,contractExpirationDate);

        return result;
    }

}
