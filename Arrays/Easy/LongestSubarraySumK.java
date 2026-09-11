// Problem Link: https://takeuforward.org/arrays/longest-subarray-sum-k/
// Find the length of the longest subarray with sum K (positive numbers).
// Example: nums = [1, 2, 1, 1, 1], k = 3 -> 3
public class LongestSubarraySumK {
    public static void main(String[] args) {
       int[] nums={1, 2, 1, 1, 1};
       int k=3;
    System.out.println(longestSubarray(nums, k));
    }

    public static int longestSubarray(int[] nums, int k) {
       int ans=0;
       int left=0;
       int sum=0;
       for (int right = 0; right < nums.length; right++) {
        sum+=nums[right];
        while(sum>k){
            sum-=nums[left];
            left++;
        }

        if(sum==k){
            ans=Math.max(ans, right-left+1);
        }
       }

       return ans;
    }
}
