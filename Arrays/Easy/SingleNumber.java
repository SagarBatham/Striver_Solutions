// Problem Link: https://takeuforward.org/arrays/single-number/
// Find the element that appears once when every other element appears twice.
// Example: nums = [4, 1, 2, 1, 2] -> 4
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
