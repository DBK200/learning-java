package com.sessions.patternsPractice.creational.builder;

public class Test {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUsername("john123")
                .setEmail("john@example.com")
                .setAge(25)
                .setAddress("123 Main St")
                .build();
    }
}
