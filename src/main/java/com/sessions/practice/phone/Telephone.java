package com.sessions.practice.phone;

public interface Telephone {

    // Abstract methods

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
