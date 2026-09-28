// Find the first and last positions of a target in a sorted array.
// Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Example: nums = [5,7,7,8,8,10], target = 8 -> [3,4]
public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        // TODO: Add your solution.
    }

    public static int[] searchRange(int[] nums, int target) {
        int first=-1;
        int second=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                second=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        if(first==-1){
            return new int[]{-1,-1};
        }

        return new int[]{first,second};
    }
}
