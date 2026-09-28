
// Problem Link: https://takeuforward.org/arrays/implement-lower-bound/
// Example: nums = [1,2,4,4,5], target = 4 -> index 2
public class LowerBound {
    public static void main(String[] args) {
        int[] nums={1,2,4,4,5};
        int target=4;
        System.out.println(lowerBound(nums, target));
    }

    public static int lowerBound(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }
}
