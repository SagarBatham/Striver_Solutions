// Find the first index whose value is greater than the target.
// Problem Link: https://takeuforward.org/arrays/implement-upper-bound/
// Example: nums = [1,2,4,4,5], target = 4 -> index 4
public class UpperBound {
    public static void main(String[] args) {
        int[] nums={1,2,4,4,5};
        int target=4;
        System.out.println(upperBound(nums, target));
    }

    public static int upperBound(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }
}
