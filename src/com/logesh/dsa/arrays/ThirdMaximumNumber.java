package com.logesh.dsa.arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {

        Integer largest = null;
        Integer  secondLargest = null;
        Integer  thirdLargest = null;

        for(Integer num : nums){

            if(num.equals(largest) || num.equals(secondLargest) || num.equals(thirdLargest) ){
                continue;
            }

            if(largest == null || num > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            }

            else if(secondLargest == null || num > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = num;
            }

            else if(thirdLargest == null || num > thirdLargest){
                thirdLargest = num;
            }
        }

        return thirdLargest == null? largest : thirdLargest;
    }

    public static void main(String[] args){

        int[] nums = {2,2,3,1};

        System.out.println(thirdMax(nums));
    }

}
