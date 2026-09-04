package com.logesh.dsa.strings;

public class ValidPalindrome {
    static public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while (left < right){

            // skip non-alphanumeric characters from left
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            // skip non-alphanumeric characters from right
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            // compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase((s.charAt(right)))){
                return false;
            }

            left++;
            right--;


        }

        return true;
    }
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println("Is Palindrome: " + result);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

