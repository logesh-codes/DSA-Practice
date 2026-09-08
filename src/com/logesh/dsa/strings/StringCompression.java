package com.logesh.dsa.strings;

public class StringCompression {

    public static int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length){

            char current = chars[read];

            int count = 0;

            while (read < chars.length && current == chars[read]){

                count++;
                read++;
            }

            chars[write] = current;
            write++;

            if (count > 1){

                String countString = String.valueOf(count);

                for (int i=0; i<countString.length(); i++){
                    chars[write] = countString.charAt(i);
                    write++;
                }
            }
        }

        return write;
    }
    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int result = compress(chars);

        System.out.println("Compressed Length: " + result);

        for (int i = 0; i < result; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}

/*
  Time Complexity: O(n)
  Space Complexity: O(1)
 */
