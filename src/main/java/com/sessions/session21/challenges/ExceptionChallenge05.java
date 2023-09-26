package com.sessions.session21.challenges;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;

/**
 * <h1>Challenge 5</h1>
 * <p>Create a simple calculator that handles exceptions for invalid input and arithmetic errors.</p>
 *
 * <p><b>Requirements:</b>
 * <ul>
 *     <li>Create a method called {@code calculate} that takes two double operands and a char operator as parameters.<br>
 *     This method should perform the specified operation and return the result.</li>
 *     <li>Handle the following exceptions within the calculate method:</li>
 *         <ol>
 *             <li>ArithmeticException for division by zero.</li>
 *             <li>IllegalArgumentException for an invalid operator.</li>
 *             <li>In the main method, prompt the user to enter two numbers and an operator.</li>
 *         </ol>
 *     <li>Use a {@code try-catch} block to handle possible exceptions, such as {@link NumberFormatException}
 *     from invalid input, and any exceptions thrown by the {@code calculate} method.</li>
 *     <li>Display the result of the calculation or an appropriate error message based on the exception caught.</li>
 * </ul></p>
 */
public class ExceptionChallenge05 {
    private enum LANGUAGES {EN, RO}
    private static String[] messages;
    private static final int SCALE = 300;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        //Exception throwing test: IOException
        //boolean bStop = Tools.out(new StringBuilder("Messages_RO.txt")).stopped();
        boolean bStop = Tools.out("EN").stopped();

        while(!bStop) {
            try {
                Tools.out().calculator(sc);
                bStop = Tools.out().stopped();
            }
            catch (RuntimeException e) {
                Tools.out().formatOutput(e);
                bStop = Tools.out().stopped();
            }
        }
    }
}



/**
 * <h1>Utility class</h1>
 * <p>Singleton class with all the methods needed for the {@code Calculator} challenge</p>
 */
class Tools{
    private static Tools instance;
    private String[] messages;
    private enum LANGUAGES {EN, RO};
    private final int SCALE = 300;
    private boolean stop = false;

    private Tools(String language, StringBuilder... path){

        if (path.length == 0) {
            path = new StringBuilder[1];
            path[0] = new StringBuilder(String.format("src/main/java/com/sessions/session21/challenges/Messages_%s.txt",
                    language.toUpperCase()));
        }

        try {
            this.messages = getAppMessages(path[0].toString());
            if (this.messages == null) throw new IOException("Source file not found.");
        }
        catch (RuntimeException | IOException e) {
            formatOutput(e);
            stop = true;
        }
    }


    public boolean stopped() {
        return stop;
    }

    public static synchronized Tools out(String language, StringBuilder ... path){
        if (instance == null)
            instance = new Tools((Arrays.stream(LANGUAGES.values()).noneMatch(s -> Objects.equals(s.name(), language)))
                    ? "EN" : language, path);
        return instance;
    }

    public static synchronized Tools out(StringBuilder... path){
        return out("RO", path);
    }

    public void calculator(Scanner sc) throws RuntimeException {

        // List of operators
        final List<Character> OPERATORS = List.of('+', '-', '*', '/', '^', 'r');

        while (true) {
            // Initial console message
            System.out.print(messages[0] + "\t");

            String sResponse = sc.nextLine();
            if (sResponse.isEmpty()) throw  new RuntimeException(messages[1]);
            else if (sResponse.toUpperCase().charAt(0) == 'Q') {
                stop = true;
                sc.close();
                break;
            }

            // Gets the input into an array, trimming and replacing
            // in the process multiple white spaces with a space
            String[] arResult = sResponse.trim().replaceAll("\\s+", " ").split("\\s");

            // Number of entries validation
            if (arResult.length >= 2 && arResult[1].length() == 1) {
                formatOutput(arResult, OPERATORS);
            }
            else {
                throw new RuntimeException(addInMessage(arResult.length, messages[2], -4));
            }
        }
    }

    public TreeMap<String, BigDecimal> calculate(Double operand1, Double operand2, char operator)
            throws RuntimeException {

        // Division by 0 validation
        if (operand2 != null
                && operand2 == 0.0
                && operator == '/') throw new ArithmeticException(messages[3]);

        BigDecimal bdOperand1 = BigDecimal.valueOf(operand1),
                bdOperand2 = BigDecimal.valueOf((operand2 == null) ? 0.0 : operand2);

        // Converts operator to lower-case
        operator = Character.toLowerCase(operator);

        TreeMap<String, BigDecimal> tmResult = switch (operator) {
            case '+' -> new TreeMap<>(Map.of(messages[4], bdOperand1.add(bdOperand2)));
            case '-' -> new TreeMap<>(Map.of(messages[5], bdOperand1.subtract(bdOperand2)));
            case '*' -> new TreeMap<>(Map.of(messages[6], bdOperand1.multiply(bdOperand2)));
            case '/' -> new TreeMap<>(Map.of(messages[7], bdOperand1.divide(bdOperand2, SCALE, RoundingMode.HALF_UP)));
            case 'r' -> new TreeMap<>(Map.of(messages[8], bdOperand1.sqrt(new MathContext(20))));
            default -> new TreeMap<>(Map.of(messages[9], power(operand1, operand2)));
        };

        // Type overflow validation
        Double dRes = tmResult.firstEntry().getValue().doubleValue();
        if (Double.isInfinite(dRes))
            throw new NumberFormatException(messages[10]);

        return new TreeMap<>(tmResult);
    }

    public BigDecimal power(Double base, Double exponent){

        boolean isExponentNegative = BigDecimal.valueOf(exponent).signum() == -1;

        if (BigDecimal.valueOf(base).signum() == 0 && isExponentNegative)
            throw new ArithmeticException(messages[3]);

        BigDecimal bdResult = BigDecimal.valueOf(base).pow(Math.abs(exponent.intValue()));

        return (isExponentNegative)
                ? BigDecimal.ONE.divide(bdResult, SCALE, RoundingMode.HALF_UP)
                : bdResult;
    }

    public void formatOutput(String[] arValues, List<Character> operators) throws RuntimeException{

        Double dOperand1 = Double.parseDouble(arValues[0]),
                dOperand2 = (arValues.length >= 3) ? Double.parseDouble(arValues[2]) : null;

        // Gets the operator converted to lower-case
        char chOperator = arValues[1].toLowerCase().charAt(0);
        if (!operators.contains(chOperator))
            throw new IllegalArgumentException(addInMessage(chOperator, messages[11], -2));
        else {
            if (arValues.length == 2 && chOperator != 'r')
                throw new IllegalArgumentException(addInMessage(chOperator, messages[12], -3));
        }

        Map.Entry<String, BigDecimal> entryResult = calculate(dOperand1, dOperand2, chOperator).firstEntry();

        String sNumberFormat = (Math.abs(entryResult.getValue().doubleValue()) < 1) ? "%7.5g" : "%.5f";
        String sResponse = String.format("%s:  " + sNumberFormat,
                entryResult.getKey(), entryResult.getValue());

        printTable(sResponse);
    }

    public void formatOutput(Exception e){

        String sResponse = String.format("%s: %s%n%n",
                e.getClass().getSimpleName(), e.getMessage());

        printTable(sResponse);
    }

    public void printTable(String message) {
        System.out.printf("┌%1$s┐%n│ %2$s │%n└%1$s┘%n%n",
                "─".repeat(message.trim().length() + 2), message.trim());
    }

    public String[] getAppMessages(String path){
        // This will automatically close the resource at the end
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {
            String line;
            StringBuilder sbResult = new StringBuilder();
            boolean bAppend = false;

            while((line = reader.readLine()) != null) {
                if (bAppend) sbResult.append(line).append("\n");
                if (!line.isEmpty()
                        && line.length() >= 3
                        && line.substring(0, 3).equalsIgnoreCase("<p>"))
                    bAppend = true;
                if (!line.isEmpty()
                        && line.length() >= 4
                        && line.substring(0, 4).equalsIgnoreCase("</p>"))
                    bAppend = false;
            }
            return sbResult.toString().split("\\n</p>\\n");
        }
        catch (IOException e){
//            System.out.println("Source file not found.");
            return null;
        }
    }

    public <T> String addInMessage(T value, String message, int position, String... exceptionMessages) throws RuntimeException{

        // Exception messages validation
        if (exceptionMessages == null
                || exceptionMessages.length == 0) {
            exceptionMessages = new String[]{"No message available.", "Wrong insert position."};
        }

        // Message validation
        if (message == null || message.isEmpty())
            throw new RuntimeException(exceptionMessages[0]);

        // Insertion point validation
        if (Math.abs(position) > message.length())
            throw new RuntimeException(exceptionMessages[1]);

        StringBuilder sbResult = new StringBuilder(message);

        // A negative position number means that the position
        // will be determined counting from the end
        if (position < 0) position = sbResult.length() + position;

        return sbResult.insert(position, value.toString()).toString();
    }
}