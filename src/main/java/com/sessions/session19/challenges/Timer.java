package com.sessions.session19.challenges;

public class Timer {

    public static final Timer out = new Timer();
    private long startTimer = 0;
    private long endTimer = 0;

    /**
     * Starts the Stopwatch, setting up the {@link Timer#startTimer start}
     * and {@link Timer#endTimer end} values.
     */
     public void startStopwatch(){
        startTimer = System.nanoTime();
        endTimer = 0;
    }

    /**
     * Stops the Stopwatch.
     */
    public void stopStopwatch(){
        endTimer = System.nanoTime();
    }

    /**
     * Gets the Stopwatch duration.
     * @return The duration in seconds returned by the Stopwatch.
     */
    public double getStopwatch(){
        if (startTimer == 0) return 0;
        if (endTimer == 0) stopStopwatch();
        return (endTimer - startTimer)/1e+9;
    }

    /**
     * Prints out the Stopwatch duration along with a message.
     * @param message The message to be printed out along with the Stopwatch duration.
     */
    public void printStopwatch(String message) {
        double duration = getStopwatch();
        StringBuilder sbResult = new StringBuilder();
        if (message.isBlank()) sbResult.append("Duration:");
        else sbResult.append(message);
        sbResult.append(" ").append(duration).append(" [s]\n");
        System.out.println(sbResult);
    }

    /**
     * Prints out the Stopwatch duration along with the default message.
     */
    public void printStopwatch() {
         printStopwatch("");
    }

}
