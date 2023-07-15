/*

06.  The challenge is to implement 2 methods that takes two arguments as follows:
       {int compareTwoStrings(String str1, String str2)}
     and
       {int compareTwoStringsIgnoreCase(String str1, String str2)}
     that take 2 string arguments and compare these strings.

    The methods will act identical to Java's {int compareTo(String anotherString)} method
    and return the following:
    • a negative value (e.g., -1 ) if str1 < str2
    • 0 if str1 == str2
    • a positive value (e.g., +1 ) if str1 > str2

    Note:
      You're not allowed to use COMPARE methods from Java's String class.

 */

package com.sessions.session5;

public class StringsChallenge06 {
    public static void main(String[] args) {
        String str1 = "One quacK";
        String str2 = "One quack";
        System.out.printf("String 1: %s%n" +
                        "String 2: %s%n" +
                        "Case-sensitive strings comparison: %s%n" +
                        "Case-insensitive strings comparison: %s",
                str1, str2, compareTwoStrings(str1, str2),
                compareTwoStringsIgnoreCase(str1, str2));
    }

    public static int compareTwoStrings(String str1, String str2) {
        // Validation
        if (str1 == null && str2 != null) return -1;
        if (str2 == null && str1 != null) return Integer.MAX_VALUE;
        if (str2 == null) return Integer.MAX_VALUE;
        if (str1.length() < str2.length()) return -1;
        else if (str1.length() > str2.length()) return 1;
        else {
            for (int i = 0; i < str1.length(); i++) {
                char chChar1 = str1.charAt(i);
                char chChar2 = str2.charAt(i);
                if (chChar1 != chChar2) return 2;
            }
            return 0;
        }
    }

    public static int compareTwoStringsIgnoreCase(String str1, String str2) {

        if (str1.length() < str2.length()) return -1;
        else if (str1.length() > str2.length()) return 1;
        else {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            for (int i = 0; i < str1.length(); i++) {
                char chChar1 = str1.charAt(i);
                char chChar2 = str2.charAt(i);
                if (chChar1 != chChar2) return 2;
            }
            return 0;
        }
    }
}