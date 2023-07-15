/*

02.  Read from system input a string of characters which can contain
     only letters and spaces (except for ENTER / newline).

     On second and third line read two words (i.e., w/o spaces),
     [oldWord] and [newWord].

     The challenge is to implement an algorithm to partially replace all occurrences
     of [oldWord] with [newWord], except for first and last ones.

     The rules are:
     1. if [oldWord] doesn't occur: nothing is replaced.
     2. if [oldWord] occurs once or twice: nothing is replaced (first and last occurrence).
     3. if [oldWord] occurs at least 3 times: replace all [oldWord] occurrences with [newWord],
        except for first and last ones.

 */


package com.sessions.session5;

import java.util.Scanner;

public class StringsChallenge02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter initial text: ");
        String sText = sc.nextLine();
        System.out.print("Please enter the look up word [oldWord]: ");
        String sOldWord = sc.next();
        sc.nextLine();
        System.out.print("Please enter the substitute word [newWord]: ");
        String sNewWord = sc.next();
        sc.nextLine();
        System.out.println("Initial text: " + sText);
        System.out.println("Old word: " + sOldWord);
        System.out.println("New word: " + sNewWord);
        System.out.println("Processed text: " + replaceWord(sText,sOldWord, sNewWord));
    }

    public static String replaceWord(String sText, String sOldWord, String sNewWord) {
        // This method changes all [sOldWord] occurrences in [sText] with [sNewWord],
        // except for first and last occurrence which remain unchanged.

        if (sOldWord.equals(sNewWord)) return sText;

        int i = indexOfWord(sText, sOldWord);
        // Occurrence found
        if (i > -1) {
            // Last occurrence of [sOldWord] in [sText]
            int j = indexOfWord(sText,sOldWord,false);

            // Only one occurrence, returns [sText] unchanged
            if (j == i) return sText;

            // Gets the text between FIRST and LAST [sOldWord] occurrence
            StringBuilder sbTemp = new StringBuilder(sText.substring(i + sOldWord.length(), j));

            int iOldWordLen = sOldWord.length();
            int k = indexOfWord(sbTemp.toString(), sOldWord);

            if (k > -1) {
                do {
                    sbTemp.delete(k, k + iOldWordLen);
                    sbTemp.insert(k, sNewWord);
                    k = indexOfWord(sbTemp.toString(), sOldWord);
                } while(k > -1);
            }
            else return sText;

            return sText.substring(0, i + sOldWord.length()) + sbTemp + sText.substring(j);
        }

        // default return
        return sText;
    }

    public static int indexOfWord(String sSourceText, String sLookUpText) {
        // Overloaded method
        return indexOfWord(sSourceText, sLookUpText, true);
    }

    public static int indexOfWord(String sSourceText, String sLookUpText, boolean bFirst) {
        // This method returns the [index] of first/last occurrence
        // of [sLookUpText] in [sSourceText], based on [bFirst] flag value:
        //  - [bFirst] true:  returns first occurrence
        //  - [bFirst] false: returns last occurrence
        //
        // An useful occurrence is when [sLookUpText] is present in [sSourceText]
        // and is preceded and followed by a white space.


        // Gets the first occurrence of [sLookUpText] in [sSourceText]
        // using {indexOf()}.
        int iIndex = (bFirst) ? sSourceText.indexOf(sLookUpText) :
                                sSourceText.lastIndexOf(sLookUpText);

        // ===================================================================
        // !!! Warning !!!
        // Returned result of {indexOf()} can very well be inside another word,
        // so additional work has to be carried out.
        // ===================================================================

        if (iIndex > -1) {
            int iLookUpLen = sLookUpText.length();
            do {
                if (iIndex == 0) {
                    if ( Character.isWhitespace(sSourceText.charAt(iLookUpLen)) )
                        return iIndex;
                }
                else {
                    if ( Character.isWhitespace(sSourceText.charAt(iIndex - 1))
                            && ( Character.isWhitespace(sSourceText.charAt(iIndex + iLookUpLen))
                                 || sSourceText.charAt(iIndex + iLookUpLen) == ','
                                 || sSourceText.charAt(iIndex + iLookUpLen) == '.'
                                 || (iIndex + iLookUpLen == sSourceText.length()) ) )
                        //  Returns [sLookUpText] position in [sSourceText]
                        return iIndex;
                }
                iIndex = bFirst ? sSourceText.indexOf(sLookUpText, ++iIndex) :
                                  sSourceText.lastIndexOf(sLookUpText, --iIndex);

            } while (iIndex > -1);
        }
        // Default return
        return iIndex;
    }

}
