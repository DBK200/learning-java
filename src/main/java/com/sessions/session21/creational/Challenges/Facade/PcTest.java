package com.sessions.session21.creational.Challenges.Facade;

public class PcTest {
    public static void main(String[] args) {
        StartService startService = new StartService();
        startService.startPc(true, true, true);

    }
}
