package com.sessions.session25.challenges.solid1;

import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.Objects;
import java.util.Scanner;

/**
 * <h1>SOLID Challenge</h1>
 * <p>Given <b><i>2</i></b> BitSets, <b><i>B<sub>1</sub></i></b> and <b><i>B<sub>2</sub></i></b>,
 * of size <b><i>N</i></b> where all bits in both BitSets are initialized to <b><i>0</i></b>,
 * perform a series of <b><i>M</i></b> operations.<br>
 * After each operation, print the number of set bits in the respective BitSets as two space-separated
 * integers on a new line.
 * <h2>Input Format</h2>
 * <p>The first line contains <b><i>2</i></b> space-separated integers, <b><i>N</i></b> (the length of both BitSets
 * <b><i>B<sub>1</sub></i></b> and <b><i>B<sub>2</sub></i></b>) and <b><i>M</i></b>
 * (the number of operations to perform), respectively.
 * <h2>Output Format</h2>
 * <p>After each operation, print the respective number of set bits in BitSet <b><i>B<sub>1</sub></i></b> and
 * BitSet <b><i>B<sub>2</sub></i></b> as space-separated integers on a new line.
 */
public class JavaBitSet {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        System.out.println("""
                Enter data separated by spaces:
                - 1st line:         N (number of bits in the bitset) M (number of operation lines)
                - 2nd ... M+1 line: [Operation name] [bitset no.] [bitset no.]
                                    or
                                    [Operation name] [bitset no.] [index]
                """);

        int n = sc.nextInt(); // BitSet size
        int m = sc.nextInt(); // No. of bitset operations

        BitSet bs[] = {new BitSet(n), new BitSet(n)};

        for (int i = 0; i < m; i++) {

            String op = sc.next();

            int operand1 = sc.nextInt(), operand2 = sc.nextInt();
            Functions function = Functions.valueOf(op.toUpperCase());

            Operation operation = new Operation(function, operand1, operand2, bs);

            for (Methods method: Methods.values()) {
                BitSetOperations bitSetOperations = new BitSetOperations(method.name(), operation);
                if (bitSetOperations.operate()) break;
            }

            System.out.println(bs[0].cardinality() + " " + bs[1].cardinality());
        }
    }
}

enum Methods {BitBitSetOp, BooleanBitSetOp, AndNotBitSetOp} //BitBitSetOp, BooleanBitSetOp

record Operation(Functions function, int operand1, int operand2, BitSet[] bs) {}

enum Functions {AND, OR, XOR, FLIP, SET, ANDNOT}

abstract class BitSetOperation {
    private final Operation operation;

    BitSetOperation(Operation operation) {
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }

    abstract boolean bitsetOperate();
}

class BooleanBitSetOp extends BitSetOperation {
    public BooleanBitSetOp(Operation operation) {
        super((operation.function().name().equalsIgnoreCase("OR")
                || operation.function().name().equalsIgnoreCase("XOR")
                || operation.function().name().equalsIgnoreCase("AND"))
                ? operation
                : null);
    }

    @Override
    public boolean bitsetOperate() {
        if (super.getOperation() != null) {

            int operand1 = super.getOperation().operand1() - 1;
            int operand2 = super.getOperation().operand2() - 1;

            switch (Objects.requireNonNull(super.getOperation().function())) {
                case XOR -> super.getOperation().bs()[operand1]
                        .xor(super.getOperation().bs()[operand2]);
                case AND -> super.getOperation().bs()[operand1]
                        .and(super.getOperation().bs()[operand2]);
                case OR -> super.getOperation().bs()[operand1]
                        .or(super.getOperation().bs()[operand2]);
                default -> {return false;}
            }
            return true;
        }
        return false;
    }
}

class BitBitSetOp extends BitSetOperation {
    public BitBitSetOp(Operation operation) {
        super((operation.function().name().equalsIgnoreCase("FLIP")
                || operation.function().name().equalsIgnoreCase("SET"))
                ? operation
                : null);
    }

    @Override
    public boolean bitsetOperate() {
        if (super.getOperation() != null
                && (super.getOperation().function().name().equalsIgnoreCase("FLIP")
                || super.getOperation().function().name().equalsIgnoreCase("SET"))) {

            int operand1 = super.getOperation().operand1() - 1;
            int operand2 = super.getOperation().operand2();

            if (Objects.requireNonNull(super.getOperation().function()) == Functions.FLIP)
                super.getOperation().bs()[operand1].flip(operand2);
            else super.getOperation().bs()[operand1].set(operand2);

            return true;
        }
        return false;
    }
}

class BitSetOperations {
    private BitSetOperation bitSetOperation;

    public BitSetOperations(String className, Operation operation)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        String path = BitSetOperations.class.getPackage().getName();
        bitSetOperation = (BitSetOperation) Class.forName(path + "." + className)
                .getConstructor(Operation.class)
                .newInstance(operation);
    }

    public boolean operate() {
        return bitSetOperation.bitsetOperate();
    }
}


// New declaration
class AndNotBitSetOp extends BitSetOperation {
    public AndNotBitSetOp(Operation operation) {
        super((operation.function().name().equalsIgnoreCase("ANDNOT"))
                ? operation
                : null);
    }

    @Override
    public boolean bitsetOperate() {

        if (super.getOperation() != null
                && super.getOperation().function().name().equalsIgnoreCase("ANDNOT")) {
            int operand1 = super.getOperation().operand1() - 1;
            int operand2 = super.getOperation().operand2() - 1;

            super.getOperation().bs()[operand1]
                    .andNot(super.getOperation().bs()[operand2]);

            return true;
        }
        return false;
    }
}