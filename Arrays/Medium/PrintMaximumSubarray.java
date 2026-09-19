// Problem Link: https://takeuforward.org/arrays/print-maximum-subarray/
// Print the contiguous subarray with the maximum sum.
// Example: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4] -> [4, -1, 2, 1]
public class PrintMaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] idx=printMaxSub(nums);
        int start=idx[0];
        int end=idx[1];
        for(int i=start;i<=end;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int[] printMaxSub(int[] nums){
        int ans=0;
        int start=0;
        int end=0;
        int currSum=0;
        int bestStart=0;
        for (int right = 0; right < nums.length; right++) {
            currSum+=nums[right];
            if(currSum>ans){
                ans=currSum;
                bestStart=start;
                end=right;
            }
            if(currSum<0){
                currSum=0;
                start=right+1;
            }
            ans=Math.max(ans, currSum);
        }

        return new int[]{bestStart,end};
    }
}
