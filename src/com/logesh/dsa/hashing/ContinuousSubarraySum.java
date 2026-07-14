package com.logesh.dsa.hashing;

public class ContinuousSubarraySum {
    public static boolean checkSubarraySumBruteForce(int[] nums, int k) {
        int n = nums.length;

        for (int i=0; i<n; i++){
            int sum = 0;
            for (int j=i; j<n; j++){
                sum += nums[j];

                if( (j - i + 1) >=2 && sum % k == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;

        System.out.println(checkSubarraySumBruteForce(nums,k));
    }
}
