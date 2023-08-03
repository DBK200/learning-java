package com.sessions.session9;

public class User {
    // Instance properties
    private String name;
    private int age;
    private String emai;
    private double balance;

    // Static variables
    private static int userCount = 0;
    private static double totalBalance = 0.0;

    // No-arg constructor
    public User(){
        userCount++;
    }
    // All-arg constructor
    public User(String name, int age,String emai, double balance){
        this.name = name;
        this.age = age;
        this.emai = emai;
        this.balance = balance;
        userCount++;
        totalBalance += balance;
        ;
    }
    // Static methods using static variables
    public static int getUserCount (){
        return userCount;
    }
    public static double getTotalBalance() {
        return totalBalance;
    }
    // Method using local and instance variables
    public void makePayment(double amount){
        balance -= amount;
        totalBalance -= amount;
        System.out.println("NAME : "+(name)+" |AGE :"+(age)+" |Email :"+(emai));
        System.out.println("Payment made: $" + amount);
        System.out.println("New Balance: $" + balance);
    }
    public void earnMoney(double amount){
        balance += amount;
        totalBalance += amount;
        System.out.println("NAME : "+(name)+" |AGE :"+(age)+" |Email :"+(emai));
        System.out.println("Earned: $"+ amount);
        System.out.println("New Balance: $"+ balance);
    }
    // Getters and setters for instance properties
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmai(){
        return emai;
    }
    public void setEmai(String emai){
        this.emai = emai;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
class Main {
    public static void main(String[] args) {
        // Creating a user object using the no-arg constructor
        User user = new User();
        user.setName("Alexandru Polli");
        user.setAge(32);
        user.setEmai("polli.alexandru@gmail.com");
        user.setBalance(1000.0);

        // Creating another user object using the all-arg constructor
        User user2 = new User("Jane Smith",25,"jane@gmail.com",1500.0);

        // Using instance methods
        user.makePayment(200.0);
        user2.earnMoney(500.0);

        // Using static methods
        System.out.println("Total Users: "+ user.getUserCount());
        System.out.println("Total Balance: $" + User.getTotalBalance());
    }
}
