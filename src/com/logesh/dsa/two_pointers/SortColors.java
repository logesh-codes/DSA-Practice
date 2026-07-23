package com.logesh.dsa.two_pointers;

import java.util.Arrays;

public class SortColors {
    public static int[] sortColorsBruteForce(int[] nums) {
        // O(n log n)
        Arrays.sort(nums);

        return nums;
    }

    public static int[] sortColorsOptimal(int[] nums) {
        //O(n)
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid <= high){

            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        //System.out.println("Brute Force:" + Arrays.toString((sortColorsBruteForce(nums))));

        System.out.println("Optimal:" + Arrays.toString((sortColorsOptimal(nums))));
    }
}
