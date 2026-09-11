// Problem Link: https://takeuforward.org/arrays/left-rotate-by-one/
// Left rotate an array by one place.
// Example: nums = [1, 2, 3, 4, 5] -> [2, 3, 4, 5, 1]
public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int i=0;
        int j=nums.length-1;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+" ");
        }
    }
}
