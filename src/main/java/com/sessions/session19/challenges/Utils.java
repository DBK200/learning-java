package com.sessions.session19.challenges;

import java.util.Arrays;
import java.util.Optional;

public class Utils {

    public static Utils out = new Utils();

    @SafeVarargs
    public final <T> String getOptionalValue(Optional<T>... values){

        if (values == null || values.length == 0) return "[Empty Optional]";

        StringBuilder sbResult = new StringBuilder();

        for(Optional<T> element: values){
            sbResult.append(sbResult.isEmpty() ? "" : " and ")
                    .append(element.map(t -> "[".concat(String.valueOf(t)).concat("]")).orElse("[Empty Optional]"));
        }

        return sbResult.toString();
    }

    public <T,U> void printOptional(String message, T argument, Optional<U> method){

        if (message == null
                || message.isBlank()
                || !message.contains("%s")
                || message.indexOf("%s") == message.lastIndexOf("%s"))
            message = "Optional value for input parameter [%s] is %s";
        message += "%n" + "=".repeat(30) + "%n";

        String sArgument;

        if (argument != null) {
            if (argument.getClass().isArray())
                sArgument = Arrays.toString((Object[]) argument);
            else
                sArgument = argument.toString();
        }
        else sArgument = null;

        System.out.printf(message, sArgument, getOptionalValue(method));
    }

    public <T,U> void printOptional(T argument, Optional<U> method){
        printOptional(null, argument, method);
    }
}
