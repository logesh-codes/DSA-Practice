package com.logesh.dsa.hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }

        int longest = 0;

        for (int num : set){

            // start only if its a beginning of the sequence
            if (!set.contains(num-1)){
                int current = num;
                int count = 1;

                // counting consecutive sequence
                while (set.contains(current + 1)){
                    current++;
                    count++;
                }

                // update the longest sequence length
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        //int[] nums = {100,4,200,1,3,2};
        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(nums));
    }

}
