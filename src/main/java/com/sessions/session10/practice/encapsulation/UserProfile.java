package com.sessions.session10.practice.encapsulation;

public class UserProfile {
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

}

class PracticeUserProfile {
    public static void main(String[] args) {
        UserProfile user = new UserProfile();
        System.out.println("Before setter: " + user.getFirstName());
        user.setFirstName("Alex");
        System.out.println("After setter: " + user.getFirstName());
    }
}
