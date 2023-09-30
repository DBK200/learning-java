package com.sessions.session23.challenges.template;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;


/**
 * <h1>Calculator</h1>
 * <p>Class constructed using the TEMPLATE pattern</p>
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
     * {@code Calculator}'s start method
     */
    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean bStop = false;

        while (!bStop) {
            try {
                // 1. Start/stop operation
                starter.start("""
                    Please enter next 2 DOUBLE type operands and 1 operator,
                    separated by spaces [Q/q to quit].
                    (place them in the real sequence, e.g., a + b)
                                    
                    Possible operations:
                     1. Addition: +         │   4. Division: /
                     2. Subtraction: -      │   5. Power: ^
                     3. Multiplication: *   │   6. Square root: R,r
                                    
                     _✏️""");

                // 2. Validate input arguments
                if (bStop = argumentsValidator.validateArguments(sc)) break;

                // 3. Calculate the result
                resultCalculator.calculate();

                // 4. Print the result
                resultPrinter.print(result.getStringResult());
            }
            catch (RuntimeException e) {
                // 5. Print exceptions
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

    public void start(String message) {
        // Resets the arguments
        arguments = new Arguments();

        // Prints out the initial message
        System.out.print(message + '\t');
    }
}

class ArgumentsValidator {
    private Arguments arguments;

    public ArgumentsValidator(Arguments arguments) {
        this.arguments = arguments;
    }

    public boolean validateArguments(Scanner sc) throws RuntimeException {

        // Gets the trimmed user input
        String sInput = sc.nextLine().trim();

        // ENTER key pressed checking
        if (sInput.isEmpty()) throw new RuntimeException("Nothing entered.");

        // QUIT checking
        else if (sInput.toUpperCase().charAt(0) == 'Q') {
            System.out.print("\nBye \uD83D\uDC4B\n\n");
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
                    else throw new NumberFormatException(arResult[0] + " exceeds the range of type Double.");
                }
                else throw new NumberFormatException("Wrong operand '" + arResult[0] + "'.");

                // Operator validation
                if (new Operators().OPERATORS.contains(arResult[1].toLowerCase())) {
                    if (iLength == 2 && arResult[1].equalsIgnoreCase("r")
                            || iLength >= 3)
                        arguments.setOperator(arResult[1].toLowerCase());
                    // Operator is OK, but 2nd operand is NULL
                    else throw new NumberFormatException("Second operand can't be NULL.");
                }
                else throw new RuntimeException("Wrong operator '" + arResult[1] + "'.");

                // 2nd operand validation
                if (iLength >= 3) {
                    if (nc.isNumber(arResult[2])) {
                        if (nc.isDouble(arResult[2])) arguments.setOperand2(Double.parseDouble(arResult[2]));
                        else throw new NumberFormatException(arResult[2] + " exceeds the range of type Double.");
                    }
                    else throw new NumberFormatException("Wrong operand '" + arResult[2] + "'.");
                }

                // Operation validations
                // Division by zero validation
                // Attention: 2nd operand is NULL in 2 arguments calculations
                if (arguments.getOperand2() != null
                        && arguments.getOperand2() == 0.0
                        && Objects.equals(arguments.getOperator(), "/"))  throw new ArithmeticException("Divisor can not be 0.");

                if (arguments.getOperand1() == 0.0
                        && arguments.getOperand2() != null
                        && arguments.getOperand2() < 0.0
                        && Objects.equals(arguments.getOperator(), "^")) throw new ArithmeticException("Division by 0.");
            }

            // Wrong number of arguments passed
            else {
                throw new RuntimeException("Wrong number of arguments.");
            }
        }
        return false;
    }

    public void validateCalculation(TreeMap<String, BigDecimal> treeMap) throws NumberFormatException {
        String sDoubleResult = treeMap.firstEntry().getValue().toString();
        // Type overflow validation
        if (!(new NumberChecker()).isDouble(sDoubleResult))
            throw new NumberFormatException(sDoubleResult + " exceeds the range of type Double.");
    }

}

class ResultCalculator {
    private Arguments arguments;
    private Result result;
    private static final int SCALE = 324;

    public ResultCalculator(Arguments arguments, Result result) {
        this.arguments = arguments;
        this.result = result;
    }

    public BigDecimal power(Double base, Double exponent){

        boolean isExponentNegative = BigDecimal.valueOf(exponent).signum() == -1;

        if (BigDecimal.valueOf(base).signum() == 0 && isExponentNegative)
            throw new ArithmeticException("Division by 0.");

        BigDecimal bdResult = BigDecimal.valueOf(base).pow(Math.abs(exponent.intValue()));

        return (isExponentNegative)
                ? BigDecimal.ONE.divide(bdResult, SCALE, RoundingMode.HALF_UP)
                : bdResult;
    }

    private TreeMap<String, BigDecimal> calculate(Arguments arguments) {

        BigDecimal bdOperand1 = BigDecimal.valueOf(arguments.getOperand1()),
                bdOperand2 = BigDecimal.valueOf((arguments.getOperand2() == null)
                        ? 0.0 : arguments.getOperand2());

        TreeMap<String, BigDecimal> tmResult = switch (arguments.getOperator()) {
            case "+" -> new TreeMap<>(Map.of("Addition", bdOperand1.add(bdOperand2)));
            case "-" -> new TreeMap<>(Map.of("Subtraction", bdOperand1.subtract(bdOperand2)));
            case "*" -> new TreeMap<>(Map.of("Multiplication", bdOperand1.multiply(bdOperand2)));
            case "/" -> new TreeMap<>(Map.of("Division", bdOperand1.divide(bdOperand2, SCALE, RoundingMode.HALF_UP)));
            case "r" -> new TreeMap<>(Map.of("Square root", bdOperand1.sqrt(new MathContext(20))));
            default -> new TreeMap<>(Map.of("Power", power(arguments.getOperand1(), arguments.getOperand2())));
        };

        return new TreeMap<>(tmResult);
    }

    public void calculate() throws NumberFormatException {

        TreeMap<String, BigDecimal> tmResult = calculate(this.arguments);

        // Result overflow validation
        new ArgumentsValidator(this.arguments).validateCalculation(tmResult);

        Double doubleResult = tmResult.firstEntry().getValue().doubleValue();

        String stringResult = String.format("%s: " + ((Math.abs(doubleResult) < 1) ? "%7.5g" : "%.5f"),
                tmResult.firstEntry().getKey(), doubleResult);

        result.setDoubleResult(doubleResult).setStringResult(stringResult);
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

//    public Arguments(String operator, Double operand1, Double operand2) {
//        this.operator = operator;
//        this.operand1 = operand1;
//        this.operand2 = operand2;
//    }
//    public Arguments(String operator, Double operand1){
//        this(operator, operand1, null);
//    }
//
//    public Arguments(){}

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
    private Double doubleResult;
    private String stringResult;

    public Double getDoubleResult() {
        return doubleResult;
    }

    public String getStringResult() {
        return stringResult;
    }

    public Result setDoubleResult(Double doubleResult) {
        this.doubleResult = doubleResult;
        return this;
    }

    public Result setStringResult(String stringResult) {
        this.stringResult = stringResult;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "doubleResult = " + doubleResult +
                ", stringResult = " + format(stringResult) +
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


/**
 * <h1>Calculator Test</h1>
 */
class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.start();
        Calculator calculator2 = new Calculator();
        calculator2.start();
    }
}