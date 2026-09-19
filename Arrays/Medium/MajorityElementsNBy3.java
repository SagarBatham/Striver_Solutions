// Problem Link: https://takeuforward.org/arrays/majority-elements-nby3/
// Find all elements that appear more than N / 3 times.
// Example: nums = [3, 2, 3] -> [3]

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsNBy3 {
    public static void main(String[] args) {
        int[] nums={3, 2, 3};
        majorityElement(nums).forEach(e->System.out.print(e+" "));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int cand1=0;
        int cand2=0;
        int c1=0;
        int c2=0;
        for(int e:nums){
            if(c1==0){
                cand1=e;
                c1=1;
            }else if(c2==0){
                cand2=e;
                c2=1;
            }else if(cand1==e){
                c1++;
            }else if(cand2==e){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        int count1=0;
        int count2=0;
        for(int e:nums){
            if(e==cand1){
                count1++;
            }

            if(e==cand2){
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            ans.add(cand1);
        }

        if (count2 > nums.length / 3) {
            ans.add(cand2);
        }


        return ans;
    }
}
