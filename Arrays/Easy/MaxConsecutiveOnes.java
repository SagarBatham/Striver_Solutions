// Problem Link: https://takeuforward.org/arrays/max-consecutive-ones/
// Find the maximum number of consecutive 1s in a binary array.
// Example: nums = [1, 1, 0, 1, 1, 1] -> 3
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};

        int ans=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==1){
                count++;
            }

            if(nums[right]==0){
                count=0;
            }

            ans=Math.max(ans, count);
        }

        System.out.println(ans);
    }
}
