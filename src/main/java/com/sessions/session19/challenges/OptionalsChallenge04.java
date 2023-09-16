package com.sessions.session19.challenges;

import java.util.*;

/**
 *   <h1>Challenge 4 (Suma numerelor întregi)</h1>
 *   Scrieți o metodă care primește două valori de tip {@code Optional} și calculează suma lor după cum urmează:<br>
 *   <ul><li>dacă ambele valori sunt prezente, returnează un {@code Optional} care conține rezultatul.</li>
 *   <li>dacă una dintre valori este absentă, returnează un {@code Optional} gol.</li></ul>
 **/

public class OptionalsChallenge04 {
    public static void main(String[] args) {

        Optional<Integer> op1 = Optional.ofNullable(25);
        Optional<Integer> op2 = Optional.ofNullable(null);
        OptionalsUtils.printOptional(OptionalsUtils.getOptionalValue(op1)
                        .concat(", ")
                        .concat(OptionalsUtils.getOptionalValue(op2)),
                getSum(op1, op2));
    }

    private static Optional<Integer> getSum(Optional<Integer> op1, Optional<Integer> op2){
        return (op1.isPresent() && op2.isPresent())
                ? Optional.of(op1.get() + op2.get())
                : Optional.empty();
    }

}
