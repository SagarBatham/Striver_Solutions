// Search for a target in a sorted array.
// Problem Link: https://leetcode.com/problems/binary-search/
// Example: nums = [-1,0,3,5,9,12], target = 9 -> index 4
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
       int low=0;
       int high=nums.length-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            high--;
        }else{
            low++;
        }
       }

       return -1;
    }
}
