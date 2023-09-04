//7. Write a Java program to sort keys in Tree Map by using comparator.
package com.sessions.session14.Homework.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Exercise7 {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>(new sortKey());
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map);
    }
}

class sortKey implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
