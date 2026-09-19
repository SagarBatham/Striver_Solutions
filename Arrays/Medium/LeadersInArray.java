// Problem Link: https://takeuforward.org/arrays/leaders-in-array/
// Find elements greater than every element to their right.
// Example: nums = [10, 22, 12, 3, 0, 6] -> [22, 12, 6]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums={10, 22, 12, 3, 0, 6};
        System.out.println(leaders(nums));
    }

    public static List<Integer> leaders(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int idx=nums.length-1;
        ans.add(nums[idx]);
        for (int i = nums.length-2; i >=0; i--) {
            if(nums[i]>nums[idx]){
                idx=i;
                ans.add(nums[idx]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
