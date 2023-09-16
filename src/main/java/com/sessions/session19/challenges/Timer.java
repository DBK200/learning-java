package com.sessions.session19.challenges;

public class Timer {

    public static Timer out = new Timer();
    private long startTimer = 0;
    private long endTimer = 0;

     public void startStopwatch(){
        startTimer = System.nanoTime();
        endTimer = 0;
    }

    public void stopStopwatch(){
        endTimer = System.nanoTime();
    }

    public double getStopwatch(){
        if (startTimer == 0) return 0;
        if (endTimer == 0) stopStopwatch();
        return (endTimer - startTimer)/1e+9;
    }

    public void printStopwatch(String message) {
        double duration = getStopwatch();
        StringBuilder sbResult = new StringBuilder();
        if (message.isBlank()) sbResult.append("Duration:");
        else sbResult.append(message);
        sbResult.append(" ").append(duration).append(" [s]\n");
        System.out.println(sbResult);
    }

    public void printStopwatch() {
         printStopwatch("");
    }

}
