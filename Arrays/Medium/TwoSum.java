// Problem Link: https://takeuforward.org/arrays/two-sum/
// Find two indices whose values add up to the target.
// Example: nums = [2, 7, 11, 15], target = 9 -> [0, 1]

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=9;
        int[] ans=twoSum(nums, target);
        System.out.println(ans[0]+" "+ans[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int secN=target-nums[i];
            if(map.containsKey(secN)){
                return new int[]{i,map.get(secN)};
            }
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
