package com.logesh.dsa.hashing;

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequentBruteForce(int[] nums, int k) {

        //Time Complexity = O(n log n)
        //Space Complexity = O(n)

        HashMap<Integer,Integer> map = new HashMap<>();

        for  (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for (int i=0; i<k; i++){
            result[i] = list.get(i);
        }

        return result;

    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequentBruteForce(nums, k)));

    }
}
