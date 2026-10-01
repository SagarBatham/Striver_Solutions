// Find the minimum element in a rotated sorted array.
// Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Example: nums = [3,4,5,1,2] -> 1
public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= nums[high]) {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);;
    }
}
