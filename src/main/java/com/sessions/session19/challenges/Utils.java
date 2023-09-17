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
            message = "Value for input %s is %s";
        message += "%n" + "=".repeat(30) + "%n";

        StringBuilder sbArgument = new StringBuilder();

        if (argument != null) {
            if (argument.getClass().isArray())
                sbArgument.append(Arrays.toString((Object[]) argument));
            else {
                sbArgument.append(argument.toString());
                if (!sbArgument.toString().contains("[")) sbArgument.insert(0,"[").append("]");
            }
        }
        else sbArgument = null;

        System.out.printf(message, sbArgument, getOptionalValue(method));
    }

    public <T,U> void printOptional(T argument, Optional<U> method){
        printOptional(null, argument, method);
    }
}
