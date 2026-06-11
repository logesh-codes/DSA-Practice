package hashing;

//pattern:hashing
//leetcode: no.217

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean bruteForce(int[] nums){
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1; j<nums.length ;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean optimal(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }


    public static void main(String args[]){
        int[] nums = {1,2,3,1};

        System.out.println("BruteForce:" + bruteForce(nums));

        System.out.println("optimal:" + optimal(nums));

    }


}
