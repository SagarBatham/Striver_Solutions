
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Link: https://takeuforward.org/arrays/four-sum/
// Find all unique quadruplets whose sum equals the target.
// Example: nums = [1, 0, -1, 0, -2, 2], target = 0 -> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
public class FourSum {
    public static void main(String[] args) {
        int[] arr={1,0,-1,0,-2,2};
        int target=0;
        Arrays.sort(arr);
        System.out.println(fourSum(arr, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                int low=j+1;
                int high=nums.length-1;
                while(low<high){
                    int sum=nums[i]+nums[j]+nums[low]+nums[high];
                    List<Integer> ll=new ArrayList<>();
                    if(sum==target){
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[low]);
                        ll.add(nums[high]);
                        ans.add(new ArrayList<>(ll));
                        low++;
                        high--;
                    }else if(sum<target){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return ans;
    }
}
