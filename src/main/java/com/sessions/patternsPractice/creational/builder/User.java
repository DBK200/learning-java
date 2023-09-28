package com.sessions.patternsPractice.creational.builder;

public class User {
    private final String username;
    private final String email;
    private final int age;
    private final String address;

    private User(UserBuilder userBuilder) {
        this.username = userBuilder.username;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private String username;
        private String email;
        private int age;
        private String address;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
