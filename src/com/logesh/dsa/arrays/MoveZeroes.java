package com.logesh.dsa.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums){
        int i = 0;
        for(int j=1; j<nums.length; j++){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }

    public static void main(String args[]){
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
