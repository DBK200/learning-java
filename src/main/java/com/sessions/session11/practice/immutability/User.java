package com.sessions.session11.practice.immutability;

public final class User {
    // Immutable: won't change
    // Add FINAL keyword to disable the access/inheritance to the variable/class
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

class TestImmutable {

    public static void main(String[] args) {
        User user = new User("Mike");
        System.out.println("User name is: " + user.getName());
    }
}
