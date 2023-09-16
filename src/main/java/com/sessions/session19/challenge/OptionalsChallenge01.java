package com.sessions.session19.challenge;

import java.util.*;

/**
*   <h1>Challenge 1  (Verificarea valorii nule)</h1>
*   Scrieți o metodă care primește un parametru de tip {@code String} și returnează un
 *  {@code Optional} ce conține valoarea în majuscule a parametrului, dacă acesta
 *  nu este null, sau un {@code Optional} gol în caz contrar.
**/


public class OptionalsChallenge01 {
    public static void main(String[] args) {

        OptionalsUtils.printOptional(null, getUpperCaseString(null));
        OptionalsUtils.printOptional("parameter", getUpperCaseString("parameter"));

    }

    private static Optional<String> getUpperCaseString(String value) {
        return Optional.ofNullable(value).isPresent()
                ? Optional.of(value.toUpperCase()) : Optional.empty();
    }
}
