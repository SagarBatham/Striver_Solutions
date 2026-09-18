// Problem Link: https://takeuforward.org/arrays/majority-element/
// Find the element that appears more than N / 2 times.
// Example: nums = [2, 2, 1, 1, 1, 2, 2] -> 2
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int ele:nums){
            if(count==0){
                candidate=ele;
            }else if(candidate==ele){
                count++;
            }else{
                count--;
            }
        }

        return candidate;
    }
}
