package com.sessions.session19.challenges;

import java.util.Optional;

/**
 *   <h1>Challenge 4 (Suma numerelor întregi)</h1>
 *   Scrieți o metodă care primește două valori de tip {@code Optional} și calculează suma lor după cum urmează:<br>
 *   <ul><li>dacă ambele valori sunt prezente, returnează un {@code Optional} care conține rezultatul.</li>
 *   <li>dacă una dintre valori este absentă, returnează un {@code Optional} gol.</li></ul>
 **/

public class OptionalsChallenge04 {
    public static void main(String[] args) {

        Optional<Integer> op1 = Optional.of(25);
        Optional<Integer> op2 = Optional.ofNullable(null);
        Utils.out.printOptional("The sum of %s is %s",
                Utils.out.getOptionalValue(op1, op2),
                getSum(op1, op2));
    }

    private static <T extends Number> Optional<Double> getSum(Optional<T> op1, Optional<T> op2){
        return (op1.isPresent() && op2.isPresent())
                ? Optional.of(op1.get().doubleValue() + op2.get().doubleValue())
                : Optional.empty();
    }
}
