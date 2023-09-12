package com.sessions.session17.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Challenge2 {
    int compare(char a, char b);

}

class Test2{
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.add('a');
        letters.add('x');
        letters.add('c');
        letters.add('f');
        letters.add('h');
        letters.add('q');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('i');
        letters.add('o');
        Challenge2 comparator = (char1, char2) -> char1 - char2;
        Collections.sort(letters, (char1, char2) -> comparator.compare(char1, char2));

        for (char letter : letters){
            System.out.println(letter + " ");
        }
    }

}
