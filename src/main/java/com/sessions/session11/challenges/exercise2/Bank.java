package com.sessions.session11.challenges.exercise2;

public abstract class Bank {

    protected double balance;

    Bank(double balance) {
        this.balance = Math.max(balance, 0.0);
    }
    public abstract double getBalance();
}

class BranchA extends Bank {

    BranchA(double balance) {
        super(balance);
    }

    BranchA() {
        this(100.0);
    }

    @Override
    public double getBalance() {
        return super.balance;
    }
}
class BranchB extends Bank {

    BranchB(double balance) {
        super(balance);
    }

    BranchB() {
        this(150.0);
    }

    @Override
    public double getBalance() {
        return super.balance;
    }
}

class BranchC extends Bank {

    BranchC(double balance) {
        super(balance);
    }

    BranchC() {
        this(200.0);
    }

    @Override
    public double getBalance() {
        return super.balance;
    }
}

class Test {
    public static void main(String[] args) {
        Bank branchA = new BranchA();
        System.out.println("Balance get from BranchA: " + branchA.getBalance());
        Bank  branchB = new BranchB();
        System.out.println("Balance get from BranchB: " + branchB.getBalance());
        Bank  branchC = new BranchC();
        System.out.println("Balance get from BranchC: " + branchC.getBalance());
    }

}