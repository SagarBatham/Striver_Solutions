// Problem Link: https://takeuforward.org/arrays/linear-search/
// Find the index of a target value using linear search.
// Example: nums = [2, 4, 1, 7], target = 1 -> index 2
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={2, 4, 1, 7};
        int target=1;
        System.out.println(linearSearch(nums, target));
    }

    public static int linearSearch(int nums[], int target) {
		for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
