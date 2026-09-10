// Problem Link: https://takeuforward.org/arrays/check-array-sort/
// Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.


// Example 1

// Input : nums = [1, 2, 3, 4, 5]

// Output : true

// Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.
public class CheckArraySort {
    public static void main(String[] args) {
        int[]nums = {1, 2, 3, 4, 5};
        System.out.println(isSorted(nums));
    }

    public static boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }

        return true;
    }
}
