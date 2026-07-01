package com.logesh.dsa.arrays;

import java.util.Arrays;

public class BuildArrayfromPermutation {

    public static int[] buildArray(int[] nums){
        int n= nums.length;

        for (int i=0; i<n; i++){
            nums[i] = nums[i] + ((nums[nums[i]]) % n) * n ;
        }

        for (int i=0; i<n; i++){
            nums[i] = nums[i] / n;
        }

        return nums;
    }

    public static void main(String[] args){
        int[] nums =  {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
