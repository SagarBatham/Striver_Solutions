// Problem Link: https://takeuforward.org/arrays/maximum-subarray-sum/
// Find the maximum sum of a contiguous subarray.
// Example: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4] -> 6
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
        }

        return maxSum;
    }
}
