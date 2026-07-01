package com.logesh.dsa.two_pointers;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n-1;
        int index = n-1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                ans[index] = leftSquare;
                left++;
            }else{
                ans[index] = rightSquare;
                right--;
            }
            index--;
        }

        return ans;
    }

    public static void main(String[] args){
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}

