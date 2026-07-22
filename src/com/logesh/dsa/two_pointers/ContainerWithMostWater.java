package com.logesh.dsa.two_pointers;

public class ContainerWithMostWater {

    public static int maxAreaBruteForce(int[] height) {
        int mostWater = 0;

        for (int i=0; i<height.length; i++){
            for (int j=i+1; j<height.length; j++){

                int h = Math.min(height[i], height[j]);
                int width = j - i;
                int area = h * width;

                mostWater = Math.max(mostWater, area);

            }
        }
        return mostWater;
    }

    public static int maxAreaOptimal(int[] height) {
        int left = 0;
        int right = height.length-1;
        int mostWater = 0;

        while (left < right){
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            mostWater = Math.max(mostWater, area);

            if (height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return mostWater;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println( "Brute Force:" + maxAreaBruteForce(height));

        System.out.println("Optimal:" + maxAreaOptimal(height));


    }

}
