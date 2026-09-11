// Problem Link: https://takeuforward.org/arrays/missing-number/
// Find the missing number from the range 0 to N.
// Example: nums = [3, 0, 1] -> 2
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={3, 0, 1};
        int xor1=0;
        int xor2=0;
        for (int i = 0; i < nums.length; i++) {
            xor1=xor1^nums[i];
            xor2=xor2^(i+1);
        }
        System.out.println(xor1^xor2);
    }
}
