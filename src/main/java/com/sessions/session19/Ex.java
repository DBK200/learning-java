package com.sessions.session19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<String> inputSting = new ArrayList<>(List.of("Ana", "elena", "book", "hats"));
        String result = twoSort(inputSting);
        System.out.println(result);



    }
    public static String twoSort(List<String> strings) {

        if (strings == null || strings.isEmpty()) {
            return " ";
        }
        strings.sort(String::compareTo);

        String firstSting = strings.get(0);

        StringBuilder formattedString = new StringBuilder();
        for (int i = 0; i < firstSting.length(); i++) {
            formattedString.append(firstSting.charAt(i));
            if (i < firstSting.length() - 1) {
                formattedString.append("***");
            }
        }
        return formattedString.toString();
    }

}
