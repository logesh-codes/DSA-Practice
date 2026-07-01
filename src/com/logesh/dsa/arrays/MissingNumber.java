package com.logesh.dsa.arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int experted = n*(n+1)/2;
        int actual = 0;

        for(int num : nums){
            actual += num;
        }

        return experted - actual;
    }

    public static void main(String[] args){
        int[] nums = {3,0,1};

        System.out.println(missingNumber(nums));
    }

}
