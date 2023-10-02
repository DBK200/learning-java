package com.sessions.session23.challenges.template;

import com.sessions.session21.challenges.ExceptionChallenge05;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;


/**
 * <h1>Calculator</h1>
 * <p>Class similar to {@link ExceptionChallenge05}, constructed using the TEMPLATE pattern.</p>
 * <p>The class supports internationalisation via properties files.</p>
 */
public class Calculator {

    private Arguments arguments;
    private Result result;
    private final Starter starter;
    private final ArgumentsValidator argumentsValidator;
    private final ResultCalculator resultCalculator;
    private final ResultPrinter resultPrinter;
    private final ExceptionPrinter exceptionPrinter;

    /**
     * Class constructor
     */
    public Calculator() {
        arguments = new Arguments();
        result = new Result();
        starter = new Starter(arguments);
        argumentsValidator = new ArgumentsValidator(arguments);
        resultCalculator = new ResultCalculator(arguments, result);
        resultPrinter = new ResultPrinter();
        exceptionPrinter = new ExceptionPrinter();
    }

    /**
     * {@code Calculator}'s start method with default lacalisation
     */
    public void start() {
        // Default localisation data
        String baseName = "i18n/Text";
        Locale locale = new Locale("ro", "RO");
        start(baseName, locale);
    }

    /**
     * {@code Calculator}'s start method with localisation arguments
     */
    public void start(String baseName, Locale locale) {

        Scanner sc = new Scanner(System.in);
        I18n i18n = new I18n(baseName, locale);

        while (true) {
            try {
                // 1. Start/stop operation
                if (starter.start(i18n)) break;

                // 2. Validates input arguments
                if (argumentsValidator.validateArguments(sc, i18n)) break;

                // 3. Calculates the result
                resultCalculator.calculate(i18n);

                // 4. Prints out the result
                resultPrinter.print(result.getMessageResult());
            }
            catch (RuntimeException e) {
                // 5. Prints out the exceptions
                exceptionPrinter.print(e);
            }
        }
    }
}

class Starter {
    private Arguments arguments;

    public Starter(Arguments arguments) {
        this.arguments = arguments;
    }

    public boolean start(I18n i18n) {

        // Resets the arguments everytime it starts
        arguments = new Arguments();

        if (i18n.getProperty("txtIntro") == null) return true;

        // Prints out the initial message
        System.out.print(i18n.getProperty("txtIntro"));
        return false;
    }
}

class ArgumentsValidator {
    private Arguments arguments;

    public ArgumentsValidator(Arguments arguments) {
        this.arguments = arguments;
    }

    public boolean validateArguments(Scanner sc, I18n i18n) throws RuntimeException {

        // Gets the trimmed user input
        String sInput = sc.nextLine().trim();

        // ENTER key pressed checking
        if (sInput.isEmpty()) throw new RuntimeException(i18n.getProperty("msgRunTimeNoArgs"));

        // QUIT checking
        else if (sInput.toUpperCase().charAt(0) == 'Q') {
            System.out.print(i18n.getProperty("txtOutro"));
            return true;
        }

        // Arguments checking
        else {
            // Gets the input into an array, trimming and replacing
            // in the process multiple white spaces with a space
            String[] arResult = sInput.trim().replaceAll("\\s+", " ").split("\\s");

            // The input has to have at least 2 elements (i.e., for 1 operand calculations)
            // otherwise, at least 3 elements.
            // What's beyond 3rd element is ignored.
            int iLength = arResult.length;
            NumberChecker nc = new NumberChecker();

            if (iLength >= 2) {

                // 1st operand validation
                if (nc.isNumber(arResult[0])) {
                    if (nc.isDouble(arResult[0])) arguments.setOperand1(Double.parseDouble(arResult[0]));
                    else throw new NumberFormatException(i18n.getProperty("msgNumFormatNumOverflow", arResult[0]));
                }
                else throw new NumberFormatException(i18n.getProperty("msgNumFormatWrongOperand",arResult[0]));

                // Operator validation
                if (new Operators().OPERATORS.contains(arResult[1].toLowerCase())) {
                    // Covers both cases, i.e., 1 or 2 operands calculations
                    if (iLength == 2 && arResult[1].equalsIgnoreCase("r")
                            || iLength >= 3)
                        arguments.setOperator(arResult[1].toLowerCase());

                    // Operator is OK, but 2nd operand is NULL
                    else throw new NumberFormatException(i18n.getProperty("msgNumFormatScndOperand"));
                }
                else throw new RuntimeException(i18n.getProperty("msgNumFormatWrongOperator", arResult[1]));

                // 2nd operand validation
                if (iLength >= 3) {
                    if (nc.isNumber(arResult[2])) {
                        if (nc.isDouble(arResult[2]))
                            arguments.setOperand2(Double.parseDouble(arResult[2]));
                        else throw new NumberFormatException(arResult[2] +
                                i18n.getProperty("msgNumFormatNumOverflow"));
                    }
                    else throw new NumberFormatException(i18n.getProperty("msgNumFormatWrongOperand",arResult[2]));
                }

                // Operation validations
                // Division by zero validation
                // Attention: 2nd operand is NULL in 2 arguments calculations
                if (arguments.getOperand2() != null
                        && arguments.getOperand2() == 0.0
                        && Objects.equals(arguments.getOperator(), "/"))
                    throw new ArithmeticException(i18n.getProperty("msgNumFormatZeroDivisor"));

                if (arguments.getOperand1() == 0.0
                        && arguments.getOperand2() != null
                        && arguments.getOperand2() < 0.0
                        && Objects.equals(arguments.getOperator(), "^"))
                    throw new ArithmeticException(i18n.getProperty("msgNumFormatDivByZero"));
            }

            // Wrong number of arguments passed
            else {
                throw new RuntimeException(i18n.getProperty("msgRunTimeWrongArgNum"));
            }
        }
        return false;
    }

    public void validateResult(BigDecimal numberValue, I18n i18n)
            throws NumberFormatException {
        // Type overflow validation
        if (! new NumberChecker().isDouble(numberValue.toString()))
            throw new NumberFormatException(i18n.getProperty("msgNumFormatTypeOverflow"));
    }
}

class ResultCalculator {
    private Arguments arguments;
    private Result result;
    private final int SCALE = 324;
    private final int SETPRECISION = 20;
    private final String PRECISION = "21.19g";

    public ResultCalculator(Arguments arguments, Result result) {
        this.arguments = arguments;
        this.result = result;
    }

    public BigDecimal power(Double base, Double exponent, I18n i18n) throws RuntimeException {

        boolean isExponentNegative = exponent < 0.0;

        if (base == 0.0 && isExponentNegative)
            throw new ArithmeticException(i18n.getProperty("msgNumFormatDivByZero"));

        BigDecimal bdResult = BigDecimal.valueOf(base).pow(Math.abs(exponent.intValue()));
        if (! new NumberChecker().isDouble(bdResult.toString()))
            throw new NumberFormatException(i18n.getProperty("msgNumFormatTypeOverflow"));

        return (isExponentNegative)
                ? BigDecimal.ONE.divide(bdResult, SCALE, RoundingMode.HALF_UP)
                : bdResult;
    }

    private TreeMap<String, BigDecimal> calculate(Arguments arguments, I18n i18n)  throws RuntimeException {

        BigDecimal bdOperand1 = BigDecimal.valueOf(arguments.getOperand1()),
                bdOperand2 = BigDecimal.valueOf((arguments.getOperand2() == null)
                        ? 0.0 : arguments.getOperand2());
        
        TreeMap<String, BigDecimal> tmResult = switch (arguments.getOperator()) {
            case "+" -> new TreeMap<>(Map.of(i18n.getProperty("lbAddition"), bdOperand1.add(bdOperand2)));
            case "-" -> new TreeMap<>(Map.of(i18n.getProperty("lbSubtraction"), bdOperand1.subtract(bdOperand2)));
            case "*" -> new TreeMap<>(Map.of(i18n.getProperty("lbMultiplication"), bdOperand1.multiply(bdOperand2)));
            case "/" -> new TreeMap<>(Map.of(i18n.getProperty("lbDivision"), bdOperand1.divide(bdOperand2, SCALE, RoundingMode.HALF_UP)));
            case "r" -> new TreeMap<>(Map.of(i18n.getProperty("lbSqRoot"), bdOperand1.sqrt(new MathContext(SETPRECISION))));
            default -> new TreeMap<>(Map.of(i18n.getProperty("lbPower"), power(arguments.getOperand1(), arguments.getOperand2(), i18n)));
        };

        return new TreeMap<>(tmResult);
    }

    public void calculate(I18n i18n) throws NumberFormatException {

        TreeMap<String, BigDecimal> tmResult = calculate(this.arguments, i18n);
        BigDecimal numberResult = tmResult.firstEntry().getValue();

        // Result Double overflow validation
        new ArgumentsValidator(this.arguments).validateResult(numberResult, i18n);

        String stringResult = String.format("%s: %" + PRECISION,
                tmResult.firstEntry().getKey(), numberResult);

        result.setNumberResult(numberResult)
                .setStringResult(numberResult.toString())
                .setMessageResult(stringResult);
    }
}

class ResultPrinter {
    public <T> void print(T message) {
        System.out.printf("┌%1$s┐%n│ %2$s │%n└%1$s┘%n%n",
                "─".repeat(message.toString().trim().length() + 2), message.toString().trim());
    }
}

class ExceptionPrinter extends ResultPrinter {

    // Overloads parent print() method
    public void print(Exception e) {
        super.print(String.format("%s: %s%n%n",
                e.getClass().getSimpleName(), e.getMessage()));
    }
}

class Arguments {
    private String operator;
    private Double operand1;
    private Double operand2;

    public Double getOperand1() {
        return operand1;
    }

    public Double getOperand2() {
        return operand2;
    }

    public String getOperator() {
        return operator;
    }

    public Arguments setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public Arguments setOperand1(double operand1) {
        this.operand1 = operand1;
        return this;
    }

    public Arguments setOperand2(double operand2) {
        this.operand2 = operand2;
        return this;
    }

    // Class objects viewer
    @Override
    public String toString() {
        return String.format("Arguments{operator: " + format(operator) +
                ", operand1: " + operand1 +
                ", operand2: " + operand2 +
                '}');
    }

    private String format(String text){
        return (text == null ? text : '\'' + text + '\'');
    }

}

class Result {
    private BigDecimal numberResult;
    private String stringResult;
    private String messageResult;

    public BigDecimal getNumberResult() {
        return numberResult;
    }

    public String getStringResult() {
        return stringResult;
    }

    public String getMessageResult() {
        return messageResult;
    }

    public Result setNumberResult(BigDecimal numberResult) {
        this.numberResult = numberResult;
        return this;
    }

    public Result setStringResult(String stringResult) {
        this.stringResult = stringResult;
        return this;
    }

    public Result setMessageResult(String messageResult) {
        this.messageResult = messageResult;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "numberResult = " + numberResult +
                ", stringResult = " + format(stringResult) +
                ", messageResult = " + format(messageResult) +
                '}';
    }

    private String format(String text){
        return (text == null ? text : "'" + text + "'");
    }

}

class Operators {
    public final List<String> OPERATORS = List.of("+", "-", "*", "/", "^", "r");
}

class NumberChecker {
    public boolean isDouble(String value) {
        BigDecimal bdValue = new BigDecimal(value.replace('-', '+'));
        return bdValue.subtract(BigDecimal.valueOf(Double.MIN_VALUE)).signum() >= 0
                && bdValue.subtract(BigDecimal.valueOf(Double.MAX_VALUE)).signum() <= 0
                || bdValue.signum() == 0;
    }

    public boolean isNumber(String value) {
        // [-+]? - [-] or [+], once or not at all

        // [0-9]* - [0]...[9], zero or more times {a}
        // ([0-9]*[.])? - {a} and [.], once or not at all

        // \\d+ - [0]...[9], one or more times

        // [eE][-+]? - [e] or [E] followed by [-] or [+], once or not at all {b}
        // \\d+ - [0]...[9], one or more times {c}
        // ([eE][-+]?\d+)? - {b} and {c}, once or not at all

        String sPattern = "[-+]?([0-9]*[.])?\\d+([eE][-+]?\\d+)?";

        return value.trim().matches(sPattern);
    }
}

class I18n {
    private String baseName;
    private Locale locale;
    private Map<String, String> properties;

    public I18n (String baseName, Locale locale) {
        this.baseName = baseName;
        this.locale = locale;
        properties = new TreeMap<>();
        try {
            setProperties(baseName, locale);
        }
        catch (MissingResourceException e) {
            new ExceptionPrinter().print(e);
        }
    }

    public <T> String getProperty(String key, T... values) throws NullPointerException {
        if (key == null) throw new NullPointerException();
        if (values.length == 0)
            return properties.get(key);
        else {
            String sResult = properties.get(key);
            if (sResult == null) return null;
            return (sResult.indexOf("%s") == -1)
                    ? sResult
                    : String.format(sResult, values[0]);
        }
    }

    private void setProperties(String baseName, Locale locale) throws MissingResourceException {
        // Gets app properties
        ResourceBundle bundle = ResourceBundle.getBundle(baseName, locale);
        Enumeration<String> keys = bundle.getKeys();
        while(keys.hasMoreElements()) {
            String key = keys.nextElement();
            this.properties.put(key, bundle.getString(key));
        }
    }
}

/**
 * <h1>Calculator Test</h1>
 * Testing class
 */
class CalculatorTest {
    public static void main(String[] args) {

        // Default language
        Calculator calculator1 = new Calculator();
        calculator1.start();

        // Custom language
        Calculator calculator2 = new Calculator();
        String baseName = "i18n/Text";
        Locale locale = Locale.getDefault();
        calculator2.start(baseName, locale);
    }
}