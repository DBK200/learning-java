package com.sessions.session19.challenges;

import java.util.Arrays;
import java.util.Optional;

public class Utils {

    /**
     * Used to get access to public class methods
     */
    public static final Utils out = new Utils();

    private Utils(){}

// Singleton: it has to be used as a method
//    private static Utils instance;
//
//    private Utils(){}
//
//    public static synchronized Utils out(){
//        if (instance == null) instance = new Utils();
//        return instance;
//    }

    /**
     * Returns the string value representation of passed argument(s).
     *
     * @param values {@link Optional} class argument(s)
     * @param T      The type of the {@code Optional} argument(s)
     * @return The string value representation of the argument(s)
     */
    @SafeVarargs
    public final <T> String getOptionalValue(Optional<T>... values){

        if (values == null || values.length == 0) return "[Empty Optional]";

        StringBuilder sbResult = new StringBuilder();

        for(Optional<T> element: values){
            sbResult.append(sbResult.isEmpty() ? "" : " and ")
                    .append(element.map(t -> "[".concat(String.valueOf(t)).concat("]"))
                                   .orElse("[Empty Optional]"));
        }

        return sbResult.toString();
    }

    /**
     * Prints out in the console the result of {@code method} parameter, using the message
     * passed by the user in the {@code message} parameter.
     *
     * @param message  The message shown in the console
     * @param argument Input argument for the parameter {@code method}
     * @param method   The method for which the result is to be printed out
     * @param T        The type of the {@code argument} parameter
     * @param U        The type of the {@code method} parameter
     */
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
        else sbArgument.append("[null]");

        System.out.printf(message, sbArgument, getOptionalValue(method));
    }

    /**
     * Prints out in the console the result of {@code method} parameter
     * using a default message.
     *
     * @param argument Input argument for the parameter {@code method}
     * @param method   The method for which the result is to be printed out
     * @param T        The type of the {@code argument} parameter
     * @param U        The type of the {@code method} parameter
     */
    public <T,U> void printOptional(T argument, Optional<U> method){
        printOptional(null, argument, method);
    }
}
