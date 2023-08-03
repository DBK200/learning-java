package com.sessions.session9.Homework;

public class UserHomework {

    private String name;
    private String username;
    private String password;
    private int age;
    private String country;
    private int ID;
    private double balance;
    public static int totalAccessing = 0;
    public static String defaultUser = "user";
    public static double defaultBalance = 10.0;


    public UserHomework(){
        this.username = defaultUser;
        totalAccessing++;
    }

    public UserHomework(String name, String username, String password, int ID, int age, String country, double balance){
        this.name = name;
        this.username = username;
        this.password = password;
        this.ID = ID;
        this.age = age;
        this.country = country;
        this.balance = balance;
        totalAccessing ++;
    }

    public String printAllDetails(){
        return "Name: " + name+ "\n" + "Username: " + username +"\n" +
                "Password: " + password +"\n" + "Age: " + age +"\n" + "Country: " + country;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public static int getTotalAccessing(){
        return totalAccessing;
    }
    public static double getDefaultBalance(){
        return defaultBalance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
