package com.logesh.dsa.strings;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {

        int uppercaseCount = 0;

        for (int i=0; i<word.length(); i++){

            if (Character.isUpperCase(word.charAt(i))){
                uppercaseCount++;
            }
        }

        // All letter are capitals
        if (uppercaseCount == word.length()){
            return true;
        }

        // All letters are lower
        if (uppercaseCount == 0){
            return true;
        }

        // Only the first letter captial
        if (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        String word = "Google";

        boolean result = detectCapitalUse(word);

        System.out.println("Valid Capital Usage: " + result);
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

