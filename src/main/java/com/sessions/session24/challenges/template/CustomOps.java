package com.sessions.session24.challenges.template;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.List;

/**
 * <h1>Abstract TEMPLATE class</h1>
 * The class implements the {@code final} {@link CustomOps#operateAll(Collection) operateAll(Collection)} method
 * that uses the abstract method {@link CustomOps#operate(Number, Number) operate(Number, Number)}.
 */
public abstract class CustomOps {

    abstract BigDecimal operate(Number operand1, Number operand2);

    public final BigDecimal operateAll(Collection<? extends Number> collection)
            throws NullPointerException, ArithmeticException {

        if (collection.isEmpty()) throw new NullPointerException("Empty collection.");
        if (collection.size() == 1) return new BigDecimal(String.valueOf(collection.iterator().next()));

        BigDecimal result = null;

        for(Number value: collection) {
           if (result == null) result = new BigDecimal(String.valueOf(value));
           else result = operate(result, new BigDecimal(String.valueOf(value)));
        }
        return result;
    }

    public final CustomOps print(BigDecimal result) {
        System.out.printf("%12.20g%n", result);
        return this;
    }
}


/**
 * <h1>Multiplication class</h1>
 * This class implements the multiplication operation, and because extends {@link CustomOps} class,
 * also gives access to {@link CustomOps#operateAll(Collection) operateAll(Collection)} method, that
 * in this case will multiply given arguments.
 */
class MultiplicationOps extends CustomOps {

    @Override
    BigDecimal operate(Number operand1, Number operand2) {
        BigDecimal bdOperand1 = new BigDecimal(String.valueOf(operand1)),
                bdOperand2 = new BigDecimal(String.valueOf(operand2));

        return bdOperand1.multiply(bdOperand2);
    }
}

/**
 * <h1>Division class</h1>
 * This class implements the division operation, and because extends {@link CustomOps} class,
 * also gives access to {@link CustomOps#operateAll(Collection) operateAll(Collection)} method, that
 * in this case will divide given arguments.
 */
class DivisionOps extends CustomOps {
    private final int SCALE;

    DivisionOps(int scale) {
        SCALE = scale;
    }

    DivisionOps(){
        SCALE = 20;
    }

    @Override
    BigDecimal operate(Number operand1, Number operand2) {

        if (operand1 == null || operand2 == null) throw new NullPointerException("Null operands.");
        if(operand2.equals(0) || operand2.equals(0.0)) throw new ArithmeticException("Divisor is 0.");

        BigDecimal bdOperand1 = new BigDecimal(String.valueOf(operand1)),
                bdOperand2 = new BigDecimal(String.valueOf(operand2));

        return bdOperand1.divide(bdOperand2, SCALE, RoundingMode.HALF_UP);
    }
}


/**
 * <h1>Testing class</h1>
 */
class TestOp {

    public static void main(String[] args) {

        CustomOps div = new DivisionOps(324);
        div.print(div.operateAll(List.of(1.0234e25, 100, 200, 300, 400.22)));

        CustomOps multiply = new MultiplicationOps();
        multiply.print(multiply.operateAll(List.of(2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192)));
    }
}



