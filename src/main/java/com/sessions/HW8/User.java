package com.sessions.HW8;
/* Cerinta:


 */
public class User {
    // Instance properties
    private String username;
    private String email;
    private int age;
    private boolean isActive;
    private String country;

    private static int totalUsers;
    private static int activeUsers;

    public User() {
        System.out.println("Acesta este No Arg Constructor");
    }

    public User(String username, String email, int age, boolean isActive, String country) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.isActive = isActive;
        this.country = country;

        totalUsers++; // Increment totalUsers when a new User is created
        if (isActive) {
            activeUsers++; // Increment activeUsers if the User is active
        }
    }

    public static int getTotalUsers() {
        return totalUsers;
    }
    public static int getActiveUsers() {
        return activeUsers;
    }

    public static void printUserStats() {
        System.out.println("Total users: " + getTotalUsers());
        System.out.println("Active users: " + getActiveUsers());
    }

    public void printUserInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
        System.out.println("Age: " + this.age);
        System.out.println("Country: " + this.country);
        String statusMessage = isActive ? "Active" : "Inactive";
        System.out.println("Status: " + statusMessage);
    }
    public void setStatus(boolean isActive) {
        this.isActive = isActive;

        if (isActive) {
            activeUsers++;
        } else {
            activeUsers--;
        }
    }
    public static void main(String[] args) {
        User user1 = new User("Andrei", "andrei1997@gmail.com", 30, true, "Romania");
        User user2 = new User("Ionuth", "ionut@yahoo.com", 25, false, "Romania");

        User.printUserStats(); // Total users: 2, Active users: 1

        user1.printUserInfo(); // Prints user1's information
        user2.printUserInfo(); // Prints user2's information

        user1.setStatus(false); // Set user1's status to inactive
        User.printUserStats(); // Total users: 2, Active users: 0
    }
}
