package com.sessions.session19.challenges;

import java.util.*;

/**
 *   <h1>Challenge 3 (Parsarea unui număr întreg)</h1>
 *   Scrieți o metodă care primește două valori de tip {@code Optional} și calculează suma lor
 *   dacă ambele valori sunt prezente, returnând un {@code Optional} care conține rezultatul.<br>
 *   Dacă una dintre valorile este absentă, returnează un {@code Optional} gol.
 **/

public class OptionalsChallenge03 {
    public static void main(String[] args) {

        String sValue = "--123456";
        sValue = "+00123";
        Utils.out.printOptional("", sValue, strToInt(sValue));
    }
    private static Optional<Integer> strToInt(String value) {
        try{
            return Optional.of(Integer.parseInt(value));
        }
        catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
