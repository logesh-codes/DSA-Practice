package com.logesh.dsa.hashing;

import java.util.HashSet;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        //store nums1 elements
        for(int num : nums1){
            set.add(num);
        }

        //check nums2 elements with nums1 elements
        for(int num : nums2){
            if(set.contains(num)){
                resultSet.add(num);
            }
        }

        //store in array
        int[] result = new int[resultSet.size()];
        int i=0;
        for(int num : resultSet){
            result[i++] = num;
        }

        return result;
    }

    public static void main(String args[]){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};

        int[] result = intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}

