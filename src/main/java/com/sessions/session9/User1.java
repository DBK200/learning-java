package com.sessions.session9;

/*public class User1 {
    // Instance properties
    private String name;
    private int age;
    private String email;
    private boolean isActive;
    private double balance;

    // Static variables
    private static int userCount = 0;
    private static double totalBalance = 0.0;

    // No-arg constructor
    public User1() {
        userCount++;
    }

    // All-arg constructor
    public User1(String name, int age, String email, boolean isActive, double balance) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
        this.balance = balance;
        userCount++;
        totalBalance += balance;
    }

    // Static methods using static variables
    public static int getUserCount() {
        return userCount;
    }

    public static double getTotalBalance() {
        return totalBalance;
    }

    // Method using local and instance variables
    public void makePayment(double amount) {
        if (amount > 0 && isActive && balance >= amount) {
            balance -= amount;
            totalBalance -= amount;
            System.out.println("Payment made: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid payment amount. Amount must be positive.");
        } else if (!isActive) {
            System.out.println("Payment failed. The account is inactive.");
        } else {
            System.out.println("Payment failed. Insufficient balance.");
        }
    }

    // Another method using local and instance variables
    public void earnMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            totalBalance += amount;
            System.out.println("Earned: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid earning amount. Amount must be positive.");
        }
    }

    // Getters and setters for instance properties
    // (You can generate these automatically in some IDEs)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class Main {
    public static void main(String[] args) {
        // Creating a user object using the no-arg constructor
        User1 user1 = new User1();
        user1.setName("John Doe");
        user1.setAge(30);
        user1.setEmail("john@example.com");
        user1.setActive(true);
        user1.setBalance(1000.0);

        // Creating another user object using the all-arg constructor
        User1 user2 = new User1("Jane Smith", 25, "jane@example.com", true, 1500.0);

        // Using instance methods
        user1.makePayment(200.0);
        user2.earnMoney(500.0);

        // Using static methods
        System.out.println("Total Users: " + User1.getUserCount());
        System.out.println("Total Balance: $" + User1.getTotalBalance());
    }
}
*/