package com.sessions.session19.challenges;

import java.util.Arrays;
import java.util.Optional;

public class OptionalsUtils {
    private static long start = 0;
    private static long end = 0;

    static <T> String getOptionalValue(Optional<T> optional){
        return (optional.isPresent()) ? String.valueOf(optional.get()) : "Empty Optional";
    }

    static <T,U> void printOptional(T argument, Optional<U> method){
        System.out.printf("Optional value for input parameter [%s]: %s%n"
                        + "=".repeat(30) + "%n",
                (argument != null && argument.getClass().isArray())
                        ? Arrays.toString((Object[]) argument)
                        : null,
                getOptionalValue(method));
    }

    static void startStopwatch(){
        start = System.nanoTime();
        end = 0;
    }

    static void stopStopwatch(){
        end = System.nanoTime();
    }

    static double getStopwatch(){
        if (start == 0) return 0;
        if (end == 0) stopStopwatch();
        return (end - start)/1e+9;
    }

    static void printStopwatch(String message) {
        double duration = getStopwatch();
        StringBuilder sbResult = new StringBuilder();
        if (message.isBlank()) sbResult.append("Duration:");
        else sbResult.append(message);
        sbResult.append(" ").append(duration).append(" [s]\n");
        System.out.println(sbResult);
    }

}
