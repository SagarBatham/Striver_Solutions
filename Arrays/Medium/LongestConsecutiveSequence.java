// Problem Link: https://takeuforward.org/arrays/longest-consecutive-sequence/
// Find the length of the longest consecutive sequence.
// Example: nums = [100, 4, 200, 1, 3, 2] -> 4

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums={100, 4, 200, 1, 3, 2};
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], false);
        }
        System.out.println(map.keySet());
        int ans=0;
        for(int key:map.keySet()){
            if(!map.containsKey(key-1)){
                map.put(key, true);
            }
            
            if(map.get(key)==true){
                int k=1;
                while(map.containsKey(key+k)){
                    k++;
                }
                ans=Math.max(ans,k);
            }
            System.out.println(key+" "+map.get(key));
        }
        System.out.println(ans);
    }

    
}
