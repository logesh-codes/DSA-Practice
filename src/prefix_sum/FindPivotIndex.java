package prefix_sum;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;

        // calculate total sum
        for(int num : nums){
            totalSum += num;
        }

        int leftSum = 0;
        // find pivot index
        for(int i=0; i<nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivotIndex(nums));
    }
}
