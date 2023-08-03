package com.sessions.session9;

public class User {
    private String name;
    private int age;
    private String emai;
    private double balance;

    private static int userCount = 0;


    public User(){
        userCount++;
    }

    public User(String name, int age,String emai, double balance){
        this.name = name;
        this.age = age;
        this.emai = emai;
        this.balance = balance;
        userCount++;
        ;
    }

    public static int getUserCount (){
        return userCount;
    }
    public void makePayment(double amount){
        balance -= amount;
        System.out.println("NAME : "+(name)+" |AGE :"+(age)+" |Email :"+(emai));
        System.out.println("Payment made: $" + amount);
        System.out.println("New Balance: $" + balance);
    }
    public void earnMoney(double amount){
        balance += amount;
        System.out.println("NAME : "+(name)+" |AGE :"+(age)+" |Email :"+(emai));
        System.out.println("Earned: $"+ amount);
        System.out.println("New Balance: $"+ balance);
    }
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
        User user = new User();
        user.setName("Alexandru Polli");
        user.setAge(32);
        user.setEmai("polli.alexandru@gmail.com");
        user.setBalance(1000.0);

        User user2 = new User("Jane Smith",25,"jane@gmail.com",1500.0);

        user.makePayment(200.0);
        user2.earnMoney(500.0);

        System.out.println("Total Users: "+ user.getUserCount());
    }
}
