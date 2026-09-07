package com.logesh.dsa.strings;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> sT = new HashMap<>();
        HashMap<Character,Character> tS = new HashMap<>();

        for (int i=0; i<s.length(); i++){

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // check s -> t
            if (sT.containsKey(sChar)){

                if (sT.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                sT.put(sChar,tChar);
            }

            // check t -> s
            if (tS.containsKey(tChar)){

                if (tS.get(tChar) != sChar){
                    return false;
                }
            }
            else{
                sT.put(tChar,sChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        boolean result = isIsomorphic(s, t);

        System.out.println("Is Isomorphic: " + result);
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


