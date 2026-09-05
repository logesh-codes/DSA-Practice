package com.logesh.dsa.strings;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        for (int i=0; i<s.length(); i++) {
            boolean isUnique = true;

            for (int j=0; j<s.length(); j++) {

                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";

        int result = firstUniqChar(s);

        System.out.println("First Unique Character Index: " + result);
    }
}

/*
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

