package com.sessions.session25.challenges.solid1;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            Operation operation = new Operation(function, operand1, operand2);

            BitSetOperation bitSetOperation = switch (function) {
                case AND, ANDNOT, OR, XOR -> new BooleanBitSetOp(operation, bs);
                default -> new BitBitSetOp(operation, bs);
            };
            bitSetOperation.bitsetOperate();

            System.out.println(bs[0].cardinality() + " " + bs[1].cardinality());
        }
    }
}

abstract class BitSetOperation {
    private final Operation operation;
    private BitSet bs[];

    BitSetOperation(Operation operation, BitSet[] bs) {
        this.operation = operation;
        this.bs = bs;
    }

    public Operation getOperation() {
        return operation;
    }

    public BitSet[] getBs() {
        return bs;
    }

    abstract void bitsetOperate();
}

class BooleanBitSetOp extends BitSetOperation {
    public BooleanBitSetOp(Operation operation, BitSet[] bs) {
        super(operation, bs);
    }

    @Override
    public void bitsetOperate() {
        int operand1 = super.getOperation().operand1() - 1;
        int operand2 = super.getOperation().operand2() - 1;

        switch (super.getOperation().function()) {
            case XOR -> super.getBs()[operand1].xor(super.getBs()[operand2]);
            case AND -> super.getBs()[operand1].and(super.getBs()[operand2]);
            case ANDNOT -> super.getBs()[operand1].andNot(super.getBs()[operand2]);
            default -> super.getBs()[operand1].or(super.getBs()[operand2]);
        }
    }
}

class BitBitSetOp extends BitSetOperation {
    public BitBitSetOp(Operation operation, BitSet[] bs) {
        super(operation, bs);
    }

    @Override
    public void bitsetOperate() {
        int operand1 = super.getOperation().operand1() - 1;
        int operand2 = super.getOperation().operand2();

        switch (super.getOperation().function()) {
            case FLIP -> super.getBs()[operand1]
                    .flip(operand2);
            default -> super.getBs()[operand1]
                    .set(operand2);
        }
    }
}

class BitSetOperations {
    private BitSetOperation bitSetOperation;

    public BitSetOperations(BitSetOperation bitSetOperation) {
        this.bitSetOperation = bitSetOperation;
    }

    public void operate() {
        bitSetOperation.bitsetOperate();
    }
}

record Operation(Functions function, int operand1, int operand2) {}

enum Functions {AND, ANDNOT, OR, XOR, FLIP, SET}
