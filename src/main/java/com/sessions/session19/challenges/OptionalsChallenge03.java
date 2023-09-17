package com.sessions.session19.challenges;

import java.util.*;

/**
 *   <h1>Challenge 3 (Parsarea unui număr întreg)</h1>
 *   Scrieți o metodă care primește un {@code String} și încearcă să îl parseze într-un număr întreg (Integer).
 *   Dacă parsarea este reușită, returnează un {@code Optional} care conține valoarea parsată;
 *   în caz contrar, returnează un {@code Optional} gol.
 **/

public class OptionalsChallenge03 {
    public static void main(String[] args) {

        String sValue = "--123456";
        //sValue = "abc"; // null
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
