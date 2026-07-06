package com.logesh.dsa.hashing;

import java.util.HashMap;

public class SubarraySumEqualsK {
    // Brute Force
    public static int subarraySumbf(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];

                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        int count = 0;
        int sum = 0;

        for (int num : nums){
            sum += num;

            if (map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;

        //System.out.println(subarraySumbf(nums,k));
        System.out.println(subarraySum(nums, k));
    }
}
