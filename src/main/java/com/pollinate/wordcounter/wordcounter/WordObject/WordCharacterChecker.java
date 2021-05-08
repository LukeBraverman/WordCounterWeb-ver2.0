package com.pollinate.wordcounter.wordcounter.WordObject;

public class WordCharacterChecker {

    public static boolean isWordValid(String wordToCheck) {

        if (wordToCheck.equals("")) {
            return false;
        }
        char[] chars;
        chars = wordToCheck.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }



    }

