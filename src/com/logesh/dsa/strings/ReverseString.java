package com.logesh.dsa.strings;

public class ReverseString {
    static public void reverseString(char[] s) {

        int left = 0;
        int right = s.length-1;

        while(left <= right){

            char temp = s[left];
            s[left] =  s[right];
            s[right] = temp;

            left++;
            right--;
        }

    }
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.println("Reversed String: " + new String(s));
    }

}

// Time Complexity: O(n)
// Space Complexity: O(1)
