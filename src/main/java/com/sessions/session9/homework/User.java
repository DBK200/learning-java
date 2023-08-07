package com.sessions.session9.homework;

import java.util.Random;

public class User {

    private final static String INITIAL_USERNAME = "2dfg46ja81";
    private final static String INITIAL_PASSWORD = "2ha8202ks8";
    private String username;
    private String password;
    private int savedDataSizeGB;
    private int userIndex;

    static int numberOfUserAccounts = 0;

    {
        System.out.println("\nLog in with initial credentials\n");
        numberOfUserAccounts++;
        userIndex = numberOfUserAccounts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSavedDataSizeGB() {
        return savedDataSizeGB;
    }

    public void setSavedDataSizeGB(int savedDataSizeGB) {
        this.savedDataSizeGB = savedDataSizeGB;
    }

    public void printSavedDataSize(){
        System.out.println("User " + userIndex + " saved data memory size: " + savedDataSizeGB + "GB");
    }
    public void generateNewRandomPassword(){
        password = "";
        Random randomNumber = new Random();
        int alphabetIndex;
        String passwordAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMOPQSTUVWXYZ0123456789";
        for ( int i = 1; i <= 10; i++){
            alphabetIndex = randomNumber.nextInt(0,passwordAlphabet.length());
            password = password + passwordAlphabet.charAt(alphabetIndex);
        }
    }

    public User(){
        username = INITIAL_USERNAME;
        password = INITIAL_PASSWORD;
        savedDataSizeGB = 0;
    }

    public User(String username ,String password){
        this.username = username;
        this.password = password;
    }

    public User(String username ,String password ,int savedDataSizeGB){
        this.username = username;
        this.password = password;
        this.savedDataSizeGB = savedDataSizeGB;
    }

}
