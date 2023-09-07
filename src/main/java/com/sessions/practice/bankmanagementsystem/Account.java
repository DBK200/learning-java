package com.sessions.practice.bankmanagementsystem;

public class Account {

    private String firstName;
    private String lastName;
    private String id;
    private double balance;
    private String passcode;


    // All args constructor
    public Account(String firstName, String lastName, String id, double balance, String passcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.balance = balance;
        this.passcode = passcode;
    }

    // Getters and setters
    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getPasscode() {
        return passcode;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
}

<<<<<<< HEAD

=======
//}
>>>>>>> 7a424397c0e74a3903dd0751ee27eb8f312e6470
